import java.util.Scanner;

public class Algo5 {

    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        String text;
        char [] arr={};

        boolean isTrue = false;
        
        do{
            System.out.print("Enter a text : ");
            text = scan.nextLine();
            if(text.isEmpty()){
                System.out.println("Enter Valid Input");
                isTrue=true;
                continue;
            }
            arr = text.toCharArray();
            
            char [] temp = new char[arr.length];
            for (int i = 0; i < arr.length; i++) {

                if(arr[i]<0 | arr[i]>127){
                    System.out.println("Invalid ASCII letter");
                    isTrue=true;
                    break;
                }
                temp[i]=arr[arr.length-1-i];
            }
            arr=temp;

        } while(isTrue);

        String str = new String();
        String value = str.valueOf(arr);

        System.out.println(value);
        
    }
}
