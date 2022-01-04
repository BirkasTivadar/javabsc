package statements;

public class Time {

    private int hours;

    private int minutes;

    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getInSeconds() {
        int result = (this.getInMinutes() * 60) + seconds;
        return result;
    }

    public int getInMinutes() {
        int result = (hours * 60) + minutes;
        return result;
    }

    public boolean earlierThan(Time otherTime) {
        boolean result = this.getInSeconds() < otherTime.getInSeconds();
        return result;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
