package org.example;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private int horsepower;

    // Private constructor to be used to create a new object
    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.horsepower = builder.horsepower;
    }

    // Getters for the attributes
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    // Builder for constructing the Car object
    public static class CarBuilder {
        // Required parameters
        private String brand;
        private String model;

        // Optional parameters & their default values
        private int year = 2010;
        private String color;
        private int horsepower = 200;

        // Constructor with required parameters
        public CarBuilder (String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        // Methods for setting optional parameters
        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder horsepower(int horsepower) {
            this.horsepower = horsepower;
            return this;
        }

        // Method to build the Car object
        public Car build() {
            return new Car(this);
        }
    }
}
