public class Task6_3 {
    public static void main(String[] args){
        int n = 131313;
        System.out.println("n = " + n + ", sum digits of a number: " + recursionSum(n) + ".");
    }

    public static int recursionSum(int n){
        if (n < 10) {
            return n;
        } else {
            return n % 10 + recursionSum(n / 10);
        }

    }
}



