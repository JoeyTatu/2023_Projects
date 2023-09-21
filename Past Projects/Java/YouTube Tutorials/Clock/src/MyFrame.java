import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat hoursFormat, minutesFormat, secondsFormat, dayFormat, monthYearFormat, dayOfMonthFormat;
    JLabel timeLabel, dayLabel, monthYearLabel, dayOfMonthLabel;
    String time, hours, minutes, seconds, day, monthYear, dayOfMonth;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(255, 200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);


        hoursFormat = new SimpleDateFormat("H");
        minutesFormat = new SimpleDateFormat("mm");
        secondsFormat = new SimpleDateFormat("ss");


        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        this.add(timeLabel);

        //Day
        dayFormat = new SimpleDateFormat("EEEE");

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));
        this.add(dayLabel);

        //Date
        dayOfMonthFormat = new SimpleDateFormat("d");
        dayOfMonthLabel = new JLabel();
        dayOfMonthLabel.setFont(new Font("Ink Free", Font.PLAIN, 20));
        this.add(dayOfMonthLabel);

        monthYearFormat = new SimpleDateFormat("MMMM, yyyy");
        monthYearLabel = new JLabel();
        monthYearLabel.setFont(new Font("Ink Free", Font.PLAIN, 20));
        this.add(monthYearLabel);

        //Set
        this.setVisible(true);
        setTime();

    }

    private void setTime() {
        while (true) {
            //Time
            hours = hoursFormat.format((Calendar.getInstance().getTime()));
            minutes = minutesFormat.format((Calendar.getInstance().getTime()));
            seconds = secondsFormat.format((Calendar.getInstance().getTime()));


            if (hours.equals("0") && (minutes.equals("00")) && (seconds.equals("00"))) {
                hours = "24";
            }

            time = hours + ":" + minutes + ":" + seconds;
            timeLabel.setText(time);

            //Day
            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            //Date - day of month
            dayOfMonth = dayOfMonthFormat.format((Calendar.getInstance().getTime()));

            switch (dayOfMonth) {
                case "1", "21", "31" -> dayOfMonth = (dayOfMonth + "st");
                case "2", "22" -> dayOfMonth = (dayOfMonth + "nd");
                case "3", "23" -> dayOfMonth = (dayOfMonth + "rd");
                default -> dayOfMonth = (dayOfMonth + "th");
            }
            dayLabel.setText(dayOfMonth);

            //Date - month, year
            monthYear = monthYearFormat.format(Calendar.getInstance().getTime());
            monthYearLabel.setText(monthYear);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
