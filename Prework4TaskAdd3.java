public class Prework4TaskAdd3 {

    public static void main(String[] args) {

        System.out.println(getLargest(new int[]{88, 72, 22, 33}));
    }

    public static int getLargest(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max)
                max = number;
        }
        return max;
    }
}
