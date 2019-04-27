package com.aca.datetests;

import com.aca.Assert;

public class BirthYearTest {

    public static void main(String[] args) {
        BirthYearTest birthYearTest = new BirthYearTest();
//        birthYearTest.testGetDateOfBirth();
        birthYearTest.testGetDateOfBirthWithIllegalArgument();
    }

    void testGetDateOfBirth() {
        BirthYear birthYear = new BirthYear();
        int yearOfBirth = birthYear.getYearOfBirth(20);
        Assert.equals(yearOfBirth, 1989);
    }

    void testGetDateOfBirthWithIllegalArgument() {
        BirthYear birthYear = new BirthYear();
        try {
            birthYear.getYearOfBirth(5);
            Assert.fail();
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

}
