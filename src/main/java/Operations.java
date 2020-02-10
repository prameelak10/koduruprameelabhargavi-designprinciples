public class Operations
{
    double value1,value2;
    Operations(double first, double second)
    {
        value1=first;
        value2=second;
    }
    void calculation(double value1, double value2, char exp)
    {
        if(exp=='+')
            System.out.println(value1 + value2);
        else if(exp=='*')
            System.out.println(value1 * value2);
        else if(exp=='-')
            System.out.println(value1 - value2);
        else if(exp=='/')
            System.out.println(value1 / value2);
        else if(exp=='%')
            System.out.println(value1 % value2);
        else
            System.out.println("Please Enter a Valid Operator");
    }
}
