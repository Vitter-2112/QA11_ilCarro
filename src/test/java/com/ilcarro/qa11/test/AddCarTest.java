package com.ilcarro.qa11.test;

import com.ilcarro.qa11.model.Car;
import org.testng.annotations.Test;

public class AddCarTest extends TestBase {

    //@BeforeMethod
    //public void ensurePreconditions(){
    //if(!userLoggedIn()){
    // login();
    //}


    @Test

    public void testFormLetTheCarWorkLoggedInUser() throws InterruptedException {
        if (!app.getUser().userLoggedIn()) {
            app.getUser().login();
        }
        app.getUser().pause(2000);
        app.getHeader().openAddCarFormFromHeader();

        app.getCar().fillCarForm(new Car().setCountry("Israel").setAddress("Mendel Street").setDistanceIncluded("500")
                .setSerial_number(" 117-55-707").setBrand("Audi").setModel("Q7")
                .setYear("2002").setModel("V8").setYear("15").setEngine("V8").setFuelConsumption("10").setFuel("petrol").setTransmition("automatic")
                .setWd("wedfrt").setHorsePower("110").setTorque("110").setDoors("4").setSeats("5")
                .setAutclass("A").setAbout("asdfghjk").setTypeFeature("wdfghjk").setPrice("87"));

        app.getUser().submitForm();
    }

    @Test

    public void negativeTestAddCarWithoutDoors() throws InterruptedException {
        if (!app.getUser().userLoggedIn()) {
            app.getUser().login();
        }
        app.getUser().pause(2000);
        app.getHeader().openAddCarFormFromHeader();

        app.getCar().fillCarForm(new Car().setCountry("Israel").setAddress("Mendel Street").setDistanceIncluded("500")
                .setSerial_number(" 117-22-777").setBrand("Audi").setModel("Q7")
                .setYear("2002").setModel("V8").setYear("14").setEngine("V8").setFuelConsumption("10").setFuel("petrol").setTransmition("automatic")
                .setWd("wedfrt").setHorsePower("110").setTorque("1500").setSeats("5")
                .setAutclass("A").setAbout("asdfghjk").setTypeFeature("wdfghjk").setPrice("87"));

        app.getHeader().submitForm();
    }

    @Test

    public void testFormLetTheCarWorkForNotLoggedUser() throws InterruptedException {

        app.getHeader().openAddCarFormFromHeader();

        app.getCar().fillCarForm(new Car().setCountry("Israel").setAddress("Mendel Street").setDistanceIncluded("500")
                .setSerial_number(" 117-55-777").setBrand("Audi").setModel("Q7")
                .setYear("2002").setModel("V8").setYear("15").setEngine("V8").setFuelConsumption("10").setFuel("petrol").setTransmition("automatic")
                .setWd("wedfrt").setHorsePower("110").setTorque("1500").setDoors("4").setSeats("5")
                .setAutclass("A").setAbout("asdfghjk").setTypeFeature("wdfghjk").setPrice("87"));

        app.getUser().submitForm();
    }

}









