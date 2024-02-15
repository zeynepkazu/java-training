package org.example;

public class Car {
    protected String brand;
    protected String model;
    protected int year;
    protected String color;
    protected int horsepower;

    public static final class CarBuilder {
        private String brand;
        private String model;
        private int year;
        private String color;
        private int horsepower;

        public CarBuilder() {
        }

        public static CarBuilder aCar() {
            return new CarBuilder();
        }

        public CarBuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder withYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder withHorsepower(int horsepower) {
            this.horsepower = horsepower;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.horsepower = this.horsepower;
            car.model = this.model;
            car.brand = this.brand;
            car.color = this.color;
            car.year = this.year;
            return car;
        }

    }
}