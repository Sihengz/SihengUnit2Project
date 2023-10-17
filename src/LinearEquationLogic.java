import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner scan = new Scanner(System.in);
    private LinearEquation linEqn = new LinearEquation("(0, 0)", "(0, 0)");
    private boolean run = true;
    private String coord1;
    private String coord2;
    private double x;
    private String yesNo;


    public void start() {
        System.out.println("Welcome to the linear equation calculator!");
        while (run) {
            getLineInfo();
            if (linEqn.getX1() == linEqn.getX2()) {
                System.out.println("X are the same! Not a function");

            } else {
                System.out.println();
                System.out.println(linEqn.lineInfo());
                System.out.println();
                getOtherData();
                if (yesNo.equals("n")) {
                    run = false;
                    scan.close();
                }
            }
        }
    }
    private void getLineInfo() {
        System.out.print("Enter coordinate 1: ");
        coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        coord2 = scan.nextLine();
        linEqn.setFromPoints(coord1, coord2);
    }
    private void getOtherData() {
        System.out.print("Enter a value for x: ");
        x = scan.nextDouble();
        scan.nextLine();
        System.out.println();
        System.out.println("The point on the line is " + linEqn.coordinateForX(x));
        System.out.println();
        System.out.print("Would you like to enter another pair of coordinates? y/n: ");
        yesNo = scan.nextLine();

    }
}
