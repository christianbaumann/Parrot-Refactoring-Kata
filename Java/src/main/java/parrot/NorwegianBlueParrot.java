package parrot;

public class NorwegianBlueParrot implements ParrotInterface {

    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    public NorwegianBlueParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }

    private double getBaseSpeed() {
        return 12.0;
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }
}
