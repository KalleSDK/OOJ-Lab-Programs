
class Lol{
    void add(int a ,int b){
        System.out.print(a+b);
    }
    int add(int a, int b){
        return a+b;
    }
}

public class lmao {
    public static void main(String[] args) {
        Lol l = new Lol();
        l.add(1,2);
        
        int a = l.add(1,2);
        System.out.println(a);
    }
}
