import java.util.Scanner;

public class prime_no {

    static boolean checkPrime(int number)
    {
        if(number <= 1)
        {
            return false;
        }

        for(int i=2; i<number; i++)
        {
            if(number%2==0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no: ");
        int n = sc.nextInt();

        boolean value = checkPrime(n);

        if(value)
            System.out.println(n+" is prime number");
        else
            System.out.println(n+" is not prime number");
    }
}
