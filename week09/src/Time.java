public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
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

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.second=second;
        this.hour=hour;
        this.minute=minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public Time nextSecond(){
        int checkSec = getSecond();
        int checkHour=getHour();
        int checkMin=getMinute();
        if (checkSec == 59){
            checkMin++;
            checkSec=0;
            if (checkMin==60){
                checkHour++;
                if (checkHour>23){
                    checkHour=0;
                }
            }
        }else {
            checkSec++;
        }

        return new Time(checkHour, checkMin, checkSec);
    }

    public Time previousSecond(){
        int checkSec = getSecond();
        int checkHour=getHour();
        int checkMin=getMinute();
        if (checkSec == 0){
            checkSec=59;
            checkMin--;
            if (checkMin<0){
                checkMin=59;
                checkHour--;
                if (checkHour<0){
                    checkHour=23;
                }
            }
        }else {
            checkSec--;
        }

        return new Time(checkHour, checkMin, checkSec);
    }
}
