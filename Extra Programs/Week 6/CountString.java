import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int v = 0,c = 0,s = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i) ;
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                v++;
            }else if(str.charAt(i) == ' '){
                s++;
            }else{
                c++;
            }
        }
        System.out.println("Number of vowels: " + v); 
        System.out.println("Number of spaces: " + s); 
        System.out.println("Number of consonants: " + c); 
    }
}
