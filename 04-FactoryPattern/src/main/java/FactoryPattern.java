public class FactoryPattern {
    public static void main(String[] args){
        Pizza myPizza = PizzaFactory.getPizza("CHEESE");

        myPizza.prepare();
    }
}
