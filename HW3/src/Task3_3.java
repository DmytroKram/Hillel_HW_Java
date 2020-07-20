public class Task3_3 {
    public static void main(String [] args) {
        int[] arrayFib = new int [20];
        System.out.print("Fibonacci numbers:");
        for (int i=0; i< arrayFib.length; i++) {
            if (i<2) {
                arrayFib [i] = 1;
            }
            else {
                arrayFib [i]=arrayFib [i-2] + arrayFib [i-1];
            }
            System.out.print(arrayFib [i]+" ");
        }
    }
}
