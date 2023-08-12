import java.util.Arrays;

public class Algo8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, 7};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        int [] intersect = new int[0];
        int [] all = new int [0];
        loop:
        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if(numA[i]==numB[j]){

                    for (int a = 0; a < intersect.length; a++) {
                        if(intersect[a]==numA[i]){
                            continue loop;
                        }
                    }

                    int [] temp = new int[intersect.length+1];
                    for (int k = 0; k < intersect.length; k++) {
                        temp[k]=intersect[k];
                    }
                    temp[temp.length-1]=numA[i];
                    intersect=temp;
                    break;
                }
            }
        }
        System.out.println("Intersect array : "+Arrays.toString(intersect));

        loopall:
        for (int i = 0; i < numA.length+numB.length; i++) {
            if(i<numA.length){
                for (int j = 0; j < all.length; j++) {
                    if (numA[i]==all[j]){
                        continue loopall;
                    }
                }
                int [] temp = new int[all.length+1];
                for (int k = 0; k < all.length; k++) {
                    temp[k]=all[k];
                }
                temp[temp.length-1]=numA[i];
                all=temp;
            } else{
                for (int j = 0; j < all.length; j++) {
                    if (numB[i-numA.length]==all[j]){
                        continue loopall;
                    }
                }
                int [] temp = new int[all.length+1];
                for (int k = 0; k < all.length; k++) {
                    temp[k]=all[k];
                }
                temp[temp.length-1]=numB[i-numA.length];
                all=temp;
            }
        }
        System.out.println("All array : "+Arrays.toString(all));

        
    }
}
