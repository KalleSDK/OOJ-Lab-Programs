import java.util.Scanner;

class Actor {
    int id,no_of_movies,no_of_years_exp;
    String name;
    double average_performace;
    static double bestAvgPerformance = 0;
    static String bestActorName;

        Actor(int id,String name,int totalMovies,int totalYears){
        this.id=id;
        this.name=name;
        this.no_of_movies=totalMovies;
        this.no_of_years_exp=totalYears;
        calcPerf();
        if(this.average_performace > bestAvgPerformance){
            bestAvgPerformance = this.average_performace;
            bestActorName = this.name;
        }
    }

    void calcPerf(){
        average_performace = (no_of_movies/no_of_years_exp);
    }
}


public class ActorMain {
    public static void main(String[] args) {
        Actor a1 = new Actor(1,"Robert Pattinson",25,14);
        Actor a2 = new Actor(2,"Johnny Sins",420,69);
        Actor a3 = new Actor(3,"Al Pacino",50,53);
        System.out.println("Actor with best average performance: " + Actor.bestActorName);
        
    }
}
