package calculator;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");
        System.out.println();
        System.out.println("Income: $5405");
        int expense = 5405;
        Scanner scn = new Scanner(System.in);
        System.out.println("Staff expenses:");
        int staff = scn.nextInt();
        System.out.println("Other expenses:");
        int other = scn.nextInt();
        expense =expense-staff-other;
        System.out.printf("Net income: $%d",expense);

    }
}