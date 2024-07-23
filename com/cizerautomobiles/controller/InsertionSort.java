package com.cizerautomobiles.controller;

import com.cizerautomobiles.model.AutomobilesModel;

public class InsertionSort {

   public AutomobilesModel[] insertionSortAscmodel(AutomobilesModel[] model) {
    // Get the size of the array
    int size = model.length;

    // Iterate through the array
    for (int step = 1; step < size; step++) {
        // Select the current element to be compared
        AutomobilesModel key = model[step];
        int j = step - 1;

        // Move elements greater than the key to the right
        while (j >= 0 && model[j].getCar_Id() > key.getCar_Id()) {
            model[j + 1] = model[j];
            j = j - 1;
        }

        // Insert the key at the correct position
        model[j + 1] = key;
    }

    // Return the sorted array
    return model;
}

    public AutomobilesModel[] insertionSortDescModel(AutomobilesModel[] model) {
        // Get the size of the array
        int size = model.length;

        // Iterate through the array
        for (int step = 1; step < size; step++) {
            // Select the current element to be compared
            AutomobilesModel key = model[step];
            int j = step - 1;

            // Move elements greater than the key to the right
            while (j >= 0 && model[j].getCar_Id() < key.getCar_Id()) {
                model[j + 1] = model[j];
                j = j - 1;
            }
            model[j + 1] = key;
        }
        return model;
    }
    
    public AutomobilesModel[] insertionSortAscPrice(AutomobilesModel[] model) {
        int size = model.length;

        for (int step = 1; step < size; step++) {
            AutomobilesModel key = model[step];
            int j = step - 1;

            while (j >= 0 && model[j].getPrice()> key.getPrice()) {
                model[j + 1] = model[j];
                j = j - 1;
            }
            model[j + 1] = key;
        }
        return model;
    }
    
    public AutomobilesModel[] insertionSortDescPrice(AutomobilesModel[] model) {
        int size = model.length;

        for (int step = 1; step < size; step++) {
            AutomobilesModel key = model[step];
            int j = step - 1;

            while (j >= 0 && model[j].getPrice() < key.getPrice()) {
                model[j + 1] = model[j];
                j = j - 1;
            }
            model[j + 1] = key;
        }
        return model;
    }
}
