import java.util.Scanner;

class myGen{

    public <A extends Comparable<A>> void getLargest(A a, A b, A c){
        A max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        System.out.println("Largest number is " + max);
    }

    public <A extends Number> void add(A a, A b, A c){
        if(a.getClass() == Integer.class){
            System.out.println("Addition of the numbers is " + (a.intValue()+b.intValue()+c.intValue()));
        }else{
            System.out.println("Addition of the numbers is " + (a.doubleValue()+b.doubleValue()+c.doubleValue()));
        }
    }
}



public class AddGen {
    public static void main(String[] args) {
        int a, b, c;
        double x, y,z;
        Scanner sc = new Scanner(System.in);
        myGen gen = new myGen();
        

        System.out.println("Enter 3 integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        gen.getLargest(a, b, c);
        gen.add(a, b, c);
        

        System.out.println("Enter 3 Doubles: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        gen.getLargest(x, y, z);
        gen.add(x, y, z);

    }
    
}
