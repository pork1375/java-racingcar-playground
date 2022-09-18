package car.service;

import car.dto.CarDto;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarService {

    private static final int NUMBER_FIVE = 5;
    private static final int NUMBER_MOVE_MAX = 10;

    public void carStart() {
        carGame(createCarName() ,makeCar());

    }

    // 자동차이름 만들기
    public CarDto createCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner sc = new Scanner(System.in);
        String carInputNames = sc.next();

        List<String> names = Arrays.stream(carInputNames.split(",")).collect(Collectors.toList());

        CarDto carDto = new CarDto(names);
        carNameValidation(carDto);

        return carDto;
    }

    // 자동차 이름 유효성검사
    public void carNameValidation(CarDto carDto) {
        int carCount = carDto.getCars().size();
        long count = carDto.getCars().stream().distinct().count();

        if (carCount != count) {
            System.out.println("중복된 자동차 이름은 입력할 수 없습니다.");
        }

        List<String> collect = carDto.getCars().stream().filter(v -> v.length() > NUMBER_FIVE).collect(Collectors.toList());
        if (collect.size() > 0) {
            System.out.println("자동차 이름은 5자를 초과할 수 없다. " + collect);
        }

    }

    // 자동차 시도 횟수
    public int makeCar() {
        System.out.println("시도할 횟수는 몇회인가요?");
        return new Scanner(System.in).nextInt();
    }

    // 자동차 이동 랜덤 구하기
    public boolean carMoveRandomly() {
        return new Random().nextInt(NUMBER_MOVE_MAX) > 3;
    }

    // 자동차 이동
    public void carGame(CarDto carDto, int makeCar) {
        System.out.println("carGame");
        System.out.println("carDto ==> " + carDto);
        System.out.println("makeCar ==> " + makeCar);

        for (int i = 0; i < makeCar; i++) {
            for (int j = 0; j < carDto.getCars().size(); j++) {
                if (carMoveRandomly()) {

                }
            }
        }

    }

}
