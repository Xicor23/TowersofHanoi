package com.company;
import java.util.*;
public class Main {


        public static void main(String[] args) {
            TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
            System.out.print("Enter number of discs: ");
            Scanner scanner = new Scanner(System.in);
            int discs = scanner.nextInt();
            towersOfHanoi.solve(discs, "A", "B", "C");
        }
    }
