import java.util.Scanner;

 class LAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        double d,s1,s2;
        
        System.out.print("Enter values of a,b,c of a quadratic eqn: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        d = (double) ((b*b) - (4*a*c));
        if(a == 0){
            System.out.println("Invalid");
            return;
        }
        if(d < 0){
            System.out.println("No real solutions!");
        }else if(d == 0){
            s1 = (double) ((-b + Math.sqrt(d)) / (2 * a));
            s2 = (double) ((-b - Math.sqrt(d)) / (2 * a));
            System.out.printf("Roots are Real and Equal: %.4f and %.4f",s1,s2);
        }else{
            s1 = (double) ((-b + Math.sqrt(d)) / (2 * a));
            s2 = (double) ((-b - Math.sqrt(d)) / (2 * a));
            System.out.printf("Roots are Real and Disinct: %.4f and %.4f",s1,s2);
        }
    }
}
