package softserve.academy;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        LuckyTicketsCounter counter = new LuckyTicketsCounter();
        Scanner scanner = new Scanner(System.in);
        int minTicketNum = -1;
        int maxTicketNum = -1;
        do {
            do {
                System.out.println("Enter min ticket number:");
                try {
                    minTicketNum = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException ex) {
                    System.out.println("Incorrect input!");
                }
            } while (minTicketNum < 0);
            System.out.println("Enter max ticket number:");
            do {
                try {
                    maxTicketNum = Integer.parseInt(scanner.nextLine());
                    if (maxTicketNum < minTicketNum) {
                        int temp = minTicketNum;
                        minTicketNum = maxTicketNum;
                        minTicketNum = temp;
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Incorrect input!");
                }
            } while (maxTicketNum < 0);
            int luckyTicketsBySimpleMethod = counter.countLuckyTicketsBySimpleMethod(minTicketNum, maxTicketNum);
            int luckyTicketsByComplicatedMethod = counter.countLuckyTicketsByComplicatedMethod(minTicketNum, maxTicketNum);
            String result = counter.compareMethodsResult(luckyTicketsBySimpleMethod, luckyTicketsByComplicatedMethod);
            System.out.println(result);
            System.out.println("\nEnter \"exit\" to finish or press enter to continue!");

        } while (!scanner.nextLine().trim().equalsIgnoreCase("exit"));
    }
}



