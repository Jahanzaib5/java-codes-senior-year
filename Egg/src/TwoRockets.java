public class TwoRockets {
    public static void main(String[] args){
        topper();
        middle();
        label();
        middle();
        bottom();

    }

    public static void topper(){
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }

    public static void label(){
        System.out.println("|  KG  | |  KG  |");
        System.out.println("|Soonun| |Soonun|");
    }

    public static void middle(){
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }

    public static void bottom(){
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");

    }

}
