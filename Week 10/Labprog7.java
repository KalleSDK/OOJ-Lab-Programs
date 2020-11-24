class myGen<A,B>{
    A obj1;
    B obj2;
    myGen(A obj1, B obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print(){
        System.out.println(this.obj1);
        System.out.println(this.obj2);
    }
}

public class Labprog7{
    public static void main(String[] args) {
        myGen<String,Integer> myObj = new myGen<String, Integer>("Test", 25);
        myGen<Character,Double> myObj2 = new myGen<Character, Double>('X',420.00);
        myObj.print();
        myObj2.print();
    }
}