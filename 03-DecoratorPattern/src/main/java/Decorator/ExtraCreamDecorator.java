package Decorator;

import Base.BaseCoffee;

public class ExtraCreamDecorator extends CoffeeDecoratorAbstract {
    BaseCoffee currentBaseCoffee;

    public ExtraCreamDecorator(BaseCoffee coffee){
        this.currentBaseCoffee = coffee;
    }

    @Override
    public int cost() {
        return currentBaseCoffee.cost()+30;
    }
}
