package ru.netology.sqr.lessonPackages.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SqrtServiceTest {

    @Test
    public void calc() {
        SqrtService service = new SqrtService ();
        int expected = 3;
        int actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }
}