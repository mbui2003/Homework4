class PaleoCarbsFactory implements CarbsFactory {
    private static final PaleoCarbsFactory instance = new PaleoCarbsFactory();

    private PaleoCarbsFactory() {}

    public static PaleoCarbsFactory getInstance() {
        return instance;
    }

    @Override
    public Carbs createCarbs() {
        return new Pistachio();
    }
}