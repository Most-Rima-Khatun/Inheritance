import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Clock {
    private String hours,minutes,time;

    public String getHours()
    {
        final int HOUR_START = 11;
        return currentTime().substring(HOUR_START, HOUR_START + 2);
    }

    public String getMinutes()
    {
        final int MINUTE_START = 14;
        return currentTime().substring(MINUTE_START, MINUTE_START + 2);
    }

    public String getTime()
    {
        return getHours() + ":" + getMinutes();
    }
    private String currentTime()
    {
        return LocalDateTime.ofInstant(Instant.now(),
                ZoneId.systemDefault()).toString();
    }

    //String timeString = LocalDateTime.ofInstant(Instant.now(),
           // ZoneId.systemDefault()).toString();
}
