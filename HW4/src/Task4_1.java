public class Task4_1 {
 public static void main(String[] args) {
        int[] arrayN = {1, 2, 56, 78, 69, 94, 39, 2};
       int[] arrayK = {56, 78, 69};

       int i = arrayN.length - 1;
       int j = arrayK.length - 1;

        while (i >= 0 && j >= 0) {
            if (arrayN[i] == arrayK[j]) {
                i--;
                j--;
            } else {
                i--;
            }
        }
        if (j == -1) {
            System.out.println("arrayK is a part of arrayN");
        } else if (j != -1 & i == -1) {
            System.out.println("arrayK is not a part of arrayN");
        }
    }
}
