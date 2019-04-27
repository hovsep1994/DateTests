package com.aca.datetests;

import java.time.LocalDate;

public class BirthYear {

    int getYearOfBirth(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age can't be negative");
        }
        LocalDate localDate = LocalDate.now();
        int currentYear = localDate.getYear();
        return currentYear - age;
    }

}
