import java.util.Scanner;

class Age{
    int years;
    int months;
    String name;
    Scanner sc = new Scanner(System.in);
    
    Age(){}
    Age(String name, int years, int months){
        this.name = name;
        this.years = years;
        this.months = months;
        calcAge();
    }

    void setDetails(){
        System.out.print("Enter name of person: ");
        this.name = sc.nextLine();
        System.out.print("Enter no. of years: ");
        this.years = sc.nextInt();
        System.out.print("Enter no. of months: ");
        this.months = sc.nextInt();
        calcAge();
    }

    void calcAge(){
        if(months > 12){
            years += (months/12);
            months %= 12;
        }
    }

    int getYears(){
        return this.years;
    }

    int getMonths(){
        return this.months;
    }
    String getName(){
        return this.name;
    }

    
}

public class ExtraProgs52{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Age people[] = new Age[2];
        for(int i = 0;i<people.length;i++){
            people[i] = new Age();
            people[i].setDetails();
        }

        

        if(people[0].getYears() == people[1].getYears()){
            if(people[0].getMonths() > people[1].getMonths()){
                System.out.print(people[0].getName() + " is elder than " + people[1].getName());
            }else if(people[0].getMonths() == people[1].getMonths()){
                System.out.print(people[0].getName() + " and " + people[1].getName() + " have the same age!");
            }else if(people[1].getMonths() > people[0].getMonths()){
                System.out.print(people[1].getName() + " is elder than " + people[0].getName());
            }else{
                if(people[0].getYears() > people[1].getYears()){
                    System.out.print(people[0].getName() + " is elder than " + people[1].getName());
                }else{
                    System.out.print(people[1].getName() + " is elder than " + people[0].getName());
                }
            }
        }

    }
}