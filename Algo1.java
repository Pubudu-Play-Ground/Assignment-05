import java.util.Scanner;

public class Algo1{
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String input;
        int num;
        boolean isTrue;
        
        loop1:
        do{
            isTrue=false;

            System.out.print("Enter a Number : ");
            input = scan.nextLine();


            char[]arr=input.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                if(!Character.isDigit(arr[i])){
                    System.out.println("Invalid input");
                    isTrue=true;
                    continue loop1;
                }
            }
            num = Integer.valueOf(input);

            if (num<=0){
                System.out.println("Enter Positive number");
                isTrue=true;
                continue;
            }

            int a=1;
            int b=1;
            
            do{
                int c=b;
                b+=a;
                a=c;
                if (b>num){
                    break;
                }
                System.out.print(b+" ");

            } while(b<num);

            System.out.println();
        } while(isTrue);
        
    }
}