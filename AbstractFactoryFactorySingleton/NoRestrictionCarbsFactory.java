import java.util.*;

class NoRestrictionCarbsFactory implements CarbsFactory {
    private static final NoRestrictionCarbsFactory instance = new NoRestrictionCarbsFactory();

    private NoRestrictionCarbsFactory() {}

    public static NoRestrictionCarbsFactory getInstance() {
        return instance;
    }

    @Override
    public Carbs createCarbs() {
        List<Carbs> options = Arrays.asList(new Cheese(), new Bread(), new Lentils(), new Pistachio());
        return options.get(new Random().nextInt(options.size()));
    }
}