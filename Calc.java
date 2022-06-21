import java.util.Scanner;

public class Calc {

    private static double num1;
    private static double num2;

    public static double add(double num1, double num2)
    {
        return num1 + num2;
    }

    public static double sub(double num1, double num2)
    {
        return num1 - num2;
    }

    public static double mul(double num1, double num2)
    {
        return num1 * num2;
    }

    public static double div(double num1, double num2)
    {
        return num1 / num2;
    }

    public static double per(double num1, double num2)
    {
        double per = ((num1 + num2) * 100) / 200;
        return per;
    }

    public static double pow(double num1, double num2)
    {
        int pow = (int)num2;
        double res = 1;
        for(int i = 0; i < pow; i++)
        {
            res = res * num1;
        }
        return res;
    }

    public static void main(String[] args) {
        
        System.out.println("Hello...");
        System.out.println("yo.....");

        Scanner s = new Scanner(System.in);
        while (1 == 1) 
        {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Power");
            System.out.println("0. Exit");
            int func = s.nextInt();
            switch(func)
            {
                case 1:
                {
                    System.out.println("Enter num1:");
                    num1 = s.nextDouble();
                    System.out.println("Enter num2:");
                    num2 = s.nextDouble();
                    double res = add(num1, num2);
                    System.out.println(res);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter num1:");
                    num1 = s.nextDouble();
                    System.out.println("Enter num2:");
                    num2 = s.nextDouble();
                    double res = sub(num1, num2);
                    System.out.println(res);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter num1:");
                    num1 = s.nextDouble();
                    System.out.println("Enter num2:");
                    num2 = s.nextDouble();
                    double res = mul(num1, num2);
                    System.out.println(res);
                    break;
                }
                case 4:
                {
                    System.out.println("Enter num1:");
                    num1 = s.nextDouble();
                    System.out.println("Enter num2:");
                    num2 = s.nextDouble();
                    double res = div(num1, num2);
                    System.out.println(res);
                    break;
                }
                case 5:
                {
                    System.out.println("Enter num1:");
                    num1 = s.nextDouble();
                    System.out.println("Enter num2:");
                    num2 = s.nextDouble();
                    double res = per(num1, num2);
                    System.out.println(res);
                    break;
                }
                case 6:
                {
                    System.out.println("Enter num1:");
                    num1 = s.nextDouble();
                    System.out.println("Enter num2:");
                    num2 = s.nextDouble();
                    double res = pow(num1, num2);
                    System.out.println(res);
                    break;
                }
                case 0:
                {
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Enter a Valid Function.");
                    break;
                }
            } 

            
        }

    }

}
