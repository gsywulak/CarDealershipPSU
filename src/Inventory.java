/*
Project: Lab 9
Purpose Details: Pizza ordering application
Course: IST 242
Author:
Date Developed:
Last Date Changed:
Rev:
 */
package edu.psu.abington.ist.ist242;
import java.util.*;
public class Inventory {
    //Class Level Variables - Protect the data
    public int vin;
    public ArrayList invList;
    public double price;
    public String year;
    public String make;
    public String model;

    //Constructor Method
    public Inventory(int _vin, String _year, String _make, String _model, double _price) {
        this.vin = _vin;
        this.make = _make; // menuItem OR _menuItem
        this.year = _year;
        this.model = _model;
        this.price = _price;
    }
    public Inventory(){
    }


    // SETTERS AND GETTERS --------------------------------------------------------------------------------------------------------------------------------------------------------------
    public int getVin() {
        return vin;
    }
    public void setVin(int vin) {
        this.vin = vin;
    }
    public ArrayList getInvList() {
        return invList;
    }
    public void setInvList(ArrayList invList) {
        this.invList = invList;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //add method to change menuItem price depending on the size
    public static void listMenu(ArrayList<Inventory> invList) {
        for (Inventory invItem : invList) {
            System.out.println(invItem.getMake());

        }
    }
    public Inventory printMenuInfo() {
        //System.out.print("-------------------------\n");​
        System.out.printf("%-1s | %-12s | %-12s | %-12s | %-12s\n", vin, year, make, model, "$" + price);
        return null;
    }

}