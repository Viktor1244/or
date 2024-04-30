public class main2 {
    public static void main(String[] args){

        ;
    }

    public static void task1(int num){
        if (num == 0){
            System.out.printf("yes");

        } else {
            System.out.printf("no");
        }
    }


    public static void task2(int num){
        if (num > 0){
            System.out.printf("yes");

        } else {
            System.out.printf("no");
        }
    }


    public static void task3(int num){
        if (num < 0){
            System.out.printf("yes");

        } else {
            System.out.printf("no");
        }
    }


    public static void task4(int num){
        if (num >= 0){
            System.out.printf("yes");

        } else {
            System.out.printf("no");
        }
    }


    public static void task5(int num){
        if (num <= 0){
            System.out.printf("yes");

        } else {
            System.out.printf("no");
        }
    }

    public static void task6(int num){
        if (num == 0){
            System.out.printf("no");

        } else {
            System.out.printf("yes");
        }
    }



    public static void task7(String a){
        if (a == "test"){
            System.out.printf("yes");

        } else {
            System.out.printf("no");
        }
    }


    public static void task8(String a){
        if (a == "1"){
            System.out.printf("yes");

        } else {
            System.out.printf("no");
        }
    }



    public static void task9(Boolean task){
        if (task == true){
            System.out.printf("yes");
        } else {
            System.out.printf("no");
        }
    }



    public static void task9_2(Boolean task) {
        if (task != null) {
            if (task == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else {
            System.out.println("The task is not defined.");
        }
    }

    public static void task10(Boolean task){
        if (task == true){
            System.out.printf("no");
        } else {
            System.out.printf("yes");
        }
    }

    public static void task10_2(Boolean task) {
        if (task != null) {
            if (task == true) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        } else {
            System.out.println("The task is not defined.");
        }
    }

    public static void task11(int a){
        if (a>0 && a<5){
            System.out.printf("yes");

        } else {
            System.out.printf("no");
        }
    }

    public static void task12(int a) {
        if (a == 0 || a == 2) {
            System.out.println(a + 7);
        } else {
            System.out.println(a/10);
        }
    }

    public static void task13(int a,int b) {
        if (a <= 1 && b >= 3) {
            System.out.println(a + b);
        } else {
            System.out.println(a-b);
        }
    }

    public static void task14(int a,int b) {
        if (a >2 && a < 11 &&  b >= 6 && b<14) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static void task15(int num){

        switch (num) {
            case 1 :
                System.out.printf("Зима");
                break;
            case 2:
                System.out.printf("Весна");
                break;
            case 3:
                System.out.printf("Лето");
                break;
            case 4:
                System.out.printf("Осень");
                break;
            default:
                System.out.printf("!Нету такого времени года!");
                break;

        }

    }



    public static void task16(int day){

        if (day >=1 && day <=10){
            System.out.printf("Первый");

        } else if (day >10 && day <= 20 ) {
            System.out.printf("Второй");
        } else if (day >20 && day <= 31 ){
            System.out.printf("Третий");
        }
    }

    public static void task17(int month){

        if (month == 1 || month == 2 || month == 3 ){
            System.out.printf("Зима");

        } else if (month == 4 || month == 5 || month == 6){
            System.out.printf("Весна");
        } else if (month == 7 || month == 8 || month == 9){
            System.out.printf("Лето");

        } else if (month == 10 || month == 11 || month == 12){
            System.out.printf("Осень");
        }


    }




}

