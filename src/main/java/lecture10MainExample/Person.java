package lecture10MainExample;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter

public class Person {
    private String name;
    private double money;
    private List<Product> bagOfProducts;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.bagOfProducts = new ArrayList<>();
    }

    public boolean hasEnoughMoney(double money){
        return this.money>=money;
    }

    public void buyProduct(Product product){
        this.money -= product.getCost();
        this.bagOfProducts.add(product);
    }

    private void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name can not be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if(money<0){
            throw new IllegalArgumentException("Money can not be negative");
        }
        this.money = money;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.name, this.bagOfProducts.size()==0 ? "Nothing bought" : this.bagOfProducts.stream().map(Product::getName).collect(Collectors.joining(", ")));
    }
}
