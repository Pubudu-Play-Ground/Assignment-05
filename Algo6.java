import java.util.Scanner;

public class Algo6 {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        String str;
        String [] arr;

        do{

            System.out.print("Enter a Sentence : ");
            str = scan.nextLine();

            if (str.isEmpty()){
                System.out.println("Invalid Input");
                continue;
            }

            char [] charLetters = str.toCharArray();
            for (int i = 0; i < charLetters.length; i++) {
                if(charLetters[i]<0| charLetters[i]>127){
                    System.out.println("Invalid ASCII leteer");
                    break;
                }
            }

        } while(str.isEmpty());

        arr = str.split(" ");
        String [] temp = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[arr.length-1-i];
            
        }
        arr=temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
       
    }
}
