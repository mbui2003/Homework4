import java.util.Arrays;
import java.util.List;
import java.util.Random;

class VeganFatsFactory implements FatsFactory {
    private static final VeganFatsFactory instance = new VeganFatsFactory();

    private VeganFatsFactory() {}

    public static VeganFatsFactory getInstance() {
        return instance;
    }

    @Override
    public Fats createFats() {
        List<Fats> options = Arrays.asList(new Avocado(), new Peanuts());
        return options.get(new Random().nextInt(options.size()));
    }
}