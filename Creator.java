package com.program1;


import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Creator {

    public void number() {
        int numRands;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a integer value");
        Random rRand = new Random();
        while (read.hasNextInt())// makes sure the answer is an integer
        {
            numRands = read.nextInt();
            double[] arr1 = new double[numRands];
            double[] arr2 = new double[numRands];
            double[] arr3 = new double[numRands];

            for (int i = 0; i < numRands; i++) { // array using java.util.Random
                arr1[i] = rRand.nextDouble();
            }
            for (int i = 0; i < numRands; i++) {// array using Math.random

                arr2[i] = Math.random();
            }
            for (int i = 0; i < numRands; i++) {// java.util.concurrent.threadLocalRandom seeded with the time to get
                // better random numbers
                arr3[i] = ThreadLocalRandom.current().nextDouble();
            }
            Analyzer geek = new Analyzer();
            System.out.println("Here are the results per array");
            System.out.println("numRands is: " + numRands);
            System.out.println("array 1 made using Java Random");
            System.out.println("mean: " + geek.mean(arr1));
            System.out.println("Standard Deviation: "+ geek.standardDev(arr1));
            System.out.println("Minimum Value: "+ geek.minimum(arr1));
            System.out.println("Maximum Value: " + geek.maximum((arr1)));
            System.out.println("");
            System.out.println("Array 2 made using Math Random");
            System.out.println("mean: " + geek.mean(arr2));
            System.out.println("Standard Deviation: "+ geek.standardDev(arr2));
            System.out.println("Minimum Value: "+ geek.minimum(arr2));
            System.out.println("Maximum Value: " + geek.maximum((arr2)));
            System.out.println("");
            System.out.println("Array 3 made using java.util.concurrent.ThreadLocalRandom");
            System.out.println("mean: " + geek.mean(arr3));
            System.out.println("Standard Deviation: "+ geek.standardDev(arr3));
            System.out.println("Minimum Value: "+ geek.minimum(arr3));
            System.out.println("Maximum Value: " + geek.maximum((arr3)));

        }

    }



}
