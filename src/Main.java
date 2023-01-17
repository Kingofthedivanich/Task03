import java.util.Scanner;

public class Main {
    public static final Test T1 = new Test(3, 3, SimpleColor.WHITE);
    public static final Test T2 = new Test(0, 3, SimpleColor.BLUE);
    public static final Test T3 = new Test(-4, 2, SimpleColor.GREEN);
    public static final Test T4 = new Test(-1, -3, SimpleColor.YELLOW);
    public static final Test T5 = new Test(0, -6, SimpleColor.BLUE);
    public static final Test T6 = new Test(-4, -2, SimpleColor.GREY);
    public static final Test T7 = new Test(6, -1, SimpleColor.GREY);
    public static final Test T8 = new Test(-8, -8, SimpleColor.BLUE);


    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        T1.isCorrectAnswer();
        T2.isCorrectAnswer();
        T3.isCorrectAnswer();
        T4.isCorrectAnswer();
        T5.isCorrectAnswer();
        T6.isCorrectAnswer();
        T7.isCorrectAnswer();
        T8.isCorrectAnswer();


        double userX = sc.nextDouble();
        double userY = sc.nextDouble();


        if (((userX >= -10) && (userX <= 10)) && ((userY >= -10) && (userY <= 10))) {
            System.out.println(PointColor.getColor(userX, userY));
        }
        else{
            System.out.println("Введите значения от -10 до 10");
        }
    }
}