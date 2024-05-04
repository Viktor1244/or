public class main3 {

    public static void main(String[] args){


        task8(new String[]{});


//        int[] array = {5, 10, -3, 8, 20, 15};
//        int max = task6(array);
//        System.out.printf("max"+max);
    }

    public static void task1() {

        int number = 1;


        for (int i = 0; i < 55; i++) {
            System.out.print(number + " ");
            number += 2;
        }
    }

    public static void task2() {



        for (int i = 90; i >= 0; i-=5) {
            System.out.print(i + " ");

        }
    }

    public static void task3() {


        int number = 2;

        for (int i = 0; i < 20; i++) {
            System.out.print(number + " ");
            number *= 2;
        }
    }




    public static void task4() {


        int number = 2;

        for (int i = 0; i < 20; i++) {
            System.out.print(number + " ");
            number *= 2;
        }
    }



    public static void task5() {


        int sum = 0;
        int countEven = 0;

        for (int i = 50; i <= 150; i++) {
            sum += i;
            if (i % 2 == 0) {
                countEven++;
            }
        }

        System.out.println("Сума чисел від 50 до 150: " + sum);
        System.out.println("Кількість парних чисел у діапазоні: " + countEven);
    }


    public static int task6(int[] ar) {


        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }

        return max;


    }


    public static void task7() {

        int[] array = {5, -3, -2, 16, 55, 0};
        int sumOfPositive = 0;
        int countPositive = 0;

        for (int num : array) {
            if (num > 0) {
                sumOfPositive += num;
                countPositive++;
            }
        }

        System.out.println("Сума позитивних чисел: " + sumOfPositive);
        System.out.println("Кількість позитивних чисел: " + countPositive);

    }




    public static void task8(String[] args) {
        int n = 11;
        int first = 1;
        int second = 1;

        System.out.println("Перші " + n + " членів послідовності Фібоначчі:");


        System.out.print(first + " " + second + " ");


        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");


            first = second;
            second = next;
        }
    }




}
