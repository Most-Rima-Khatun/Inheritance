public class RunnerAlarmCLock {
    public static void main(String[] args) {


        Clock clock = new Clock();

        WorldClock worldClock = new WorldClock(12);

        System.out.println(clock.getTime());

        System.out.println(worldClock.getTime());

    }

}


