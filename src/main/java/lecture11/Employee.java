package lecture11;

import lecture10MainExample.Person;
import lecture10MainExample.Product;

public class Employee extends Person {

    protected Employee (String name, double money){
        super(name, money);
    }

    @Override
    public void buyProduct(Product product) {
        super.buyProduct(product);
    }
}
