import java.util.*;

class NoRestrictionProteinFactory implements ProteinFactory {
    private static final NoRestrictionProteinFactory instance = new NoRestrictionProteinFactory();

    private NoRestrictionProteinFactory() {}

    public static NoRestrictionProteinFactory getInstance() {
        return instance;
    }

    @Override
    public Protein createProtein() {
        List<Protein> options = Arrays.asList(new Fish(), new Chicken(), new Beef(), new Tofu());
        return options.get(new Random().nextInt(options.size()));
    }
}
