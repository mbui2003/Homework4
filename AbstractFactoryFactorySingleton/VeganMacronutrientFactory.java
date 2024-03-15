class VeganMacronutrientFactory implements MacronutrientAbstractFactory {
    private CarbsFactory carbsFactory = VeganCarbsFactory.getInstance();
    private ProteinFactory proteinFactory = VeganProteinFactory.getInstance();
    private FatsFactory fatsFactory = VeganFatsFactory.getInstance();

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