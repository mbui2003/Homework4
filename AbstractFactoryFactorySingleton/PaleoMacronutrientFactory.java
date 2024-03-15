class PaleoMacronutrientFactory implements MacronutrientAbstractFactory {
    private CarbsFactory carbsFactory = PaleoCarbsFactory.getInstance();
    private ProteinFactory proteinFactory = PaleoProteinFactory.getInstance();
    private FatsFactory fatsFactory = PaleoFatsFactory.getInstance();

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