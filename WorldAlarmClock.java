public class WorldAlarmClock extends AlarmClock {

    private int offset;

    public WorldAlarmClock(int offset) {

        this.offset = offset % 24;

    }

    @Override

    public int getHours() {

        int hr = super.getHours();

        hr += offset;

        if (hr > 23) {

            hr = hr - 24;

        }

        else if (hr < 0) {

            hr = hr + 24;

        }

        return hr;

    }



}