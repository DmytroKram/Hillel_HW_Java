public class Task6_2 {
    public static void main(String[] args){
        int n = 13;
        System.out.println("n = " + n + ", numbers from 1 to n: " + recursionNum(n) + ".");
    }

    public static String recursionNum(int n){
        if (n == 1) {
            return "1";
        } else {
            return recursionNum(n - 1) + ";" + n;
        }

    }
}