package ClassWork.ClassWork2;

public interface IVehicle {
    void SetCoordinates(float longitude, float latitude);

    Coordinates GetCoordinates();

    void SetPrice(float price);

    float GetPrice();

    void SetSpeed(float speed);

    float GetSpeed();

    void SetProductionYear(int year);

    int GetProductionYear();
}
