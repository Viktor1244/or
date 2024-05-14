public class main5 {
    public static void main(String[] args) {
    task1(12,10);
    task2(12345, 15);



    task3(6);

    int [] ar ={24,5325,24,6567,12376};
    task4(ar);




    }




    public static void task1(int a, int b) {
        int nwd = 0;


        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                nwd = i;
            }
        }


        System.out.println("Найбільший спільний дільник для чисел " + a + " та " + b + " є: " + nwd);
    }







    public static void task2(int num, int userNum) {
        int sum = 0;
        int originalNum = num;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }


        if (sum == userNum) {
            System.out.println("Сума цифр числа " + originalNum + " дорівнює " + userNum);
        } else {
            System.err.println("Сума цифр числа " + originalNum + " не дорівнює " + userNum);
        }
    }




    public static void task3(int userNum) {
        int fib1 = 0;
        int fib2 = 1;
        int fib = 0;

        for (int i = 2; i <= userNum; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }

        while (!isPrime(fib)) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }

        System.out.println("Перше просте число в послідовності Фібоначчі, починаючи з " + userNum + "-го номера: " + fib);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void task4(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        // Перевірка чи масив відсортований у зростаючому порядку
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;
                break;
            }
        }

        // Перевірка чи масив відсортований у спадаючому порядку
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false;
                break;
            }
        }

        if (ascending) {
            System.out.println("Масив є відсортованим у зростаючому порядку.");
        } else if (descending) {
            System.out.println("Масив є відсортованим у спадаючому порядку.");
        } else {
            System.out.println("Масив не є відсортованим у зростаючому або спадаючому порядку.");
        }
    }



}








