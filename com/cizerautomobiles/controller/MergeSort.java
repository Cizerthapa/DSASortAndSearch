package com.cizerautomobiles.controller;

/**
 *
 * @author cizer
 */
public class MergeSort {
    public void sorting(String[] a) {
//        String[] a = model.getProgrammes();
        if (a.length <= 1) {
//            return null;
        }

        String[] first = new String[a.length / 2];
        String[] second = new String[a.length - first.length];

        for (int i = 0; i < first.length; i++) {
            first[i] = a[i];
        }
        for (int i =0;i<second.length;i++){
            second[i] = a[i];
        }
        //System.arraycopy(a, first.length, second, 0, second.length);

        sorting(first);
        sorting(second);
        mergeWord(first, second, a);
//        return new ProgrammesModel();
    }

    public void mergeWord(String[] first, String[] second, String[] mainArray) {
        int firstCounter = 0;
        int secondCounter = 0;
        int mainArrayCounter = 0;

        while (firstCounter < first.length && secondCounter < second.length) {
            if (first[firstCounter].compareTo(second[secondCounter]) < 0) {
                mainArray[mainArrayCounter] = first[firstCounter];
                firstCounter++;
            } else {
                mainArray[mainArrayCounter] = second[secondCounter];
                secondCounter++;
            }
            mainArrayCounter++;
        }

        while (firstCounter < first.length) {
            mainArray[mainArrayCounter] = first[firstCounter];
            firstCounter++;
            mainArrayCounter++;
        }

        while (secondCounter < second.length) {
            mainArray[mainArrayCounter] = second[secondCounter];
            secondCounter++;
            mainArrayCounter++;
        }
    }
}
