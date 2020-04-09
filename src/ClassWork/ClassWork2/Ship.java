package ClassWork.ClassWork2;

public class Ship extends Vehicle {

    int passengersNumber;
    String Port;

    public Ship(float longitude, float latitude, float speed, float price, int productionYear, int passengersNumber, String port) {
        super(longitude, latitude, speed, price, productionYear);
        this.setPassengersNumber(passengersNumber);
        this.setPort(port);
    }

    public Ship() {
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber > 0 ? passengersNumber : 0;
    }

    public String getPort() {
        return Port;
    }

    public void setPort(String port) {
        Port = port;
    }

    @Override
    public String toString() {
        return super.toString() + "passengersNumber=" + passengersNumber +
                ", Port='" + Port + '\'' +
                '}';
    }
}
