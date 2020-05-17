package Day;

public enum DayOfWeek {
    SUNDAY(48),
    MONDAY(40),
    TUESDAY(32),
    WEDNESDAY(24),
    THURSDAY(16),
    FRIDAY(8),
    SATURDAY(0),
    Sunday(0);
    private int time;

    DayOfWeek(int time) {
        this.time = time;

    }
    public int getTime(){
        return time;
    }

}
