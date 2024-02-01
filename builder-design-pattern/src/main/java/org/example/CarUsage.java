package org.example;

public class CarUsage {
    public static void main(String[] args) {
        // Using the builder to construct a new Car object
        Car car = new Car.Builder("Toyota", "Camry")
                .year(2023)
                .color("Blue")
                .horsepower(200)
                .build();

        // Displaying the details of the final product
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
        System.out.println("Horsepower: " + car.getHorsepower());
    }
}
