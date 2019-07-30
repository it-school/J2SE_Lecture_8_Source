package ClassWork2;

public class Constants {
    final static int MIN_PRODUCTION_YEAR = 1800;

    enum ProductionYears {
        carProductionYear(1900),
        planeProductionYear(1870),
        shipProductionYear(1750);

        ProductionYears(int i) {

        }
    }
}
