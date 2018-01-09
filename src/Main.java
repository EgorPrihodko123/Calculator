import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calculator(num1, num2, operation);
        System.out.println("Ответ: " + result);
    }
    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        num = scanner.nextInt();
        return num;
    }
    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        operation = scanner.next().charAt(0);
        return operation;
    }
    public static int calculator(int num1, int num2, char operation) {
        int result;
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
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция невозможна, попробуйте еще раз:)");
                result = calculator(num1, num2, getOperation());
        }
        return result;
    }
}
