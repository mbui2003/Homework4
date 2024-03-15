import java.util.*;

class PaleoFatsFactory implements FatsFactory {
    private static final PaleoFatsFactory instance = new PaleoFatsFactory();

    private PaleoFatsFactory() {}

    public static PaleoFatsFactory getInstance() {
        return instance;
    }

    @Override
    public Fats createFats() {
        List<Fats> options = Arrays.asList(new Avocado(), new Tuna(), new Peanuts());
        return options.get(new Random().nextInt(options.size()));
    }
}