package com.cizerautomobiles.controller;

import com.cizerautomobiles.model.AutomobilesModel;

public class SelectionSort {
    public AutomobilesModel[] selectionSortByBrand(AutomobilesModel[] model) {
        int size = model.length;

        for (int step = 0; step < size - 1; step++) {
            int minIndex = step;

            for (int next = step + 1; next < size; next++) {  // loop condition
                if (model[next].getModel_brand().compareTo(model[minIndex].getModel_brand()) < 0) {
                    minIndex = next;
                }
            }

            // Swapping
            AutomobilesModel temp = model[step];
            model[step] = model[minIndex];
            model[minIndex] = temp;
        }
        return model;
    }

    public AutomobilesModel[] selectionSortByBrandDesc(AutomobilesModel[] model) {
        int size = model.length;

        for (int step = 0; step < size - 1; step++) {
            int maxIndex = step;

            for (int next = step + 1; next < size; next++) {
                if (model[next].getModel_brand().compareTo(model[maxIndex].getModel_brand()) > 0) {
                    maxIndex = next;
                }
            }

            // Swapping
            AutomobilesModel temp = model[step];
            model[step] = model[maxIndex];
            model[maxIndex] = temp;
        }
        return model;
    }
    
    public AutomobilesModel[] selectionSortByModel(AutomobilesModel[] model) {
        int size = model.length;

        for (int step = 0; step < size - 1; step++) {
            int minIndex = step;

            for (int next = step + 1; next < size; next++) {  // loop condition
                if (model[next].getModel_name().compareTo(model[minIndex].getModel_name()) < 0) {
                    minIndex = next;
                }
            }

            // Swapping
            AutomobilesModel temp = model[step];
            model[step] = model[minIndex];
            model[minIndex] = temp;
        }
        return model;
    }
    
    public AutomobilesModel[] selectionSortByModelDesc(AutomobilesModel[] model) {
        int size = model.length;

        for (int step = 0; step < size - 1; step++) {
            int maxIndex = step;

            for (int next = step + 1; next < size; next++) {
                if (model[next].getModel_name().compareTo(model[maxIndex].getModel_name()) > 0) {
                    maxIndex = next;
                }
            }

            // Swapping
            AutomobilesModel temp = model[step];
            model[step] = model[maxIndex];
            model[maxIndex] = temp;
        }
        return model;
    }
}