import java.util.Date;

public class AlarmCLock {
  private int hours,minutes,time;
    public int getHours() {

        String timeStr = new Date().toString().split(" ")[3];

        int hour = Integer.parseInt(timeStr.split(":")[0]);

        return hour;

    }

    public int getMinutes() {

        String timeStr = new Date().toString().split(" ")[3];

        int minute = Integer.parseInt(timeStr.split(":")[1]);

        return minute;

    }

    public String getTime() {

        return String.format("%02d:%02d", getHours(), getMinutes());

    }
}
