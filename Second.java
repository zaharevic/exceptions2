public class Second {
    public static void main(String[] args) {
        //Задание 2
        try {
            int[] intArray = {1,2,3,4,5,6,7,8,9};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.err.println("Catching exception: " + e);
        }
    }
}
