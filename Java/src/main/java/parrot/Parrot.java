package parrot;

import static parrot.ParrotTypeEnum.AFRICAN;
import static parrot.ParrotTypeEnum.EUROPEAN;

public class Parrot {

    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    private ParrotInterface parrot;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;

        if (type == EUROPEAN) {
            parrot = new EuropeanParrot(numberOfCoconuts, voltage, isNailed);
        } else if (type == AFRICAN) {
            parrot = new AfricanParrot(numberOfCoconuts, voltage, isNailed);
        }
    }

    public double getSpeed() {
        return switch (type) {
            case EUROPEAN, AFRICAN -> parrot.getSpeed();
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
        };
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getBaseSpeed() {
        return 12.0;
    }

    public String getCry() {
        return switch (type) {
            case EUROPEAN -> parrot.getCry();
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "...";
        };
    }
}
