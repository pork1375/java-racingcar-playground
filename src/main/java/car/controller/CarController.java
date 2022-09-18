package car.controller;

import car.service.CarService;

public class CarController {
    public static void main(String[] args) {

        CarService carService = new CarService();
        carService.carStart();
    }
}
