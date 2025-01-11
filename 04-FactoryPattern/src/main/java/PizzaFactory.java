public class PizzaFactory {

    static Pizza getPizza(String pizzaType){
        if(pizzaType.equals("CHEESE")){
            return new CheesePizza();
        }
        else if(pizzaType.equals("MARGHARITA")){
            return new MargharitaPizza();
        }
        return null;
    }

}
