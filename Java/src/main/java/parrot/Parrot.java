package parrot;

public class Parrot {

    private ParrotInterface parrot;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        parrot = switch (type){
            case EUROPEAN -> new EuropeanParrot();
            case AFRICAN -> new AfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(voltage, isNailed);
        };
    }

    public double getSpeed() {
        return parrot.getSpeed();
    }

    public String getCry() {
        return parrot.getCry();
    }
}
