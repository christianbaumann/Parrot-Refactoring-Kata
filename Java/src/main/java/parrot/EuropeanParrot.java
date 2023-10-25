package parrot;

public class EuropeanParrot implements ParrotInterface {

    private final String cry = "Sqoork!";
    private final double speed = 12.0;

    public EuropeanParrot() {
    }

    @Override
    public String getCry() {
        return cry;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
