import java.util.Scanner;

public class factorial_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no: ");
        int num = sc.nextInt();

        int fact = 1;

        for(int i=1; i<=num; i++)
        {
            fact =fact * i;
        }

        System.out.println(num+" factorial no is "+fact);
    }
}
