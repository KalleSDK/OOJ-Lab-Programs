class myGen<A,B,C>{
    A obj1;
    B obj2;
    C obj3;
    myGen(A obj1, B obj2, C obj3){
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void print(){
        System.out.println(obj1.getClass().getName() + " :: " + this.obj1);
        System.out.println(obj2.getClass().getName() + " :: " + this.obj2);
        System.out.println(obj3.getClass().getName() + " :: " + this.obj3);
    }
}

public class Labprog7{
    public static void main(String[] args) {
        myGen<String,Integer,Double> myObj = new myGen<>("Test", 25, 35.2020);
        myGen<Character,Double,Boolean> myObj2 = new myGen<>('X',420.00, false);
        myObj.print();
        myObj2.print();
    }
}