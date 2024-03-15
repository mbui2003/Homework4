import java.util.*;

public class Pizza {
    private String pizzaChain;
    private String size;
    private List<String> toppings;

    private Pizza(PizzaBuilder builder) {
        this.pizzaChain = builder.pizzaChain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public void eat() {
        System.out.println(size + " " + pizzaChain + " pizza with " + toppings.size() + " topping(s). "
                + "Toppings: " + String.join(", ", toppings));
    }

    public static class PizzaBuilder {
        private String pizzaChain;
        private String size;
        private List<String> toppings;
        private Set<String> validSizes = new HashSet<>(Arrays.asList("Small", "Medium", "Large"));
        private Set<String> validPizzaChains = new HashSet<>(Arrays.asList("Pizza Hut", "Little Caesars", "Dominos"));

        private List<String> validToppings = Arrays.asList("Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions",
                "Extra Cheese", "Peppers", "Chicken", "Olives", "Spinach", "Tomato and Basil", "Beef", "Ham", "Pesto",
                "Spicy Pork", "Ham and Pineapple");

        public PizzaBuilder(String pizzaChain, String size) {
            if(pizzaChainOrSizeIsInvalid(pizzaChain, size)) {
                throw new IllegalArgumentException("Pizza Chain and Size must both be set to a valid value.");
            }
            this.pizzaChain = pizzaChain;
            this.size = size;
            this.toppings = new ArrayList<>();
        }

        private boolean pizzaChainOrSizeIsInvalid(String pizzaChain, String size) {
            return (!validPizzaChains.contains(pizzaChain) || !validSizes.contains(size));
        }

        public PizzaBuilder addTopping(String topping) {
            if (containsInvalidTopping(topping)) {
                throw new IllegalArgumentException("Invalid topping(s).");
            }
            toppings.add(topping);
            return this;
        }

        private boolean containsInvalidTopping(String topping) {
            return !validToppings.contains(topping);
        }

        public Pizza createPizza() {
            return new Pizza(this);
        }
    }
}
