package parrot;

public class AfricanParrot implements ParrotInterface {

    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    public AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return null;
    }

    private double getBaseSpeed() {
        return 12.0;
    }

    private double getLoadFactor() {
        return 9.0;
    }
}
