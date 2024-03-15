import java.util.*;

class NutAllergyProteinFactory implements ProteinFactory {
    private static final NutAllergyProteinFactory instance = new NutAllergyProteinFactory();

    private NutAllergyProteinFactory() {}

    public static NutAllergyProteinFactory getInstance() {
        return instance;
    }

    @Override
    public Protein createProtein() {
        List<Protein> options = Arrays.asList(new Fish(), new Chicken(), new Beef(), new Tofu());
        return options.get(new Random().nextInt(options.size()));
    }
}