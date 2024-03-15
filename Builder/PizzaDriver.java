public class PizzaDriver {
    public static void main(String[] args) {
        System.out.println("Step 1 of \"Pizza and Movies!\" section of HW4:");

        Pizza smallThreeToppingPizza = new Pizza.PizzaBuilder("Pizza Hut", "Small")
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .createPizza();
        Pizza mediumSixToppingPizza = new Pizza.PizzaBuilder("Pizza Hut", "Medium")
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .addBacon()
                .addOnions()
                .addExtraCheese()
                .createPizza();
        Pizza largeNineToppingPizza = new Pizza.PizzaBuilder("Pizza Hut", "Large")
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .addBacon()
                .addOnions()
                .addExtraCheese()
                .addPeppers()
                .addChicken()
                .addOlives()
                .createPizza();

        smallThreeToppingPizza.eat();
        mediumSixToppingPizza.eat();
        largeNineToppingPizza.eat();

        System.out.println("\nStep 2 of \"Pizza and Movies!\" section of HW4:");

        Pizza largeThreeToppingPizzaHutPizza = new Pizza.PizzaBuilder("Pizza Hut", "Large")
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .createPizza();
        Pizza smallTwoToppingPizzaHutPizza = new Pizza.PizzaBuilder("Pizza Hut", "Small")
                .addPepperoni()
                .addSausage()
                .createPizza();
        Pizza mediumEightToppingLittleCaesarsPizza = new Pizza.PizzaBuilder("Little Caesars", "Medium")
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .addBacon()
                .addOnions()
                .addExtraCheese()
                .addPeppers()
                .addChicken()
                .createPizza();
        Pizza smallSixToppingLittleCaesarsPizza = new Pizza.PizzaBuilder("Little Caesars", "Small")
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .addBacon()
                .addOnions()
                .addExtraCheese()
                .createPizza();
        Pizza smallOneToppingDominosPizza = new Pizza.PizzaBuilder("Dominos", "Small")
                .addPepperoni()
                .createPizza();
        Pizza largeThreeToppingDominosPizza = new Pizza.PizzaBuilder("Dominos", "Large")
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .createPizza();

        largeThreeToppingPizzaHutPizza.eat();
        smallTwoToppingPizzaHutPizza.eat();
        mediumEightToppingLittleCaesarsPizza.eat();
        smallSixToppingLittleCaesarsPizza.eat();
        smallOneToppingDominosPizza.eat();
        largeThreeToppingDominosPizza.eat();
    }
}
