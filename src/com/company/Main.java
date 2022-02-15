package com.company;


import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                double [] dailyAverageTemp = new double[7];

                Scanner userInput = new Scanner (System.in);


                for (int i = 0; i < dailyAverageTemp.length; i++) {
                    System.out.println("Enter a temperature for a day  " + (i + 1) + ": ");
                    dailyAverageTemp[i] = userInput.nextDouble();

                }
                System.out.println(dailyAverageTemp[0]);
                System.out.println(dailyAverageTemp[1]);
                System.out.println(dailyAverageTemp[2]);
                System.out.println(dailyAverageTemp[3]);
                System.out.println(dailyAverageTemp[4]);
                System.out.println(dailyAverageTemp[5]);
                System.out.println(dailyAverageTemp[6]);



                double sum = 0.0;
                for(int i=0; i< dailyAverageTemp.length; i++){
                sum += dailyAverageTemp[i];
                }

                double weeklyAverage = sum / (dailyAverageTemp.length);
                System.out.println ("Weekly Average  " + weeklyAverage);



    }
}
