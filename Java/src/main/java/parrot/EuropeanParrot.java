package parrot;

public class EuropeanParrot implements ParrotInterface {

    private double speed = 12.0;
    private String cry = "Sqoork!";

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
