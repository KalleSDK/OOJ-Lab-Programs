import java.util.Scanner;

public class CircleDemo {
    double radius = 0,area = 0,perimeter = 0;
    Scanner sc = new Scanner(System.in);
    void setDetails(){
        System.out.println("Enter the radius: ");
        this.radius = sc.nextDouble();    
    }
    void findPerimeter(){
        this.perimeter = 2 * Math.PI * radius;
    }    
    void findArea(){
        this.area = Math.PI * Math.pow(radius, 2);
    }
    
    void getDetails(){
        System.out.println("Radius: " + radius);
        System.out.format("Perimeter: %.2f\n",perimeter);
        System.out.format("Area: %.2f\n",area);
    }

    public static void main(String[] args) {
        CircleDemo crDemo = new CircleDemo();
        crDemo.setDetails();
        crDemo.findPerimeter();
        crDemo.findArea();
        crDemo.getDetails();
    }
}
