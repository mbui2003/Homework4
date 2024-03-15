class NoRestrictionMacronutrientFactory implements MacronutrientAbstractFactory {
    private CarbsFactory carbsFactory = NoRestrictionCarbsFactory.getInstance();
    private ProteinFactory proteinFactory = NoRestrictionProteinFactory.getInstance();
    private FatsFactory fatsFactory = NoRestrictionFatsFactory.getInstance();

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