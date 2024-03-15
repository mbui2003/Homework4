public class PizzaDriver {
    public static void main(String[] args) {
        System.out.println("Step 1 of \"Pizza and Movies!\" section of HW4:");

        Pizza smallThreeToppingPizza = new Pizza.PizzaBuilder("Pizza Hut", "Small")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .createPizza();
        Pizza mediumSixToppingPizza = new Pizza.PizzaBuilder("Pizza Hut", "Medium")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Extra Cheese")
                .createPizza();
        Pizza largeNineToppingPizza = new Pizza.PizzaBuilder("Pizza Hut", "Large")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Extra Cheese")
                .addTopping("Peppers")
                .addTopping("Chicken")
                .addTopping("Olives")
                .createPizza();

        smallThreeToppingPizza.eat();
        mediumSixToppingPizza.eat();
        largeNineToppingPizza.eat();

        System.out.println("\nStep 2 of \"Pizza and Movies!\" section of HW4:");

        Pizza largeThreeToppingPizzaHutPizza = new Pizza.PizzaBuilder("Pizza Hut", "Large").
                addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .createPizza();
        Pizza smallTwoToppingPizzaHutPizza = new Pizza.PizzaBuilder("Pizza Hut", "Small")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .createPizza();
        Pizza mediumEightToppingLittleCaesarsPizza = new Pizza.PizzaBuilder("Little Caesars", "Medium")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Extra Cheese")
                .addTopping("Peppers")
                .addTopping("Chicken")
                .createPizza();
        Pizza smallSixToppingLittleCaesarsPizza = new Pizza.PizzaBuilder("Little Caesars", "Small")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Extra Cheese")
                .createPizza();
        Pizza smallOneToppingDominosPizza = new Pizza.PizzaBuilder("Dominos", "Small")
                .addTopping("Pepperoni")
                .createPizza();
        Pizza largeThreeToppingDominosPizza = new Pizza.PizzaBuilder("Dominos", "Large")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .createPizza();

        largeThreeToppingPizzaHutPizza.eat();
        smallTwoToppingPizzaHutPizza.eat();
        mediumEightToppingLittleCaesarsPizza.eat();
        smallSixToppingLittleCaesarsPizza.eat();
        smallOneToppingDominosPizza.eat();
        largeThreeToppingDominosPizza.eat();
    }
}
