package Park;

public interface ParkInterface {

    /**
     * 把车停靠到停车场的车位上。parkPosition代表着车位的序号，大车与小车不能停在同一个区。
     * 如果车位没有其他车，则停靠成功，返回true。否则返回false。 
     */
    boolean checkIn(Car car, int parkPosition);

    /**
     * 需要根据车的ID找到车的停靠位置。如果在停车场找到该车，就把该车取出来，返回true。否则返回false。
     */
    boolean checkOut(Car car);

    /**
     * isLargeCar代表着是大车区还是小车区，parkPosition代表着车位的序号。返回该车位是不是空闲。 
     */
    boolean isEmpty(boolean isLargeCar, int parkPosition);
}
