public class NoRestrictionMacronutrientFactory implements MacronutrientAbstractFactory {
    private static final NoRestrictionMacronutrientFactory instance = new NoRestrictionMacronutrientFactory();

    private CarbsFactory carbsFactory = NoRestrictionCarbsFactory.getInstance();
    private ProteinFactory proteinFactory = NoRestrictionProteinFactory.getInstance();
    private FatsFactory fatsFactory = NoRestrictionFatsFactory.getInstance();

    private NoRestrictionMacronutrientFactory() {
    }

    public static NoRestrictionMacronutrientFactory getInstance() {
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
