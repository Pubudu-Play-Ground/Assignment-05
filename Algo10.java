import java.util.Scanner;

public class Algo10 {
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        boolean isTrue;

        do{

            System.out.print("Enter your phone number : ");
            String number = scan.nextLine();
            isTrue=false;

          
            if (number.startsWith("0")){
                if(number.length()==11){

                    if(number.charAt(3)=='-'){
                        char[] arr = number.toCharArray();
                        for (int i = 0; i < arr.length; i++) {
                            if(i==3){
                                continue;
                            }else{

                                if(Character.isDigit(arr[i])){
                                    continue;
                                }else{
                                    System.out.println("Enter correct phone number");
                                    isTrue=true;
                                    break;
                                }
                            }
                        }
                    } else{
                        System.out.println("Enter correct phone number in correct Order");
                        isTrue=true;
                        break;
                    }
                    
                } else{
                    System.out.println("Enter correct phone number");
                    isTrue=true;
                }
            } else if (number.startsWith("+94")){
                if(number.length()==15){
                    if(number.charAt(3)==' '&&number.charAt(6)==' '&&number.charAt(10)==' '){

                        char[] arr = number.toCharArray();
                        for (int i = 1; i < arr.length; i++) {
                            if(i==3||i==6||i==10){
                                continue;
                            } else{
                                if(Character.isDigit(arr[i])){
                                    continue;
                                }else{
                                    System.out.println("Enter correct phone number");
                                    isTrue=true;
                                    break;
                                }
                            }


                            
                        }
                    } else{
                        System.out.println("Enter correct phone number in correct Order");
                        isTrue=true;
                        break;
                    }

                } else{
                    System.out.println("Enter correct phone number");
                    isTrue=true;
                }
            } else if(number.isBlank()){
                System.out.println("Telephone number can't be empty.");
                isTrue=true;
            } else{
                System.out.println("Invalid input");
                isTrue=true;
            }

        } while(isTrue);

        System.out.println("The number is validated");
            
    }
}
