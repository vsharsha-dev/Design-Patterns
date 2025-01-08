import Base.BaseCoffee;
import Base.Espresso;
import Decorator.ExtraCreamDecorator;
import Decorator.ExtraSugarDecorator;

public class DecoratorPattern {
    public static void main(String[] args){
        BaseCoffee coffee = new Espresso();
        BaseCoffee extraCreamSugarCoffee = new ExtraCreamDecorator(new ExtraSugarDecorator(coffee));

        System.out.println(extraCreamSugarCoffee.cost());
    }
}
