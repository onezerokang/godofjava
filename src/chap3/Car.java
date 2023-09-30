package chap3;

public class Car {
    // 자동차의 상태
    int speed;
    int distance;
    String color;

    // 생성자: 객체를 생성할 때 필요하다.
    public Car() {

    }

    // 자동차의 행위
    public void speedUp() {
        speed += 5;

    }

    public void breakDown() {
        speed -= 10;
    }

    public int getCurrentSpeed() {
        return speed;
    }

}
