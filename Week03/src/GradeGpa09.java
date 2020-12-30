import java.util.Scanner;

public class GradeGpa09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double goo = input.nextDouble();
        int grade = input.nextInt();
        String outputGrade = "";
        if(grade>=93 && grade <=100){
            outputGrade = "A 4.0";
        }else if(grade >=90 && grade <=92){
            outputGrade = "A- 3.67";
        }else if(grade >=87 && grade <=89){
            outputGrade = "B+ 3.33";
        }else if(grade >=83 && grade <=86){
            outputGrade = "B 3.0";
        }else if(grade >=80 && grade <=82){
            outputGrade = "B- 2.67";
        }else if(grade>=77 && grade <=79){
            outputGrade = "C+ 2.33";
        }else if(grade>=70 && grade<=76){
            outputGrade = "C 2.0";
        }else if(grade>=60 && grade<=69){
            outputGrade="D 1.0";
        }else if(grade>=0 && grade <= 50){
            outputGrade = "F 0.0";
        }

        System.out.printf(outputGrade);
    }
}
