import java.util.Arrays;

public class CmdArray {
    public static void main(String[] args) {
        Double arr[];
        int n = 0;
        for(int i=0;i<args.length;i++){
            n++;
        }
        arr = new Double[n];
        for(int i=0;i<args.length;i++){
            arr[i] = Double.parseDouble(args[i]);
        }
        Arrays.sort(arr);
        System.out.format("Double array after sort: ");
        for(int i=0;i<arr.length;i++){
            System.out.format("%.2f ",arr[i]);
        }
    }    
}
