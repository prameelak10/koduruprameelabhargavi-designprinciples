import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        double value1,value2;
        char op,counter;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Enter First Value");
            value1 = sc.nextDouble();
            System.out.println("Enter Second Value");
            value2 = sc.nextDouble();
            System.out.println("Enter the operator");
            op = sc.next().charAt(0);
            Operations operationsDemo = new Operations(value1, value2);
            System.out.println("Result : ");
            operationsDemo.calculation(value1, value2, op);
            System.out.println("Do you want to continue? (Y/N)");
            counter = sc.next().charAt(0);
        } while (counter != 'n' && counter != 'N');
    }
}
