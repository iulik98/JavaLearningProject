package com.iulifinttraining.bookcollectiontask;

public class Main {

    public static void main(String[] args) {
        int[] tablouDeDate = {1,2,3,0,-7,5,6,9,63,12,-11};
        int minValue = IntNumberArrayService.getTheMinValueOfTheArray(tablouDeDate);
        int minIndex = IntNumberArrayService.getTheMinValueIndexOfTheArray(tablouDeDate);
        int average = IntNumberArrayService.getTheAverageOfTheElementsOfTheArray(tablouDeDate);
        System.out.println("Valoarea minima a tabloului este: " + minValue + " gasite pe pozitita: " + minIndex);
        System.out.println("Media aritmetica a elementelor tabloului este: " + average);

    }
}
