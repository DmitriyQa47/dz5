package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public void calcTest1() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTest2() {
        SQRService service = new SQRService();

        int actual = service.calc(10, 99 );
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcTest3() {
        SQRService service = new SQRService();

        int actual = service.calc(100, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}