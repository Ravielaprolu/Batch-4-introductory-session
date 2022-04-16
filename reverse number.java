Ravivarma assignment 
class Main {
    int x=2;
    public static void main(String[] args) {
       int i;
         Main a1=new Main();
       for (i=0;i<8;i++){
           System.out.print(i*a1.x);
           System.out.print("\n");
       }
    }
}
02
4
6
8
10
12
14
import java.util.Scanner;
class Electricity{
    int u=3;
    public static void(String[] args)
    {
      System.out.println("enter no.of units:");
      Scanner sc= new Scanner(System.in);
      int units=sc.nextInt();
      System.out.println("Bill amount is: ");
      int bill=units*u;
      System.out.println(bill);
      
    }
}
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    int reversed=0;
        Scanner sc=new Scanner(System.in); 
         int num = sc.nextInt();

    while(num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }

    System.out.println(reversed);
  }
}
123
321
class Employer{
    int a=3;
}
class Employee extends Employer{
    int b=10;
    public static void main(String[] args){
        Employee x=new Employee();
        System.out.println(x.a);
        System.out.println(x.b);
    }
}
java -cp /tmp/4pn4WZPMlF Employee
3
10
