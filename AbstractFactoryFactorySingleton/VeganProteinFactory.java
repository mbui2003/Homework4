class VeganProteinFactory implements ProteinFactory {
    private static final VeganProteinFactory instance = new VeganProteinFactory();

    private VeganProteinFactory() {}

    public static VeganProteinFactory getInstance() {
        return instance;
    }

    @Override
    public Protein createProtein() {
        return new Tofu();
    }
}