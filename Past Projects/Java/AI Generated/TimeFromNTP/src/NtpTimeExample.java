import org.apache.commons.net.ntp.*;

import java.net.InetAddress;
import java.time.*;

public class NtpTimeExample {
    public static void main(String[] args) {
        String ntpServer = "0.ie.pool.ntp.org";

        try {
            NTPUDPClient ntpClient = new NTPUDPClient();
            ntpClient.open();
            InetAddress inetAddress = InetAddress.getByName(ntpServer);
            TimeInfo timeInfo = ntpClient.getTime(inetAddress);
            ntpClient.close();

            // Get the NTP transmit time (in milliseconds since January 1, 1900)
            long ntpTime = timeInfo.getMessage().getTransmitTimeStamp().getTime();

            // Convert NTP time directly to Unix timestamp (in seconds since January 1, 1970)
            long unixTime = ntpTime / 1000;

            // Get the local time based on the system's default time zone
            ZonedDateTime localTime = Instant.ofEpochSecond(unixTime).atZone(ZoneId.systemDefault());

            // Display the local time
            System.out.println("Unix time: " + unixTime);
            System.out.println("Local time: " + localTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
