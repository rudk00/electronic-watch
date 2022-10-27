package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int sec = seconds % 3600 % 60;
        int min = seconds % 3600 / 60;
        int hours = seconds / 3600 % 24;

        String strSec = (sec < 10) ? "0" + Integer.toString(sec) : Integer.toString(sec);
        String strMin = (min < 10) ? "0" + Integer.toString(min) : Integer.toString(min);

        System.out.println(hours + ":" + strMin + ":" + strSec);
    }


    }
