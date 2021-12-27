package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        // task6();
        // task7();
        // task8();


    }

    public static void task1() {

        int iOs = 2;
        int android = 1;

        if (iOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (android == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }


    public static void task2() {

        int iOs = 0;
        int android = 1;
        int yearOfRelease = 2013;

        if (iOs == 0 && yearOfRelease >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (iOs == 0 && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (android == 1 && yearOfRelease >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (android == 1 && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }


    public static void task3() {

        int year = 2021;

        if (year % 400 == 0) {
            System.out.println(year + " является високосным годом");
        } else if (year % 100 == 0) {
            System.out.println(year + " не является високосным годом");
        } else if (year % 4 == 0) {
            System.out.println(year + " является високосным годом");
        } else {
            System.out.println(year + " не является високосным годом");
        }
    }


    public static void task4() {

        int deliveryDistance = 20;
        int deliveriOneDay = 1;
        int deliveriTwoDay = 2;
        int deliveriThreeDay = 3;


        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + deliveriOneDay);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:" + deliveriTwoDay);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + deliveriThreeDay);
        }
    }


    public static void task5() {

        int monthNumber = 16;


        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
            default:
                System.out.println("Такого не существует");

        }


    }


}

