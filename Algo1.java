import java.util.Scanner;

public class Algo1{
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        int [] arr= new int[0];
        do{

            System.out.print("Enter a Number : ");
            num = scan.nextInt();
            scan.nextLine();
            if (num<=0){
                System.out.println("Enter Positive number");
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
        } while(num<=0);

        
    }
}