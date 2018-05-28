/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

/**
 * 27.05.2018
 * Group pois1709v
 * @author Stas ilyukovich
 * v 1.0
 */
public class product {
   
    private String name;
    private int count;
    private int weight;
    private int price;

    public product(String name, int count, int weight, int price) {
        this.name = name;
        this.count = count;
        this.weight = weight;
        this.price = price;
    }
    
    
    public String getName() {
        return name; 
    }
    
    public void setName(String name) {
          this.name = name;
    }
    
    public int getWeight() {
        return weight; 
    }
    
    public void setWeight(int weight) {
          this.weight = weight;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return  name +": " + " count " + count + ", weight " + weight + ", price " + price;
    }
    
    
}
