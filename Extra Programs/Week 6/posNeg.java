import java.util.Scanner;

public class posNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Full[],item;
        int len,pc=0,nc=0,zc=0;

        System.out.println("Enter length of array: ");
        len = sc.nextInt();

        Full = new double[len];

        for(int i = 0;i<Full.length;i++){
            System.out.println("Enter element " + (i+1));
            item = sc.nextDouble();
            Full[i] = item;
            if(item > 0){
                pc++;
            }else if(item == 0){
                zc++;
            }else{
                nc++;
            }
        }
        double pos[] = new double[pc];
        double neg[] = new double[nc];
        int j=0,k=0;

        for(int i = 0;i<Full.length;i++){
            if(Full[i] > 0){
                if(pc > 0){
                    pos[j] = Full[i];
                    j++;
                }else{
                    System.out.println("Len is 0");
                }
            }else{
                if(nc > 0){
                    neg[k] = Full[i];
                    k++;
                }else{
                    System.out.println("Len is 0");
                }
            }
        }
        System.out.println("Positive Count: " + pc);
        System.out.println("Negative Count: " + nc);
        System.out.println("Zero Count: " + zc);

    }    
}
