public class Task3_1 {
    public static void main(String[] args) {
        int[] array = {25, 28, 31, 478, 56, 453, 385, 381, 796, 100, 112, 127, 13};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Even number "+ array[i]+ ' ');
            } else if (array[i] % 2 != 0) {
                System.out.print("Odd number "+ array[i] + ' ');
                }
        }
    }
}


