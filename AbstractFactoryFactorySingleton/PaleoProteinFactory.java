import java.util.*;

class PaleoProteinFactory implements ProteinFactory {
    private static final PaleoProteinFactory instance = new PaleoProteinFactory();

    private PaleoProteinFactory() {}

    public static PaleoProteinFactory getInstance() {
        return instance;
    }

    @Override
    public Protein createProtein() {
        List<Protein> options = Arrays.asList(new Fish(), new Chicken(), new Beef());
        return options.get(new Random().nextInt(options.size()));
    }
}