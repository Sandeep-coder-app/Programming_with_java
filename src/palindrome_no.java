import java.util.Scanner;

public class palindrome_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you three digit no: ");
        int num = sc.nextInt();

        int sum = 0,r,temp;
        temp = num;
        while(num > 0)
        {
            r = num%10;
            sum = (sum*10)+r;
            num = num/10;
        }

        if(temp == sum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not Palindrome number");
    }
}
