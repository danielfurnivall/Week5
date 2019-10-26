import java.util.InputMismatchException;
import java.util.Scanner;
public class week5Q1 {
    public static void main(String[] args) {
        Boolean flag = false;
        Scanner test = new Scanner(System.in);
        while (flag == false) {
            String out1 = test.nextLine();
            Scanner test2 = new Scanner(out1);

            try {
                int x = test2.nextInt();
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: This is not an integer");

            } finally {

            }

        }
    }
}