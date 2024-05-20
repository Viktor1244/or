

public class main6 {
    public static void main(String[] args) {
        int[][] ar = {{6, 3, 1, 23}, {6, 11411, 123}};

//        int[] maxElements = task3(ar);
//        for (int i = 0; i < maxElements.length; i++) {
//            System.out.println("Максимальный элемент или Минамальный элемент в " + (i + 1) + "-м ряду: " + maxElements[i]);
//        }
        System.out.println("Сума елементів кожного рядка: " + task5(ar));
        printArray(task6(ar));

        System.out.println();



    }
    public static int task1(int[][] ar1) {

        int ng = 0;
        for (int i = 0; i < ar1.length; i++) {
            for (int j = 0; j < ar1[i].length; j++) {
                ng += ar1[i][j];
            }

        }
        return ng;
    }


    public static int task2(int[][] ar2) {

        int sum = 0;
        int count = 0;

        for (int i = 0; i < ar2.length; i++) {
            for (int j = 0; j < ar2[i].length; j++) {
                sum += ar2[i][j];
                count++;
            }
        }

        int i = 0;
        if (count != 0) {
            i = sum / count;
        } else {
            return 0;
        }

        return i;
    }



    public static int[] task3(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];


            for (int j = 1; j < arr[i].length; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

            arr[i][0] = max;
        }



        int[] maxElements = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            maxElements[i] = arr[i][0];
        }
        return maxElements;
    }


    public static int[] task4(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];


            for (int j = 1; j < arr[i].length; j++) {

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

            arr[i][0] = min;
        }



        int[] minElements = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            minElements[i] = arr[i][0];
        }
        return minElements;
    }


    public static int task5(int[][] ar2) {
        int totalSum = 0;
        for (int i = 0; i < ar2.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < ar2[i].length; j++) {
                rowSum += ar2[i][j];
            }
            totalSum += rowSum;
        }
        return totalSum;
    }




    public static int[][] task6(int[][] ar2) {

        if (ar2.length < 2) {
            System.out.println("Масив має менше двох рядків. Заміна неможлива.");
            return ar2;
        }


        int[][] result = new int[ar2.length][ar2[0].length];
        for (int i = 0; i < ar2.length; i++) {
            result[i] = ar2[i].clone();
        }
        int[] temp = result[0];
        result[0] = result[1];
        result[1] = temp;

        return result;
    }


    public static int[][] task7(int[][] ar2, int row1, int row2) {
        if (row1 >= 0 && row1 < ar2.length && row2 >= 0 && row2 < ar2.length) {
            int[][] result = new int[ar2.length][];
            for (int i = 0; i < ar2.length; i++) {
                result[i] = ar2[i].clone();
            }
            int[] temp = result[row1];
            result[row1] = result[row2];
            result[row2] = temp;
            return result;
        } else {
            System.out.println("Один або обидва з індексів рядків недійсні. Заміна неможлива.");
            return ar2;
        }
    }

    public static int task8(int[][] ar2) {
        int sum = 0;
        for (int i = 0; i < ar2.length; i++) {
            boolean hasNegative = false;
            for (int j = 0; j < ar2[i].length; j++) {
                if (ar2[i][j] < 0) {
                    hasNegative = true;
                    break;
                }
            }
            if (hasNegative) {
                for (int j = 0; j < ar2[i].length; j++) {
                    sum += ar2[i][j];
                }
            }
        }
        return sum;
    }



    public static int task9(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    public static int task10(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

    public static void task11(int[] array) {
        int nextNumber = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = nextNumber;
                nextNumber++;
            }
        }
    }


    public static boolean task12(int[][] matrix) {
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            leftDiagonalSum += matrix[i][i];
            rightDiagonalSum += matrix[i][n - i - 1];
        }

        return leftDiagonalSum == rightDiagonalSum;
    }


    public static int  task13(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }

    public static int task14(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num < target) {
                count++;
            }
        }
        return count;
    }



    public static boolean task15(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }
















































































    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }







}







