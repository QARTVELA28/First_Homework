public class Main {

    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("დადებითი");
        } else if (num < 0) {
            System.out.println("უარყოფითი");
        } else {
            System.out.println("ნოლი");
        }
    }

    public static void hasTeen(int a, int b, int c) {
            if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 10, 22};
        int evenCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        if (evenCount == 0) {
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        } else {
            System.out.println("ამ მასივში არის " + evenCount + " ლუწი რიცხვი");
        }

        checkNumber(10);
        checkNumber(11);
        checkNumber(-10);

        hasTeen(10, 11, 12);
        hasTeen(12, 15, 20);
    }

}

