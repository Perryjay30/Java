package Exercise8_7;

public class Time2Modification {

    private int hour;
    private int minute;
    private int second;

    public Time2Modification() {
        this(0, 0, 0);
    }
    public Time2Modification(int hour) {
        this(hour, 0, 0);
    }
    public Time2Modification(int hour, int minute) {
        this(hour, minute, 0);
    }
    public Time2Modification(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be greater than 0 and less than 24");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if (second < 0 || second>= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time2Modification(Time2Modification time) {
        this(time.hour, time.minute, time.second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be greater than 0 and less than 24");
        }
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        if (second < 0 || second>= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be greater than 0 and less than 24");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second>= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.second = second;
    }


    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int increaseHour(int hour) {
        int count = 0;
        for(int i = 1; i <= hour; i++)
            count++;
            if (hour < 0 || hour >= 24) {
                throw new IllegalArgumentException("hour must be greater than 0 and less than 24");
            }
            return count;
    }

    public int increaseMinute(int minute) {
        int count = 0;
        for(int i = 1; i <= minute; i++)
            count++;
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        return count;
    }

    public int tick(int second) {
        int count = 0;
        for(int i = 1; i <= second; i++)
            count++;
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        return count;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%02d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}

