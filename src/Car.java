import java.awt.*;
import java.util.Objects;

public class Car {
    public static int x, y;
    public final int CORRECTION = Board.LINE_THICKNESS;
    public final int CAR_X_WIDTH = 240;
    public final int CAR_X_HEIGHT = 120;
    public final int CAR_Y_WIDTH = 120;
    public final int CAR_Y_HEIGHT = 240;
    public final int FULL_LINE = 120;

    public final int LONG_CAR_X_WIDTH = 360;
    public final int LONG_CAR_Y_HEIGHT = 360;
    public final int MAKE_START_FROM_ONE = -1;

    public final int X_END_LEVEL_CAR = 765;
    public final int WIDTH_AND_HEIGHT_END_LEVEL_CAR = 20;

    private final CustomRectangle car = new CustomRectangle();

    public Car(String carType_xCar_yCar_xTruck_yTruck, int line, int column, Color color) {
        x = FULL_LINE * (column + MAKE_START_FROM_ONE) + Board.BOARD_START_X + CORRECTION;
        y = FULL_LINE * (line + MAKE_START_FROM_ONE) + Board.BOARD_START_Y + CORRECTION;
        car.setX(x);
        car.setY(y);
        car.setColor(color);

        if (Objects.equals(carType_xCar_yCar_xTruck_yTruck, "xCar")) {
            car.setWidth(CAR_X_WIDTH - CORRECTION);
            car.setHeight(CAR_X_HEIGHT - CORRECTION);
        } else if (Objects.equals(carType_xCar_yCar_xTruck_yTruck, "yCar")) {
            car.setWidth(CAR_Y_WIDTH - CORRECTION);
            car.setHeight(CAR_Y_HEIGHT - CORRECTION);
        } else if (Objects.equals(carType_xCar_yCar_xTruck_yTruck, "xTruck")) {
            car.setWidth(LONG_CAR_X_WIDTH - CORRECTION);
            car.setHeight(CAR_X_HEIGHT - CORRECTION);
        } else if (Objects.equals(carType_xCar_yCar_xTruck_yTruck, "yTruck")) {
            car.setWidth(CAR_Y_WIDTH - CORRECTION);
            car.setHeight(LONG_CAR_Y_HEIGHT - CORRECTION);
        }else if (Objects.equals(carType_xCar_yCar_xTruck_yTruck, "endLevel")) {
            car.setX(X_END_LEVEL_CAR);
            car.setWidth(WIDTH_AND_HEIGHT_END_LEVEL_CAR);
            car.setHeight(WIDTH_AND_HEIGHT_END_LEVEL_CAR);
            car.setColor(Color.LIGHT_GRAY);
        }
    }
    public CustomRectangle getCar() {
        return car;
    }
}
