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
