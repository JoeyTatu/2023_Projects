from tkinter import messagebox
from bs4 import BeautifulSoup
from datetime import datetime
import feedparser
import tkinter as tk
import pytz

local_tz = pytz.timezone("Europe/Dublin")


def parse_datetime(date_string):
    try:
        dt = datetime.fromisoformat(date_string.replace("Z", "+00:00"))
        dt = dt.replace(tzinfo=pytz.utc)
        local_dt = dt.astimezone(local_tz)
        return local_dt.strftime("%Y-%m-%d %H:%M:%S")
    except Exception:
        return date_string


def fetch_weather_alerts(rss_feed_url):
    try:
        rss_data = feedparser.parse(rss_feed_url)
        alerts = []
        seen_alerts = set()

        for entry in rss_data.entries:
            title = entry.title.strip()

            # Parse the HTML description and extract plain text
            description_html = entry.description.strip()
            description_soup = BeautifulSoup(description_html, "html.parser")
            description = description_soup.get_text().strip()

            if (title, description) not in seen_alerts:
                date_string = entry.published.strip()
                date_readable = parse_datetime(date_string)

                alerts.append(
                    {"title": title, "description": description, "date": date_readable}
                )
                seen_alerts.add((title, description))

        return alerts
    except Exception as e:
        messagebox.showerror("Error", f"Error fetching weather alerts: {e}")
        return None


def show_weather_alerts(rss_feed_url):
    alerts = fetch_weather_alerts(rss_feed_url)
    if alerts:
        alerts_text = "\n\n".join(
            f"{alert['title']}:\nDate: {alert['date']}\n\n{alert['description']}"
            for alert in alerts
        )
        messagebox.showinfo("Weather Alerts", f"Weather Alerts:\n{alerts_text}")
    else:
        messagebox.showinfo("Weather Alerts", "No weather alerts found.")


def create_gui():
    root = tk.Tk()
    root.title("Meteoalarm Weather Alerts")

    label = tk.Label(
        root, text="Click the button to show weather alerts from Meteoalarm:"
    )
    label.pack(pady=10)

    rss_feed_url = "https://feeds.meteoalarm.org/feeds/meteoalarm-legacy-rss-ireland"

    button = tk.Button(
        root,
        text="Show Weather Alerts",
        command=lambda: show_weather_alerts(rss_feed_url),
    )
    button.pack()

    root.mainloop()


if __name__ == "__main__":
    create_gui()
