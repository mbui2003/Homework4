public class VeganMacronutrientFactory implements MacronutrientAbstractFactory {
    private static final VeganMacronutrientFactory instance = new VeganMacronutrientFactory();

    private CarbsFactory carbsFactory = VeganCarbsFactory.getInstance();
    private ProteinFactory proteinFactory = VeganProteinFactory.getInstance();
    private FatsFactory fatsFactory = VeganFatsFactory.getInstance();

    private VeganMacronutrientFactory() {
    }

    public static VeganMacronutrientFactory getInstance() {
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
