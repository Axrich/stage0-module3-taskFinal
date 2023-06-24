package lang.print.gaps.finalModuleTask;

public class DivisionByZero {
    public static void main(String[] args) {
        Double number = 10.0;
        if (number != 0.0) {
            System.out.println(number / 0);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
