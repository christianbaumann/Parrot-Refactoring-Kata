package parrot;

public class Parrot {

    private ParrotInterface parrot;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        parrot = switch (type){
            case EUROPEAN -> new EuropeanParrot(numberOfCoconuts, voltage, isNailed);
            case AFRICAN -> new AfricanParrot(numberOfCoconuts, voltage, isNailed);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(numberOfCoconuts, voltage, isNailed);
        };
    }

    public double getSpeed() {
        return parrot.getSpeed();
    }

    public String getCry() {
        return parrot.getCry();
    }
}
