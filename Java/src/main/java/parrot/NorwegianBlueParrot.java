package parrot;

public class NorwegianBlueParrot implements ParrotInterface {

    private final double voltage;
    private final boolean isNailed;

    private double baseSpeed = 12.0;
    private double minimalSpeed = 24.0;
    private String cryPositiveVoltage = "Bzzzzzz";
    private String cryVoltageZeroOrBelow = "...";

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    @Override
    public String getCry() {
        return voltage > 0 ? cryPositiveVoltage : cryVoltageZeroOrBelow;
    }

    private double getBaseSpeed() {
        return baseSpeed;
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(minimalSpeed, voltage * getBaseSpeed());
    }
}
