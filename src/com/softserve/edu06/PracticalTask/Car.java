package com.softserve.edu06.PracticalTask;

public abstract class Car {
    /*Create abstract class Car with model, maxSpeed and yearOfManufacture
properties and run() and stop() methods */

   private final String Model;
   private final int maxSpeed;
   private final int yearOfManufacture;
   public abstract void run();
   public abstract void stop();

   public Car(String model, int maxSpeed, int yearOfManufacture) {
      Model = model;
      this.maxSpeed = maxSpeed;
      this.yearOfManufacture = yearOfManufacture;
   }

   public String getModel() {
      return Model;
   }

   @Override
   public String toString() {
      return "Car{" +
              "Model='" + Model + '\'' +
              ", maxSpeed=" + maxSpeed +
              ", yearOfManufacture=" + yearOfManufacture +
              '}';
   }
}

