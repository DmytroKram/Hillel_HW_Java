public class Task4_3 {
    public static void main(String[] args) {
        int[] array = {123, 334, 567, 234, 121, 3333, 12};
        for (int i = 0; i < array.length; i++) {
            if (checkN(array[i])) {
                System.out.println(array[i]);
            }
        }
    }
    public static boolean checkN(int number) {
        while (number > 0) {
            int j = number % 10;
            for (int i = number / 10; i > 0; i = i / 10)
                if (i % 10 == j)
                    return false;
            number = number / 10;
        }
        return true;
    }
}
