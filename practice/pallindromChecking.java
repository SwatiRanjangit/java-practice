import java.util.Scanner;

public class pallindromChecking {
    static boolean isPallindrom(String str){
      int start = 0;
    int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
               return false;
            }else{
                start++;
                end--;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        str = s.nextLine();
        if(isPallindrom(str.toLowerCase())){
          System.out.println("String is pallindrom");
        }else{
         System.out.println("String is not pallindrom");
        }
    }
    
}
