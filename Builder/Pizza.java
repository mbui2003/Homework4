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

        public PizzaBuilder addPepperoni() {
            toppings.add("Pepperoni");
            return this;
        }

        public PizzaBuilder addSausage() {
            toppings.add("Sausage");
            return this;
        }

        public PizzaBuilder addMushrooms() {
            toppings.add("Mushrooms");
            return this;
        }

        public PizzaBuilder addBacon() {
            toppings.add("Bacon");
            return this;
        }

        public PizzaBuilder addOnions() {
            toppings.add("Onions");
            return this;
        }

        public PizzaBuilder addExtraCheese() {
            toppings.add("Extra Cheese");
            return this;
        }

        public PizzaBuilder addPeppers() {
            toppings.add("Peppers");
            return this;
        }

        public PizzaBuilder addChicken() {
            toppings.add("Chicken");
            return this;
        }

        public PizzaBuilder addOlives() {
            toppings.add("Olives");
            return this;
        }

        public PizzaBuilder addSpinach() {
            toppings.add("Spinach");
            return this;
        }

        public PizzaBuilder addTomatoAndBasil() {
            toppings.add("Tomato and Basil");
            return this;
        }

        public PizzaBuilder addBeef() {
            toppings.add("Beef");
            return this;
        }

        public PizzaBuilder addHam() {
            toppings.add("Ham");
            return this;
        }

        public PizzaBuilder addPesto() {
            toppings.add("Pesto");
            return this;
        }

        public PizzaBuilder addSpicyPork() {
            toppings.add("Spicy Pork");
            return this;
        }

        public PizzaBuilder addHamAndPineapple() {
            toppings.add("Ham and Pineapple");
            return this;
        }

        public Pizza createPizza() {
            return new Pizza(this);
        }
    }
}
