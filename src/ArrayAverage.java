public class ArrayAverage {
    public static void main(String[] args) {
        double[] array = {1,2,3,4,5};
        double sum = 0;
        for (int i =0; i< array.length;i++) {
            sum = sum + (1 / array[i]);
        }
        System.out.println(array.length / sum);
    }
}
