import java.util.*;

public class MacronutrientDriver {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Customer 1", "No Restriction"),
                new Customer("Customer 2", "Paleo"),
                new Customer("Customer 3", "Vegan"),
                new Customer("Customer 4", "Nut Allergy"),
                new Customer("Customer 5", "No Restriction"),
                new Customer("Customer 6", "Paleo")
        );

        for (Customer customer : customers) {
            MacronutrientAbstractFactory mealFactory = createMacronutrientFactory(customer.getDietPlan());

            Carbs carbs = mealFactory.createCarbs();
            Protein protein = mealFactory.createProtein();
            Fats fats = mealFactory.createFats();

            System.out.println(customer.getName() + "'s Meal:");
            System.out.println("Carbs: " + carbs.getClass().getSimpleName());
            System.out.println("Protein: " + protein.getClass().getSimpleName());
            System.out.println("Fats: " + fats.getClass().getSimpleName());
            System.out.println();
        }
    }

    public static MacronutrientAbstractFactory createMacronutrientFactory(String dietPlan) {
        switch (dietPlan) {
            case "No Restriction":
                return new NoRestrictionMacronutrientFactory();
            case "Paleo":
                return new PaleoMacronutrientFactory();
            case "Vegan":
                return new VeganMacronutrientFactory();
            case "Nut Allergy":
                return new NutAllergyMacronutrientFactory();
            default:
                throw new IllegalArgumentException("Invalid diet plan.");
        }
    }
}
