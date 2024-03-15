import java.util.Arrays;
import java.util.List;
import java.util.Random;

class VeganCarbsFactory implements CarbsFactory {
    private static final VeganCarbsFactory instance = new VeganCarbsFactory();

    private VeganCarbsFactory() {}

    public static VeganCarbsFactory getInstance() {
        return instance;
    }

    @Override
    public Carbs createCarbs() {
        List<Carbs> options = Arrays.asList(new Bread(), new Lentils(), new Pistachio());
        return options.get(new Random().nextInt(options.size()));
    }
}