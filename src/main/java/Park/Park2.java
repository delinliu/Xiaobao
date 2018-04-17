package Park;

public class Park2 implements ParkInterface {

    private String[] largeArea;
    private String[] smallArea;

    public Park2(int largeAreaAmount, int smallAreaAmount) {
        largeArea = new String[largeAreaAmount];
        smallArea = new String[smallAreaAmount];
    }

    private String[] getArea(boolean isLarge) {
        if (isLarge) {
            return largeArea;
        } else {
            return smallArea;
        }
    }

    private boolean isValidCar(Car car) {
        if (car == null || car.getId() == null) {
            return false;
        }
        return true;
    }

    private boolean isValidPosition(String[] area, int parkPosition) {
        if (parkPosition < 0 || parkPosition >= area.length) {
            return false;
        }
        return true;
    }

    @Override 
    public boolean checkIn(Car car, int parkPosition) {

        // 不允许car为空，也不允许carId为空
        if (!isValidCar(car)) {
            return false;
        }

        // 选定停车区
        String[] area = getArea(car.isLargeCar());

        // 保证停车位没有越界
        if (!isValidPosition(area, parkPosition)) {
            return false;
        }

        // 保证该停车位是空的
        if (area[parkPosition] != null) {
            return false;
        }

        // 保证该车没来过
        for (int i = 0; i < area.length; i++) {
            if (car.getId().equals(area[i])) {
                return false;
            }
        }

        // 把该车停在该车位
        area[parkPosition] = car.getId();
        return true;
    }

    @Override
    public boolean checkOut(Car car) {

        // 不允许car为空，也不允许carId为空
        if (!isValidCar(car)) {
            return false;
        }

        // 选定停车区
        String[] area = getArea(car.isLargeCar());

        // 找出该车
        for (int i = 0; i < area.length; i++) {
            if (car.getId().equals(area[i])) {
                area[i] = null;
                return true;
            }
        }

        // 没找到
        return false;
    }

    @Override
    public boolean isEmpty(boolean isLargeCar, int parkPosition) {

        // 选定停车区
        String[] area = getArea(isLargeCar);

        // 保证停车位没有越界
        if (!isValidPosition(area, parkPosition)) {
            return false;
        }

        if (area[parkPosition] != null) {
            return false;
        }

        return true;
    }

  
}
