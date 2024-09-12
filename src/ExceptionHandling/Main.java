package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        System.out.println("Intro");
        System.out.println("Three types of errors: 1. Logical Error  2. Compile Time Errors  3. Run Time Error");

        System.out.println("\n\n# 1");
        System.out.println("i = 2;   <-- This is a normal statement");
        System.out.println("j = 18/i   <-- This is a critical statement\nwhat if the value of i = 0? then this'll throw an error. That's why we call these critical statements.\n");

        int i = 0;
        int j = 0;
        try {
            j = 18/i;
        }
        catch (Exception e) {
            System.out.println("I am an exception. And my name is \n" + e);
        }

        System.out.println("I will run even though j = 18/i. If there was no try catch written above me, I would've not run because the code is going to break at that time and it stops there");

        System.out.println("\n\n# 2");
        int nums[] = new int[5];
        try {
            System.out.println(nums[6]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("I am an exception. And my name is\n" + e);
        }
        catch (Exception e) {
            System.out.println("I am an exception. And my name is\n" + e);
        }

        System.out.println("\n\n# 3");
        System.out.println("Throw keyword. We can use it to create exceptions.");

        int a = 20;
        int b = 1;
        try {
            b = 17/20;
            if (b == 0)  {
                System.out.println("This will throw an error with the help of 'throw' keyword");
                System.out.println("Syntax is like this\nthrow new ArithmeticException();");
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException e) {
            System.out.println("\nHello. I am printed because im in arithmetic exception");
        }
        catch (Exception e) {
            System.out.println("Heyy I wont be printed because. because arithmetic exception is already called");
        }

        System.out.println("\n\n# 4");
        System.out.println("Watch this video");
        System.out.println("https://www.youtube.com/watch?v=V_jVp6WdW0Y&list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5&index=85");
        System.out.println("We can create our own custom exceptions. We have to create a class extended by Exception class first .");

        int c = 3;
        int d = 4;

        try {
            int z = c/d;
            if (z == 0)  {
                throw new SuryaException("I am called as a parameter when being thrown Surya Exception");
            }
        }
        catch (SuryaException e) {
            System.out.println("HEllo. I am Surya exception");
        }
        catch (Exception e) {
            System.out.println("I am the regular exception.");
        }


        System.out.println("\n\n# 5");
        System.out.println("watch this video");
        System.out.println("https://www.youtube.com/watch?v=hVQR0ZHFk-o&list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5&index=87");
    }
}
