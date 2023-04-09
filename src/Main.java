import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the smaller number");
        int a = sc.nextInt();
        System.out.println("Please enter the larger number");
        int b = sc.nextInt();
        int i=a+1;
        while(b>i)
        {
            System.out.println(i);
            ++i;
        }
    }
}