package parrot;

public class EuropeanParrot implements ParrotInterface {

    private final double speed = 12.0;
    private final String cry = "Sqoork!";

    public EuropeanParrot() {
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
