package org.example;

public class SolarSystem {
    enum Planet {
        MERCURY(1, 57.91, 2439.7, 87.97),
        VENUS(2, 108.2, 6051.8, 224.7),
        EARTH(3, 149.6, 6371, 365.25),
        MARS(4, 227.9, 3389.5, 686.98),
        JUPITER(5, 778.3, 71492, 4332.59),
        SATURN(6, 1427, 60268, 10759.22),
        URANUS(7, 2871, 25559, 30688.5),
        NEPTUNE(8, 4498, 24764, 60182);

        private final int proximityOrder; //proximity to the Sun
        private final double distanceToSun; // in million km
        private final double radius; // in km
        private final double orbitalPeriod; // in Earth-days

        //enum constructor
        Planet(int proximityOrder, double distanceToSun, double radius, double orbitalPeriod) {
            this.proximityOrder = proximityOrder;
            this.distanceToSun = distanceToSun;
            this.radius = radius;
            this.orbitalPeriod = orbitalPeriod;
        }
        //getter methods to access private instance variables
        public int getProximityOrder() {
            return proximityOrder;
        }

        public double getDistanceToSun() {
            return distanceToSun;
        }

        public double getRadius() {
            return radius;
        }

        public double getOrbitalPeriod() {
            return orbitalPeriod;
        }
    }

    public static void main(String[] args) {
        System.out.println("Here is some info about Solar system planets");

        for (Planet planet : Planet.values()) {
            System.out.println(planet.name() + " => Proximity order to the Sun: " + planet.getProximityOrder() +
                    ", Distance to Sun: " + planet.getDistanceToSun() + " million km" +
                    ", Radius: " + planet.getRadius() + " km" +
                    ", Orbital Period: " + planet.getOrbitalPeriod() + " Earth days");
        }

        System.out.println("Pluto is still a planet in our hearts, although science denies it :(");
    }
}