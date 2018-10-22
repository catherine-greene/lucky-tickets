package softserve.academy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LuckyTicketsCounterTest {
    private LuckyTicketsCounter ticketsCounter;

    @Before
    public void initCounter() {
        ticketsCounter = new LuckyTicketsCounter();
    }

    @Test
    public void testCountLuckyTicketsBySimpleMethod() {
        //GIVEN
        int minTicketNumber = 0; //000000
        int maxTicketNumber = 999999;
        int expected = 55252;
        //WHEN
        int actual = ticketsCounter.countLuckyTicketsBySimpleMethod(minTicketNumber, maxTicketNumber);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void countLuckyTicketsByComplicatedMethod() {
        //GIVEN
        int minTicketNumber = 0; //000000
        int maxTicketNumber = 999999;
        int expected = 55252;
        //WHEN
        int actual = ticketsCounter.countLuckyTicketsByComplicatedMethod(minTicketNumber, maxTicketNumber);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void compareMethodsResultWhenSimpleGivesMoreLuckyTickets() {
        //GIVEN
        int simpleMethodResult = ticketsCounter.countLuckyTicketsBySimpleMethod(100000, 111111);
        int complicatedMethodResult = ticketsCounter.countLuckyTicketsByComplicatedMethod(100000, 111111);
        String expected = "Number of lucky tickets by Simple Method - 294\n" +
                "Number of lucky tickets by Complicated Method - 726\n" +
                "Complicated Method will produce more lucky tickets on a given range of ticket numbers.";
        //WHEN
        String actual = ticketsCounter.compareMethodsResult(simpleMethodResult, complicatedMethodResult);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void compareMethodsResultWhenBothGiveEqualAmountOfLuckyTickets() {
        //GIVEN
        int simpleMethodResult = ticketsCounter.countLuckyTicketsBySimpleMethod(200000, 111111);
        int complicatedMethodResult = ticketsCounter.countLuckyTicketsByComplicatedMethod(200000, 111111);
        String expected = "Number of lucky tickets by Simple Method - 0\n" +
                "Number of lucky tickets by Complicated Method - 0\n" +
                "Both methods will produce equal amount of lucky tickets on a given range of numbers.";
        //WHEN
        String actual = ticketsCounter.compareMethodsResult(simpleMethodResult, complicatedMethodResult);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    public void compareMethodsResultWhenComplicatedGivesMoreLuckyTickets() {
        //GIVEN
        int simpleMethodResult = ticketsCounter.countLuckyTicketsBySimpleMethod(10101, 101010);
        int complicatedMethodResult = ticketsCounter.countLuckyTicketsByComplicatedMethod(10101, 101010);
        String expected = "Number of lucky tickets by Simple Method - 4621\n" +
                "Number of lucky tickets by Complicated Method - 4225\n" +
                "Simple Method will produce more lucky tickets on a given range of ticket numbers.";
        //WHEN
        String actual = ticketsCounter.compareMethodsResult(simpleMethodResult, complicatedMethodResult);
        //THEN
        assertEquals(expected, actual);
    }
}