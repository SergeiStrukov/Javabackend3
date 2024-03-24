package org.Homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAccountNumberTest {
    boolean correctNumber;

    void init() {
        correctNumber = true; // В данном случае номер состоит из 14 цифр от 1-9 и не содержит букв.
    }

    @Test
    void isValidAccountNumberSuccess() { //номер должен содержать 14 цифр и цифры должны быть в диапазоне 1-9.
        init();
        assertEquals(correctNumber, ValidAccountNumber.isValidAccountNumber("44449444441444"));// Ожидается true - Так как у нас 14 цифр от 1 до 9.
//        System.out.println(correctNumber);
    }

    @Test
    void isNotValidAccountNumberLength() { //
        init();
        assertNotEquals(correctNumber, ValidAccountNumber.isValidAccountNumber("43124"));
    }

    @Test
    void isNotValidNumberValue() {
        init();
        assertNotEquals(correctNumber, ValidAccountNumber.isValidAccountNumber("aaaassssddddee"));
    }
}