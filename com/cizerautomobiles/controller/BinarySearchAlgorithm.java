package com.cizerautomobiles.controller;

import com.cizerautomobiles.model.AutomobilesModel;

public class BinarySearchAlgorithm {
    public int searchStringModel(AutomobilesModel[] arr, int low, int high, String searchKey) {
    if (high >= low) {
        int mid = (low + high) / 2;

        // If element is present at the middle itself
        if (arr[mid].getModel_name().toLowerCase().equals(searchKey.toLowerCase()))
            return mid;

        // If element is smaller than mid, then it can only be present in the left subarray
        if (arr[mid].getModel_name().toLowerCase().compareTo(searchKey.toLowerCase()) > 0)
            return searchStringModel(arr, low, mid - 1, searchKey);

        // Else the element can only be present in the right subarray
        return searchStringModel(arr, mid + 1, high, searchKey);
    }

    // Element is not present in the array
    return -1;
}

    public int searchModelInt(AutomobilesModel[] models, int low, int high, int searchKey) {
        // Calling after sort
        if (high >= low) {
            int mid = (low + high) / 2;
            // If the element is present at the middle itself
            if (models[mid].getPrice() == searchKey)
                return mid;

            // If element is smaller than mid, then it can only be present in the left subarray
            if (models[mid].getPrice() > searchKey)
                return searchModelInt(models, low, mid - 1, searchKey);

            // Else the element can only be present in the right subarray
            return searchModelInt(models, mid + 1, high, searchKey);
        }
        // Element is not present in the array
        return -1;
    }
}
