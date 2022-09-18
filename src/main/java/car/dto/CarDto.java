package car.dto;

import java.util.List;

public class CarDto {

    private List<String> cars;
    private List<Integer> location;

    public CarDto() {
        super();
    }

    public CarDto(List<String> cars) {
        this.cars = cars;
    }

    public List<String> getCars() {
        return cars;
    }

    public List<Integer> getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "cars=" + cars +
                ", location=" + location +
                '}';
    }
}
