public class Task4_2<array> {
    public static void main(String[] args) {
        int[] array = {134, 456, 120, 454906, 8, 3457, 5678, 4};
        insertionSort(array);
        System.out.println("Shortest number in array: " + array[0] + " ,its length is "
                + lengthNumber(array[0]));
        System.out.println("The longest number in the array: " + array[array.length - 1] + " ,its length is "
                + lengthNumber(array[array.length - 1]));
    }
    private static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
        int current = array[i];
        int j = i - 1;
        while(j >= 0 && current < array[j]) {
            array[j+1] = array[j];
            j--;
        }
            array[j+1] = current;
        }
        return array;
    }
    private static int lengthNumber(int number) {
        if (number < 0) {
            number *= -1;
        }
        int N = 0;
        while (number != 0) {
            number /= 10;
            ++N;
        }
        return N;
    }

}
