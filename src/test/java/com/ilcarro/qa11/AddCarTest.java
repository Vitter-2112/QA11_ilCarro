package com.ilcarro.qa11;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddCarTest extends TestBase {


    @Test

    public void testFormLetTheCarWork() {
        click(By.cssSelector("[href='/car']"));

        fillCarForm(new Car().setCountry("Israel").setAddress("Mendel Street").setDistanceIncluded("500")
                .setSerial_number(" 117-55-777").setBrand("Audi").setModel("Q7")
                .setYear("2002").setModel("V8").setYear("15").setEngine("V8").setFuelConsumption("10").setFuel("petrol").setTransmition("automatic")
                .setWd("wedfrt").setHorsePower("110").setTorque("1500").setDoors("4").setSeats("5")
                .setAutclass("A").setAbout("asdfghjk").setTypeFeature("wdfghjk").setPrice("87"));

        submitForm();
    }

  /*  @Test

    public void negativeTestAddTheCarWithoutDoors() {
        click(By.cssSelector("[href='/car']"));

        fillCarForm(new Car().setCountry("Israel").setAddress("Mendel Street")
                .setSerial_number(" 111-55-777").setBrand("Audi").setModel("Q7")
                .setYear("2002").setModel("V8").setYear("9").setFuel("petrol").setTransmition("automatic")
                .setWd("wedfrt").setHorsePower("110").setTorque("1200").setSeats("5")
                .setAutclass("class").setAbout("asdfghjk").setPrice("87").setDistanceIncluded("500"));

        submitForm();
    }*/

    public void fillCarForm(Car car) {
        type(By.name("country"), car.getCountry());
        type(By.cssSelector(".address"), car.getAddress());
        type(By.cssSelector(".distance_included"), car.getDistanceIncluded());
        type(By.cssSelector(".serial_number"), car.getSerial_number());
        type(By.cssSelector(".brand"), car.getBrand());
        type(By.cssSelector(".model"), car.getModel());
        type(By.cssSelector(".year"), car.getYear());
        type(By.cssSelector(".engine"), car.getEngine());
        type(By.cssSelector(".fuel_consumption"), car.getFuelConsumption());
        type(By.cssSelector(".fuel"), car.getFuel());
        type(By.cssSelector(".transmition"), car.getTransmition());
        type(By.cssSelector(".wd"), car.getWd());
        type(By.cssSelector(".horsepower"), car.getHorsePower());
        type(By.cssSelector(".torque"), car.getTorque());
        type(By.cssSelector(".doors"), car.getDoors());
        type(By.cssSelector(".seats"), car.getSeats());
        type(By.cssSelector(".class"), car.getAutclass());
        type(By.name("about"), car.getAbout());
        type(By.cssSelector(".type_feature"), car.getTypeFeature());
        type(By.cssSelector(".price"), car.getPrice());
    }


}
