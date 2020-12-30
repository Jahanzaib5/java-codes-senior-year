import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public static final String[] MONTHS={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final String[] DAYS={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static final int[] DAYS_IN_MONTHS={31,29,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year%400==0;
    }

    public static boolean isValidDate(int year, int month, int day){
        boolean checkYear = year >=1 && year <= 9999;
        boolean checkMonth = month >= 1 && month <=12;
        boolean checkDay = day >=1 && day <=31;
        return checkDay && checkMonth && checkYear;
    }


    public static int getDayOfWeek(int year, int month,int  day){
        Calendar c = Calendar.getInstance();

        try {
            String dateString = String.format("%02d/%02d/%04d", day, month, year);
            c.setTime(new SimpleDateFormat("dd/M/yyyy").parse(dateString));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return c.get(Calendar.DAY_OF_WEEK)-1;
    }


    public MyDate(int year, int month, int day){
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day){
        if (!(isLeapYear(year))){
            DAYS_IN_MONTHS[1]=28;
        }
        if (!isLeapYear(year) && day==29){
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        if (isValidDate(year, month, day)){
            this.day=day;
            this.month=month;
            this.year=year;
        }else {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
    }

    public void setYear(int year) {
        if (year>=1 && year<=9999){
            this.year = year;
        }else{
            throw new IllegalArgumentException("Invalid year!");
        }
    }

    public void setMonth(int month) {
        if (month >=1 && month <= 12){
            this.month = month;
        }else {
            throw new IllegalArgumentException("Invalid month!");
        }
    }

    public void setDay(int day) {
        int checkMonth = getMonth();
        int dayMax = DAYS_IN_MONTHS[checkMonth-1];
        if (day>=1 && day<=dayMax){
            this.day = day;
        }else {
            throw new IllegalArgumentException("Invalid day!");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {

        String fin = "";
        fin= String.format("%s %d %s %d",
                DAYS[getDayOfWeek(getYear(), getMonth(), getDay())],
                getDay(), MONTHS[getMonth()-1], getYear());

        return fin;
    }

    public MyDate nextDay(){
        int checkDay = DAYS_IN_MONTHS[getMonth()-1];
        String checkMonth = MONTHS[getMonth()-1];
        int checkYear = getYear();
        int mCount=getMonth();
        if (checkDay==getDay()){
            checkDay=1;
            if (checkMonth.equals("Dec")){
                mCount=1;
                checkYear++;
            }else {
                mCount=getMonth()+1;
            }
        }else {
            checkDay=getDay()+1;
        }
        //System.out.println("year: "+getYear());
        //System.out.println("month: "+ mCount);
        //System.out.println("day: "+ checkDay);

        return new MyDate(this.year=checkYear, this.month=mCount, this.day=checkDay);
    }

    public MyDate nextMonth(){
        int checkDay = DAYS_IN_MONTHS[getMonth()-1];
        String checkMonth = MONTHS[getMonth()-1];
        int checkYear = getYear();
        int checkM=getMonth();
        int finDay=getDay();
        if (checkMonth.equals("Dec")){
            checkYear++;
            checkM=1;
            //checkDay = DAYS_IN_MONTHS[checkM-1];
        }else if (getDay()==31){
            checkM++;
            finDay=DAYS_IN_MONTHS[checkM-1];

        }else {
            checkM++;
            //checkDay = DAYS_IN_MONTHS[checkM];
        }
        return new MyDate(this.year=checkYear, this.month=checkM, this.day=finDay);
    }

    public MyDate nextYear(){
        int checkDay=getDay();
        if (isLeapYear(year) && checkDay==29){
            checkDay=28;}

        return new MyDate(this.year=getYear()+1, this.month=getMonth(), this.day=checkDay);
    }

    public MyDate previousDay(){
        int checkDay = getDay();
        String checkMonth = MONTHS[getMonth()-1];
        int checkYear = getYear();
        int mCount=getMonth();
        if (getDay()==1){
            checkDay=DAYS_IN_MONTHS[getMonth()-1];
            if (checkMonth.equals("Jan")){
                mCount=12;
                checkYear--;
            }else {
                mCount=getMonth()-1;
                checkDay=DAYS_IN_MONTHS[getMonth()-2];
            }
        }else {
            checkDay=getDay()-1;
        }
        //System.out.println("year: "+getYear());
        //System.out.println("month: "+ mCount);
        //System.out.println("day: "+ checkDay);

        return new MyDate(this.year=checkYear, this.month=mCount, this.day=checkDay);
    }

    public MyDate previousMonth(){
        int checkDay = DAYS_IN_MONTHS[getMonth()-1];
        String checkMonth = MONTHS[getMonth()-1];
        int checkYear = getYear();
        int checkM=getMonth();
        int finDay=getDay();
        if (checkMonth.equals("Jan")){
            checkYear--;
            checkM=12;
            //checkDay = DAYS_IN_MONTHS[checkM-1];
        }else if (getDay()==31){
            checkM--;
            finDay=DAYS_IN_MONTHS[checkM-1];

        }else {
            checkM--;
            //checkDay = DAYS_IN_MONTHS[checkM];
        }
        return new MyDate(this.year=checkYear, this.month=checkM, this.day=finDay);
    }

    public MyDate previousYear(){
        int checkDay=getDay();
        if (isLeapYear(year) && checkDay==29){
            checkDay=28;}
        if (isLeapYear(year-1)){
            checkDay=29;
        }

        return new MyDate(this.year=getYear()-1, this.month=getMonth(), this.day=checkDay);
    }
}
