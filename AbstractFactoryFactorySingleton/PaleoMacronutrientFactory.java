public class PaleoMacronutrientFactory implements MacronutrientAbstractFactory {
    private static final PaleoMacronutrientFactory instance = new PaleoMacronutrientFactory();

    private CarbsFactory carbsFactory = PaleoCarbsFactory.getInstance();
    private ProteinFactory proteinFactory = PaleoProteinFactory.getInstance();
    private FatsFactory fatsFactory = PaleoFatsFactory.getInstance();

    private PaleoMacronutrientFactory() {
    }

    public static PaleoMacronutrientFactory getInstance() {
        return instance;
    }

    @Override
    public Carbs createCarbs() {
        return carbsFactory.createCarbs();
    }

    @Override
    public Protein createProtein() {
        return proteinFactory.createProtein();
    }

    @Override
    public Fats createFats() {
        return fatsFactory.createFats();
    }
}
