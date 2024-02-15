package org.example;

public class Main {
    public static void main(String[] args) {
        // Using the builder to construct a new Car object
        Car car = Car.CarBuilder.aCar()
                .withBrand("Opel")
                .withModel("Cors")
                .withYear(2023)
                .withColor("Orange")
                .withHorsepower(300)
                .build();

        // Displaying the details of the final product
        System.out.println("Brand: " + car.brand);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Color: " + car.color);
        System.out.println("Horsepower: " + car.horsepower);
    }
}
