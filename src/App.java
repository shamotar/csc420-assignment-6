/*
 *  Title: Assignment 6 - Hashing
 *  Created by: Robert Norlander
 *  Email: shamotar@csp.edu
 *  Date: 2025-02-16
 *  Class: CSC 420 - Data Structures and Algorithms
 *  Professor: Susan Furtney
 */

import java.util.ArrayList;

public class App {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        System.out.println("Created and submitted by: Robert Norlander - shamotar@csp.edu");
        System.out.println("I certify that this is my own work");

        // Create an array of 100 ArrayLists
        ArrayList<CarInfo>[] hashTable = new ArrayList[100];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new ArrayList<>();
        }

        // Add 100 random cars to the hash table
        for (int i = 0; i < 100; i++) {
            CarInfo car = new CarInfo();
            hashTable[car.hashCode()].add(car);
        }

        // Print the hash table
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Index: " + i);
            for (CarInfo car : hashTable[i]) {
                System.out.println(car);
            }
        }
    }
}
