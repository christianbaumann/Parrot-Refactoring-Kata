package parrot;

public class AfricanParrot implements ParrotInterface {

    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;
    private double baseSpeed = 12.0;
    private double loadFactor = 9.0;
    private String cry = "Sqaark!";

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
        return cry;
    }

    private double getBaseSpeed() {
        return baseSpeed;
    }

    private double getLoadFactor() {
        return loadFactor;
    }
}
