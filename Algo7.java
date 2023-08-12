import java.util.Scanner;

public class Algo7 {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        String str;

        do{
            System.out.print("Enter sentence : ");
            str = scan.nextLine();
            if(str.isEmpty()){
                System.out.println("Invalid Input");
            }
        } while(str.isEmpty());

        String [] arr = str.split(" ");
        String min = arr[0];
        String max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(min.length()>arr[i].length()){
                min=arr[i];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if(max.length()<arr[i].length()){
                max=arr[i];
            }
        }

        System.out.println("Maximum length word : "+max);
        System.out.println("Minimum length word : "+min);
    }
}
