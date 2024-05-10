public class main4 {
    public static void main(String[] args) {
        int [] ar = {4,4,5,62,7,867,13};


        min();



    }

    public static void bubble(int [] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length-1; j++) {
                if (ar[j]>ar[j+1]){
                    int tm = ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=tm;
                }
            }
        }

    }


    public static void insert(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int key = ar[i];
            int j;
            for (j = i - 1; j >= 0 && ar[j] > key; j--) {
                ar[j + 1] = ar[j];
            }
            ar[j + 1] = key;
        }
    }






    public static void min() {
        int size = 10;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1 || i == j || i + j == size - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }















    public static void print(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.printf(args[i]+" ");
        }
    }
















}

