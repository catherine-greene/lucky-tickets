package softserve.academy;

class LuckyTicketsCounter {
    private final static String SIMPLE_METHOD_MESSAGE = "Number of lucky tickets by Simple Method - ";
    private final static String COMPLICATED_METHOD_MESSAGE = "Number of lucky tickets by Complicated Method - ";

    int countLuckyTicketsBySimpleMethod(int min, int max) {
        int countSimple = 0;
        for (int i = min; i <= max; i++) {
            if (checkNumBySimpleMethod(i)) {
                countSimple++;
            }
        }
        return countSimple;
    }

    int countLuckyTicketsByComplicatedMethod(int min, int max) {
        int countComplicated = 0;
        for (int i = min; i <= max; i++) {
            if (checkNumByComplicatedMethod(i)) {
                countComplicated++;
            }
        }
        return countComplicated;
    }

    private boolean checkNumBySimpleMethod(int num) {
        int[] arr = getIntArray(num);
        return arr[0] + arr[1] + arr[2] == arr[3] + arr[4] + arr[5];
    }

    private boolean checkNumByComplicatedMethod(int num) {
        int[] arr = getIntArray(num);
        return arr[0] + arr[2] + arr[4] == arr[1] + arr[3] + arr[5];
    }

    private int[] getIntArray(int num) {
        int[] output = new int[6];
        output[5] = num % 10;
        output[4] = (num / 10) % 10;
        output[3] = (num / 100) % 10;
        output[2] = (num / 1000) % 10;
        output[1] = (num / 10000) % 10;
        output[0] = (num / 100000) % 10;
        return output;
    }

    String compareMethodsResult(int simpleCount, int complicatedCount) {
        StringBuilder stringBuilder = new StringBuilder(SIMPLE_METHOD_MESSAGE + simpleCount + "\n"
                + COMPLICATED_METHOD_MESSAGE + complicatedCount + "\n");
        if (simpleCount < complicatedCount) {
            stringBuilder.append("Complicated Method will produce more lucky tickets on a given range of ticket numbers.");
        } else if (simpleCount == complicatedCount) {
            stringBuilder.append("Both methods will produce equal amount of lucky tickets on a given range of numbers.");
        } else {
            stringBuilder.append("Simple Method will produce more lucky tickets on a given range of ticket numbers.");
        }
        return stringBuilder.toString();
    }
}
