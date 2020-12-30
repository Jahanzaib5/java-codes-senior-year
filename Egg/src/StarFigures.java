public class StarFigures {
    public static void main(String[] args){
        lines();
        star();
        System.out.println();
        lines();
        star();
        lines();
        System.out.println();
        asterisk();
        lines();
        star();
    }

    public static void star(){
        System.out.println(" * *\n  *\n * *");
    }

    public static void lines(){
        System.out.println("*****\n*****");
    }

    public static void asterisk(){
        System.out.println("  *\n  *\n  *");
    }
}
