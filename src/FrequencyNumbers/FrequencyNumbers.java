package FrequencyNumbers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class FrequencyNumbers {

    public static void main(String[] args) {
        int [] array = {10,20,20,10,10,20,5,20} ;
        int [] duplicate = new int[array.length];
        int [] counter = new int[array.length];
        int startIndex = 0;
        int count =1;

        Arrays.sort(array);
        for (int i=0; i<array.length-1 ; i++){
            if (array[i] == array[i+1]){
                count ++;
            }
            if (i+1 == array.length-1 ){
                duplicate[startIndex] = array[i];
                counter[startIndex] = count;
                break;
            }
            if(array[i] != array[i+1]){
                duplicate[startIndex] = array[i];
                counter[startIndex] = count;
                startIndex ++;
                count =1;
            }
        }
        System.out.println("Tekrar Sayıları");
        for (int r=0; r<duplicate.length ; r++){
            if(duplicate[r] !=0){
                System.out.println(duplicate[r] + " sayısı " + counter[r] + " kere tekrar edildi.");
            }

        }


    }

    }
