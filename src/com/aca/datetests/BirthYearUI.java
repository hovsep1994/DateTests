package com.aca.datetests;

import java.util.Scanner;

public class BirthYearUI {

    public int askAge() {
        System.out.println("What is your age");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void printYearOfBirth(int yearOfBirth) {
        System.out.println("You have born at - " + yearOfBirth);
    }

}
