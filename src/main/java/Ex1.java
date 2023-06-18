import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Exc1();
    }

    private static float Exc1() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите дробное число: ");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Неверно введено число");
            }
            scanner.close();
        }
    }
}
