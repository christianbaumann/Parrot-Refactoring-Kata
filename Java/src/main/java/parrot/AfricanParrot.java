package parrot;

public class AfricanParrot implements ParrotInterface {

    private final int numberOfCoconuts;

    private final double baseSpeed = 12.0;
    private final double loadFactor = 9.0;
    private final String cry = "Sqaark!";

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
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
