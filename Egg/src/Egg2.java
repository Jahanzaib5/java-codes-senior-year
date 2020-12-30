public class Egg2 {
    public static void main(String[] args){
        top();
        altBottom();
        top();
        altBottom();
        bottom();
        top();
        middle();
        bottom();
    }

    public static void top(){
        System.out.println("  _______\n /       \\\n/         \\");
    }

    public static void bottom(){
        System.out.println("\\         /\n \\_______/\n");
    }

    public static void altBottom(){
        System.out.println("\\         /\n \\_______/\n-\"-'-\"-'-\"-");
    }

    public static void middle(){
        System.out.println("-\"-'-\"-'-\"-");
    }
}
