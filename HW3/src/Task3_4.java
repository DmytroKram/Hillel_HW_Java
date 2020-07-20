public class Task3_4 {
    public static void main(String [] args) {
        int[] arrayMinMax = {45, 21, 38, 457, 56, 6, 7, 8, 98, 10, 11, 1111, 134};
        int max = arrayMinMax [0];
        int min = arrayMinMax [0];
        for(int i = 0; i < arrayMinMax.length; i++) {
            if(arrayMinMax[i] >= max){
                max= arrayMinMax[i];
            }
            else if (arrayMinMax[i] <= min){
                min= arrayMinMax[i];
            }
            }
        System.out.println("Bigest number: " +max);
        System.out.println("Least  number: " +min);
        }
}
