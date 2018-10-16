package softserve.academy;

public class App {
    public static void main(String[] args) {
        System.out.println(countLuckyTickets());


//        for(int i=0; i <= 999999; i++) {
//            if(App.checkNumber(i)) {
//                System.out.println(i);
//            }
//        }

    }

    private static int countLuckyTickets() {
        int count = 0;
        for (int j = 0; j <= 9; j++) {
            for (int k = 0; k <= 9; k++) {
                for (int l = 0; l <= 9; l++) {
                    for (int m = 0; m <= 9; m++) {
                        for (int n = 0; n <= 9; n++) {
                            for (int o = 0; o <= 9; o++) {
                                if (j + k + l == m + n + o) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    static boolean checkNum(int num) {

        int[] arr = new int[6];
        int temp = num / 10;
        int remainder = temp % 10;
        arr[5] = num % 10;
//        arr[4] =
        int six = num % 10;
        int five = (num / 10) % 10;
        int four = ((num / 10) / 10) % 10;
        int three = (((num / 10) / 10) / 10) % 10;
        int two = (((num / 10) / 10) / 10 / 10) % 10;
        int one = (((num / 10) / 10) / 10 / 10 / 10) % 10;


        return one + two + three == four + five + six;

    }

    static int countLuckyTickets(int min, int max) {
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (checkNum(i)) {
                count++;
            }
        }
        return count;
    }

}
