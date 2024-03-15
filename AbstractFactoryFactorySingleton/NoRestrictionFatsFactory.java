import java.util.*;

class NoRestrictionFatsFactory implements FatsFactory {
    private static final NoRestrictionFatsFactory instance = new NoRestrictionFatsFactory();

    private NoRestrictionFatsFactory() {}

    public static NoRestrictionFatsFactory getInstance() {
        return instance;
    }

    @Override
    public Fats createFats() {
        List<Fats> options = Arrays.asList(new Avocado(), new SourCream(), new Tuna(), new Peanuts());
        return options.get(new Random().nextInt(options.size()));
    }
}