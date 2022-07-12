package Clock;

public class Clock {

    private int hour;
    private int minute;
    private int seconds;
    private int displayTime;

    public Clock() {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSecond() {
        return seconds;
    }

    public void setDisplayTime(int displayTime) {
        System.out.printf("%s%nThe time is: 09:45:31");
        this.displayTime = displayTime;
    }

}
