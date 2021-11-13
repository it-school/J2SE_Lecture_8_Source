package ClassWork.ClassWork2021_3.ClassWork4;

import java.util.Date;

interface IItem {
    void SetInPPrice(float inPrice);

    void SetOutPPrice(float outPrice);

    void SetInDate(int year, int month, int day);

    float GetInPrice();

    float GetOutPrice();

    Date GetInDate();

}
