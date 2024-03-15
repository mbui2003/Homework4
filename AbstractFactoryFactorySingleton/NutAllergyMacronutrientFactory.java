class NutAllergyMacronutrientFactory implements MacronutrientAbstractFactory {
    private CarbsFactory carbsFactory = NutAllergyCarbsFactory.getInstance();
    private ProteinFactory proteinFactory = NutAllergyProteinFactory.getInstance();
    private FatsFactory fatsFactory = NutAllergyFatsFactory.getInstance();

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