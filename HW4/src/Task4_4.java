public class Task4_4 {
    public static void main(String[] args) {
        int k = 35;
        int a = 1;
        int N = 0;
        double s= Math.sqrt(k);
        if (s % 1.0 == 0.0 ){
            N = (int) s;
        } else {
            N = (int) s;
            ++N;
        }
        for (int i = N; i > 0; i--) {
            for (int i1 = N; i1 > 0; i1--)
            { System.out.print ("  "+ a++);
                if (a>k){
                    break;
                }
                }
            System.out.println();
        }
    }
}
