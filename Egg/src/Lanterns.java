public class Lanterns {
    public static void main(String[] args){
        pyramid();
        System.out.println();
        pyramid();
        design();
        bigLine();
        pyramid();
        System.out.println();
        pyramid();
        smallLine();
        design();
        design();
        smallLine();
        smallLine();
    }

    public static void pyramid(){
        System.out.println("    *****\n  *********\n*************");
    }

    public static void design(){
        System.out.println("* | | | | | *");
    }

    public static void smallLine(){
        System.out.println("    *****");
    }

    public static void bigLine(){
        System.out.println("*************");
    }
}
