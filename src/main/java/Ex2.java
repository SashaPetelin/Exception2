public class Ex2 {
    public static void main(String[] args) {
        Ex2();
    }
    public static void Ex2() {

        try {
            int d = 0;
            int[] array = new int[10];
            double catchedRes1 = array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
