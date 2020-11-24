/*2. Write a Java program to compute the factorial of a number. The input value must be tested  for validity. If it is greater than 15, the method ComputeFactorial( ) should raise an  Userdefined Exception MyException with appropriate messages.*/
import java.util.Scanner;

class MyException extends Exception {
    int num;

    MyException(int x) {
        num = x;
    }

    public String toString() {
        return "Number Entered " + num + " is invalid.";
    }
}

class Factorial {
    static int ComputeFactorial(int n) throws MyException {
        if(n > 15){
            throw new MyException(n);
        }
        else{
        if (n == 0)
            return 1;
        else
            return (n * ComputeFactorial(n - 1));
        }
    }

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int i, fact = 1;
        System.out.println("Enter a number under 15:");
        int number = s.nextInt();
        try {
            fact = ComputeFactorial(number);
            System.out.println("Factorial of " + number + " is: " + fact);
            
        } 
        catch (MyException e) {
            System.out.println(e);
        }
       
    }
}