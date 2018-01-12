import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double num1 = getInt();
        double num2 = getInt();
        char operation = getOperation();
        double result = calculator(num1, num2, operation);
        System.out.println("Ответ: " + result);
    }
    public static double getInt() {
        System.out.println("Введите число:");
        double num;
        num = scanner.nextDouble();
        if(num=='='){
            System.exit(0);
        }
        return num;
    }
    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        operation = scanner.next().charAt(0);
        return operation;
    }
    public static double calculator(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '=':
                result=0;
                System.exit(0);
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                int percent;
                System.out.println("Введите процент");
                percent = scanner.nextInt();
                result=(num1+num2)/100*percent;
                break;
            default:
                System.out.println("Операция невозможна, попробуйте еще раз:)");
                result = calculator(num1, num2, getOperation());
        }
        return result;
    }
}
