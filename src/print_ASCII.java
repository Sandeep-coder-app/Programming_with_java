public class print_ASCII {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'C';

        int x = (int) a;
        int y = (int) b;


        System.out.println(x);
        System.out.println(y);

        System.out.println();

        for(int i = 0; i<255; i++)
        {
            System.out.println("ASCII "+i+" = "+(char)i);
        }
    }
}
