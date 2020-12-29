import java.util.Scanner;

public class Transpose {
    public static void main(String args[]) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of m and n: ");
        m = sc.nextInt();
        n = sc.nextInt();
        int arr[][] = new int[m][n];
        int arrT[][] = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter value of Row: " + (i+1) + " Column: " + (j+1));
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                arrT[i][j] = arr[j][i];
            }
        }
        System.out.println("Matrix before: ");
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.format("%d ",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matrix after transpose: ");
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.format("%d ",arrT[i][j]);
            }
            System.out.println();
        }


    }

}
