import java.util.*;

class NutAllergyFatsFactory implements FatsFactory {
    private static final NutAllergyFatsFactory instance = new NutAllergyFatsFactory();

    private NutAllergyFatsFactory() {}

    public static NutAllergyFatsFactory getInstance() {
        return instance;
    }

    @Override
    public Fats createFats() {
        List<Fats> options = Arrays.asList(new Avocado(), new SourCream(), new Tuna());
        return options.get(new Random().nextInt(options.size()));
    }
}