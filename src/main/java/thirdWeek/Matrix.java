package thirdWeek;

public class Matrix {
    private int rows;
    private int columns;
    private int[][] array;

    // Первый конструктор
    public Matrix(int x, int y) {
        rows = x;
        columns = y;
        array = new int[rows][columns];
    }

    public Matrix(int ar[][]) {
        array = ar;
        rows = array.length;
        columns = array[0].length;
    }

    public int[][] getMatrix() {
        return array;
    }

    public void sumMatrix() {
        int sum = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) sum += array[i][j];
        System.out.println("Сумма элементов матрицы: " + sum);
    }

    public void sizeMatrix() {
        System.out.println("Произведение количества строк "
                + "и столбцов: " + rows * columns);
    }


    // Метод заполнения массива случайными числами от 1 до 9
    public static void fillMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 9 + 1);
            }
        }
    }

    // Метод вывода массива на консоль
    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
                if (j == array[0].length - 1) System.out.println();
            }
    }

}