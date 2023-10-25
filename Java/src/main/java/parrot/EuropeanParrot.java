package parrot;

public class EuropeanParrot implements ParrotInterface {

    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;
    private double speed = 12.0;
    private String cry = "Sqoork!";

    public EuropeanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public String getCry() {
        return cry;
    }
}
