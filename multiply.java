import java.util.Scanner;

public class multiply {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to multiply: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication Table for " +num);

        for (int i = 0; i < 20; i++)
        System.out.println(num + " x " +i+ " = " +(num * i));

    }
}
