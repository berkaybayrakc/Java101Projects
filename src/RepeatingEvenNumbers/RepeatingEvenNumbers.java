package RepeatingEvenNumbers;

public class RepeatingEvenNumbers {
    static boolean isFind(int arr[],int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] array = {2,3,5,7,8,2,3,5,6,8,7,6} ;
        int [] duplicate = new int[array.length];
        int startIndex = 0;

        for (int i=0; i< array.length;i++){
            for (int j=0; j<array.length ; j++) {
                if((i !=j) && (array[i]==array[j]) && array[i]%2==0) {
                    if(!isFind(duplicate,array[i])) {
                        duplicate[startIndex] = array[i];
                        startIndex ++;
                    }
                    break;
                }
            }
        }
        for (int i:duplicate){
            if(i != 0){
                System.out.println(i);
            }
        }
    }
}
