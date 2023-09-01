import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        boolean work = true;
        Scanner sc = new Scanner(System.in);

        while(work){
            System.out.println("Enter float number: ");
            try{
                float number = Float.parseFloat(sc.nextLine());
                System.out.printf("You enter %f\n", number);
                work = false;
            }catch (NumberFormatException e){
                System.out.println("You enter wrong number. Enter float number (example: 11.11).");
            }
        }
    }
}
