package Decorator;

import Base.BaseCoffee;

public class ExtraMilkDecorator extends CoffeeDecoratorAbstract {
    BaseCoffee currentBaseCoffee;

    public ExtraMilkDecorator(BaseCoffee coffee){
        this.currentBaseCoffee = coffee;
    }

    @Override
    public int cost(){
        return currentBaseCoffee.cost()+20;
    }
}
