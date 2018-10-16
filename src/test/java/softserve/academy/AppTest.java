package softserve.academy;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testCheckNumTrue() {
        int a = 123321;
        assertTrue(App.checkNum(a));
    }

    @Test
    public void testCheckNumFalse() {
        int a = 123456;
        assertFalse(App.checkNum(a));
    }

    @Test
    public void testCountLuckyTicketsFull() {

        assertEquals(55252, App.countLuckyTickets(0, 999999));
    }

    @Test
    public void testCountLuckyTicketsPartial() {

        assertEquals(1, App.countLuckyTickets(111111, 111119));
    }
}
