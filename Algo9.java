import java.util.Scanner;

public class Algo9 {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        String str;
        boolean isTrue;

        do{
            System.out.print("Enter a single word : ");
            str = scan.nextLine();
            isTrue=false;
            if(str.isBlank()){
                System.out.println("Invalid input");
                isTrue=true;
                continue;
            }
            String [] c = str.split(" ");
            if(c.length>1){
                System.out.println("Invalid input");
                isTrue=true;
                continue;
            }

        } while(isTrue);

        boolean Palindrome = true;

        char [] wordchar = str.toCharArray();
        for (int i = 0; i < wordchar.length/2; i++) {
            if(wordchar[i]!=wordchar[wordchar.length-1-i]){
                Palindrome=false;
                break;
            }
        }
        if(Palindrome==true){
            System.out.println("It's a Palindrome");
        } else{
            System.out.println("It's not a palindrome");
        }    
    }
}
