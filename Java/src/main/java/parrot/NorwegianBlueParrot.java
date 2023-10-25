package parrot;

public class NorwegianBlueParrot implements ParrotInterface {

    private final double voltage;
    private final boolean isNailed;

    private final double baseSpeed = 12.0;
    private final String cryPositiveVoltage = "Bzzzzzz";
    private final String cryVoltageZeroOrBelow = "...";
    private final double minimalSpeed = 24.0;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public String getCry() {
        return voltage > 0 ? cryPositiveVoltage : cryVoltageZeroOrBelow;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    private double getBaseSpeed() {
        return baseSpeed;
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(minimalSpeed, voltage * getBaseSpeed());
    }
}
