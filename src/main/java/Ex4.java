import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Exc4();
    }

    public static void Exc4() {
        System.out.print("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (!str.isEmpty()){
            System.out.println("Данные в строке: " + str);
        } else {
            throw new RuntimeException("Пустая строка");
        }
    }
}
