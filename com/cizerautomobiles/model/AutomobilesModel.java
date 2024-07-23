/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cizerautomobiles.model;

public class AutomobilesModel {

    private int car_Id;
    private String model_name;
    private String model_brand;
    private String manufracturer;
    private int seat_capacity;
    private int displacement_cc;
    private String fuel_type;
    private String vin_number;
    private String transmission_type;
    private int price;
    private String body_type;
    
    /* @param car_Id
     * @param model_name
     * @param model_brand
     * @param manufracturer
     * @param price
     * @param seat_capacity
     * @param vin_number
     * @param displacement_cc
     * @param fuel_type
     * @param transmission_type
     * @param body_type*/
    //**Constructor**//
    public AutomobilesModel(int car_Id,String model_name,String model_brand,String manufracturer,int seat_capacity,String vin_number,int displacement_cc,String fuel_type,String transmission_type,String body_type,int price){
        this.car_Id = car_Id;
        this.model_name= model_name;
        this.model_brand=model_brand;
        this.manufracturer=manufracturer;
        this.seat_capacity=seat_capacity;
        this.vin_number=vin_number;
        this.displacement_cc=displacement_cc;
        this.fuel_type=fuel_type;
        this.transmission_type=transmission_type;
        this.body_type=body_type;
        this.price=price;
    }

    /**
     * @return the car_Id
     */
    public int getCar_Id() {
        return car_Id;
    }

    /**
     * @param car_Id the car_Id to set
     */
    public void setCar_Id(int car_Id) {
        this.car_Id = car_Id;
    }

    /**
     * @return the model_name
     */
    public String getModel_name() {
        return model_name;
    }

    /**
     * @param model_name the model_name to set
     */
    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    /**
     * @return the model_brand
     */
    public String getModel_brand() {
        return model_brand;
    }

    /**
     * @param model_brand the model_brand to set
     */
    public void setModel_brand(String model_brand) {
        this.model_brand = model_brand;
    }

    /**
     * @return the manufracturer
     */
    public String getManufracturer() {
        return manufracturer;
    }

    /**
     * @param manufracturer the manufracturer to set
     */
    public void setManufracturer(String manufracturer) {
        this.manufracturer = manufracturer;
    }

    /**
     * @return the seat_capacity
     */
    public int getSeat_capacity() {
        return seat_capacity;
    }

    /**
     * @param seat_capacity the seat_capacity to set
     */
    public void setSeat_capacity(int seat_capacity) {
        this.seat_capacity = seat_capacity;
    }

    /**
     * @return the displacement_cc
     */
    public int getDisplacement_cc() {
        return displacement_cc;
    }

    /**
     * @param displacement_cc the displacement_cc to set
     */
    public void setDisplacement_cc(int displacement_cc) {
        this.displacement_cc = displacement_cc;
    }

    /**
     * @return the fuel_type
     */
    public String getFuel_type() {
        return fuel_type;
    }

    /**
     * @param fuel_type the fuel_type to set
     */
    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    /**
     * @return the vin_number
     */
    public String getVin_number() {
        return vin_number;
    }

    /**
     * @param vin_number the vin_number to set
     */
    public void setVin_number(String vin_number) {
        this.vin_number = vin_number;
    }

    /**
     * @return the transmission_type
     */
    public String getTransmission_type() {
        return transmission_type;
    }

    /**
     * @param transmission_type the transmission_type to set
     */
    public void setTransmission_type(String transmission_type) {
        this.transmission_type = transmission_type;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the body_type
     */
    public String getBody_type() {
        return body_type;
    }

    /**
     * @param body_type the body_type to set
     */
    public void setBody_type(String body_type) {
        this.body_type = body_type;
    }
}
