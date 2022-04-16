//Finding SquareRoot of the sum of the numbers
import java.util.Scanner;
class Main{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,s=0;
        System.out.println("Enter 10 integers:");
        for(i=0;i<10;i++)
        {
            n=sc.nextInt();
            s=s+n;
        }
        System.out.println("Sum of the numbers:"+s);
        System.out.println("Square root of sum:"+Math.sqrt(s));
    }
}

//13th Table
class Main{
    public static void main(String[] args)
    {
    int i,N=13;
    System.out.println("13 th table:");
    for(i=1;i<=10;i++)
    {
        System.out.println(N+"*"+i+"="+N*i);
    }
    }
}