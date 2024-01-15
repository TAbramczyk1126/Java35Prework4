public class Prework4TaskAdd5 {

    public static void main(String[] args) {

        int[][] arrayNumbers = {
                {5, 8, 2},
                {1, 6, 9},
                {4, 7, 3},
        };

        int[] maxInRows = findMaxInRows(arrayNumbers);

        displayArray(maxInRows);

        int[] minInColumns = findMinInColumns(arrayNumbers);

        displayArray(minInColumns);
    }

    public static int[] findMaxInRows(int[][] array) {
        int[] maxInRows = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int maxInRow = array[i][0];

            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > maxInRow) {
                    maxInRow = array[i][j];
                }
            }
            maxInRows[i] = maxInRow;
        }
        return maxInRows;
    }

    public static int[] findMinInColumns(int[][] array) {
        int[] minInColumns = new int[array[0].length];

        for (int j = 0; j < array[0].length; j++) {
            int minInColumn = array[0][j];

            for (int i = 1; i < array.length; i++) {
                if (array[i][j] < minInColumn) {
                    minInColumn = array[i][j];
                }
            }
            minInColumns[j] = minInColumn;
        }
        return minInColumns;
    }

    private static void displayArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
