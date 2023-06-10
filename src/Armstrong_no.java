import java.util.Scanner;

public class Armstrong_no {
    public static boolean ArmstrongNumber(int number)
    {
        int N = number;
        int result = 0;
        int power = String.valueOf(number).length();

        while (number != 0)
        {
            int digit = number % 10;
            result += Math.pow(digit,power);
            number /= 10;
        }

        return result == N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int number = sc.nextInt();

        sc.close();

        if(ArmstrongNumber(number))
        {
            System.out.println("Armstrong no");
        } else {
            System.out.println("Not Armstrong no");
        }
    }
}
