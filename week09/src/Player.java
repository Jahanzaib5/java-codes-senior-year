//public class Player {
//    private int number;
//    private float x;
//    private float y;
//    private float z = 0.0f;
//
//    public Player(int number, float x, float y){
//        this.number=number;
//        this.x=x;
//        this.y=y;
//    }
//
//    public void move(float xDisp, float yDisp){
//        this.x+=xDisp;
//        this.y+=yDisp;
//    }
//
//    public void jump(float zDisp){
//        this.z=zDisp;
//    }
//
//    public Boolean near(Ball ball){
//        double check = Math.sqrt(Math.pow((this.x-ball.getX()),2) + Math.pow((this.y- ball.getY()),2) + Math.pow((this.z- ball.getZ()),2));
//        return check < 8;
//    }
//
//    public void kick(Ball ball){
//        if (!near(ball)){
//            move(ball.getX(), ball.getY());
//        }
//    }
//}
