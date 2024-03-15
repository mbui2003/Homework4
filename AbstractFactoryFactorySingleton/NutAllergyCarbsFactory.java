import java.util.*;

class NutAllergyCarbsFactory implements CarbsFactory {
    private static final NutAllergyCarbsFactory instance = new NutAllergyCarbsFactory();

    private NutAllergyCarbsFactory() {}

    public static NutAllergyCarbsFactory getInstance() {
        return instance;
    }

    @Override
    public Carbs createCarbs() {
        List<Carbs> options = Arrays.asList(new Cheese(), new Bread(), new Lentils());
        return options.get(new Random().nextInt(options.size()));
    }
}