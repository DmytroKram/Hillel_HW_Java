public class Task3_2 {
    public static void main(String[] args) {
        int[] array = new int[15];
        array = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 371, 34, 14, 17};
        System.out.print("Prime number:");
        for (int i = 0; i < array.length; i++) {
            boolean isIt = true;
            int a = array[i];
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    isIt = false;
                    break;
                }
            }if (isIt){
                System.out.print(a + ";");
            }
        }
    }
}