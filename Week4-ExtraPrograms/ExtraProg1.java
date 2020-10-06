import java.util.Scanner;

class Player {
    int id;
    String name;
    int no_matches_played;
    int scores[];
    int totalScore;
    Scanner sc = new Scanner(System.in);

    public Player(){
        id = 0;
        name = null;
    }

    public Player(int Id,String Name,int matchesPlayed,int score[]){
        this.id = Id;
        this.name = Name;
        this.no_matches_played = matchesPlayed;
        this.scores = score;
    }
    void calcTotalScore(){
        for(int i=0;i<no_matches_played;i++){
            totalScore += scores[i];
        }
    }

    void SetDetails(){
        
        System.out.print("Enter Name of Player: ");
        this.name = sc.nextLine();
        System.out.println("Enter ID of Player: ");
        this.id = sc.nextInt();
        System.out.println("Enter number of matches played: ");
        this.no_matches_played = sc.nextInt();
        scores = new int[this.no_matches_played];
        for(int i=0;i<no_matches_played;i++){
            System.out.println("Enter score in match " + (i+1) + ": ");
            scores[i] = sc.nextInt();
            totalScore += scores[i]; 
        }
    }
    
    void getDetails(){
        System.out.println("ID: " + id + " Name: " + name  + " Matches played: " + no_matches_played);
        for(int i=0;i<no_matches_played;i++){
            System.out.println("Score in match " + (i+1) + ": " + scores[i]);
        }
        System.out.println("Average score is " + calcAvg());
    }

    float calcAvg(){
        return (float)(totalScore/no_matches_played);
    }
    
     
}

public class ExtraProg1 {
    public static void main(String args[]) {
        int scores[] = {50,45,70};
        Player p1 = new Player(27,"Sravan",3,scores);
        p1.calcTotalScore();
        Player p2 = new Player();
        p2.SetDetails();
        
        if(p1.calcAvg() > p2.calcAvg()){
            p1.getDetails();
        }else{
            p2.getDetails();
        }

    }
}
