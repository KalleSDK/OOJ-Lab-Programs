import java.util.Scanner;

class Operators {
    double operand1=0,operand2=0,result1=0,result2=0;
    Operators(){}
    void arithmetic(double operand1, double operand2){
        System.out.println("Arithmetic Operations: ");
        result1 = operand1 + operand2;
        result2 = operand1 - operand2;
        System.out.printf("%.2f + %.2f is %.2f\n",operand1,operand2,result1);
        System.out.printf("%.2f - %.2f is %.2f\n",operand1,operand2,result2);
    }

    void logical(double a, double b){
        result1 = (a == b || b == 5);
        result2 = (a == b && b == 5);
        
        System.out.println("Result of (a == b || b == 5): " + result1);
        System.out.println("Result of (a == b || b == 5): " + result2);
    }

    void relational(double operand1, double operand2){
        result1 = (operand1>operand2);
        result2 = (operand1 == operand2);

        if(result1 == 1){
            System.out.println("Op1 is greater Op2");
        }else{
            System.out.println("Op1 is not greater Op2");
        }

        if (result2 == 1){
            System.out.println("Op1 is equal to Op2");
        }else{
            System.out.println("Op1 is not equal to Op2");
        }
    }

    void assignment(double operand1, double operand2){
        operand1+=1;
        operand2-=1;
        result1 = operand1;
        result2 = operand2;
        System.out.println("After Op1+=1 the result is: " + (result1));
        System.out.println("After Op2-=1 the result is: " + (result2));;
    }
}


public class OperatorMenu {
    public static void main(String[] args) {
        int iter = 0;
        int choice;
        int a,b;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter a and b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        Operators op = new Operators(a,b);

        while(true){
            if(iter > 2){
                System.exit(0);
            }
            System.out.println("1. Arithmetic\n2. Logical\n3. Relational\n4. Arithmetic Assignment");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:{
                    op.arithmetic(a, b);
                    iter++;
                    break;
                }
                case 2:{
                    op.logical(a, b);
                    iter++;
                    break;
                } 
                case 3:{
                    op.relational(a, b);
                    iter++;
                    break;
                }
                case 4:{
                    op.assignment(a, b);
                    iter++;
                    break;
                }
                default: System.exit(0); 
                    
            }
        }
    }
    
}
