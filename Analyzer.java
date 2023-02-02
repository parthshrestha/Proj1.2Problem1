package com.program1;


public class Analyzer {

    public Analyzer() {
        System.out.println("ready");
    }

    public double mean(double[] arr) {//mean calculator
        double total = 0.0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        double average = total / (double) arr.length;
        return average;
    }

    public double standardDev(double[] arr) {//standard deviation calculator
        int n = arr.length;
        double mean = mean(arr);// get the mean
        // now calculate the sum of each element - the mean of the array
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow((arr[i] - mean), 2);
        }
        double std = Math.sqrt((sum / n));
        return std;
    }

    public double minimum(double[] arr) { // minimum calculator
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // if the current element is smaller than the known minimum value
            //assign it as new minimum value
            if(min > arr[i])
            {min = arr[i];}
        }

        return min;
    }

    public double maximum(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // if the current element is larger than the known Maximum value
            //assign it as new maximum value
            if(max < arr[i])
            {max = arr[i];}
        }

        return max;
    }

}