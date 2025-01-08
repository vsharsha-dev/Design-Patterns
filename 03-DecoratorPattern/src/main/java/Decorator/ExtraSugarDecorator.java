package Decorator;

import Base.BaseCoffee;

public class ExtraSugarDecorator extends CoffeeDecoratorAbstract {
    BaseCoffee currentBaseCoffee;

    public ExtraSugarDecorator(BaseCoffee coffee){
        this.currentBaseCoffee = coffee;
    }

    @Override
    public int cost(){
        return currentBaseCoffee.cost()+5;
    }
}
