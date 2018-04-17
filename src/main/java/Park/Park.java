package Park;

/**
 * @author xiaobao
 */
public class Park implements ParkInterface {
    String[] largeCarArea = new String[50];
    String[] smallCarArea = new String[100];

    public String[] carArea(boolean isLargeCar) {
        if (isLargeCar) {

            return largeCarArea;
        } else {

            return smallCarArea;
        }
    }

    @Override
    public boolean checkIn(Car car, int parkPosition) {
        if (car == null || car.getId() == null) {
            System.out.println();
            return false;
          
        }
        String[] carArea = carArea(car.isLargeCar());
        if (parkPosition < 0 || parkPosition >= carArea.length) {
            return false;
        }
        if (carArea[parkPosition] == null) {
            for (int i = 0; i < carArea.length; i++) {
                if (car.getId().equals(carArea[i])) {
                    System.out.println("停车不成功");
                    return false;
                }
            }
            carArea[parkPosition] = car.getId();
            System.out.println("停车成功"+" 你所停靠的车位是 "+carArea[parkPosition] );
            return true;
        }
        System.out.println("停车不成功");
        return false;  
      
    }


    @Override
    public boolean checkOut(Car car) {
        return false;
    }

    @Override
    public boolean isEmpty(boolean isLargeCar, int parkPosition) {
        return false;
    }
}
