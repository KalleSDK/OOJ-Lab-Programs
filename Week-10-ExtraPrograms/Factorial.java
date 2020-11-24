import java.util.Scanner;

class myException extends Exception{
    public myException(String s){
        super(s);
    }
}


public class Factorial {

    static int calculateFactorial(int n) throws myException{
        if(n > 15){
            throw new myException("Input is greater than 15");
        }
        if(n == 0){
            return 1;
        }else{
            return(n * calculateFactorial(n-1));
        }
    }
    public static void main(String[] args){
        int n,fact = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural number: ");
        n = sc.nextInt();
        try{
            fact = calculateFactorial(n);
        }catch(myException e){
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
