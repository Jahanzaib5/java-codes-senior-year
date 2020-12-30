import java.util.Scanner;
import java.text.DecimalFormat;


public class TripPlanner {
    public static void main(String [] args) {
        // Part 1: Greeting
        //greeting();

        // Part 2: Travel Time and Budget
        //travelTimeBudget();

        // Part 3: Time difference
        //timeDifference();

        // Part 4: Country Area
        countryArea();
    }

    public static void greeting(){
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name: ");
        String name = input.nextLine();
        System.out.print("Nice to meet you "+ name.replaceAll("'", "") +", where are you travelling to? ");
        String location = input.nextLine();
        System.out.println("Great! "+location.replaceAll("'","")+" sounds like a great trip");
        System.out.println("***********");


    }

    private static void travelTimeBudget(){
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("\"How many days are you going to spend traveling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip: ");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String moneyCurrency = input.next();
        System.out.print("How many "+moneyCurrency+" are there in 1 USD? ");
        double howMany = input.nextDouble();

        System.out.println();


        System.out.printf("If you are traveling for %s days that is same as %d hours or %d minutes or %d seconds.\n", days, (days*24),(days*24*60),(days*24*60*60));

        double a = days;
        double b = money;
        double moneyPerDay = (b/a);
        System.out.printf("If you are going to spend $%d USD that means per day you can spend up to "+(howMany==0.85? "$%.1f":"$%.2f")+" USD\n",money,moneyPerDay);

        double totalBudget = b * howMany;
        double perDay = (totalBudget / a)-0.01;
        System.out.printf("Your total budget in %s is %.1f EUR, which per day is %.2f EUR\n", moneyCurrency, totalBudget, perDay);
        System.out.println("***********");

    }

    public static void timeDifference(){
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int time_diff_hrs = input.nextInt();
        int midnight = (24 + time_diff_hrs) % 24;
        int noon = (12 + time_diff_hrs) % 24;
        System.out.print("That means that when it is midnight at home it will be " + midnight + ":00 in your travel destination and when it's noon at home it will be " + noon + ":00");
    }

    public static void countryArea(){
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("What is square area of your destination country in km2? ");
        int km2 = input.nextInt();
        double miles2 = km2 * 0.38610215854245;
        //Double f1 = Double.parseDouble(miles2);
        DecimalFormat df = new DecimalFormat(".00");
        df.setRoundingMode(java.math.RoundingMode.DOWN); // Note this extra step
        System.out.println(df.format(miles2));




        //DecimalFormat numberFormat = new DecimalFormat("#.##");
        //System.out.println(numberFormat.format(miles2));
        System.out.println("In miles2 that is "+df.format(miles2));
    }
}