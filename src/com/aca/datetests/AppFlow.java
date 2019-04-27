package com.aca.datetests;

public class AppFlow {
    public static void main(String[] args) {
        BirthYearUI birthYearUI = new BirthYearUI();
        int age = birthYearUI.askAge();
        BirthYear birthYear = new BirthYear();
        int yearOfBirth = birthYear.getYearOfBirth(age);
        birthYearUI.printYearOfBirth(yearOfBirth);
    }
}
