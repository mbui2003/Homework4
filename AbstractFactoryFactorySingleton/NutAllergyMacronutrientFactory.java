public class NutAllergyMacronutrientFactory implements MacronutrientAbstractFactory {
    private static final NutAllergyMacronutrientFactory instance = new NutAllergyMacronutrientFactory();

    private CarbsFactory carbsFactory = NutAllergyCarbsFactory.getInstance();
    private ProteinFactory proteinFactory = NutAllergyProteinFactory.getInstance();
    private FatsFactory fatsFactory = NutAllergyFatsFactory.getInstance();

    private NutAllergyMacronutrientFactory() {
    }

    public static NutAllergyMacronutrientFactory getInstance() {
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
