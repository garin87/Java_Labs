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
public class storekeeper {
    
    public static int calculateTotsCount( stock stock){
      int total = stock.getCement().getCount() + stock.getNails().getCount() +
              stock.getTile().getCount();
      
      return total;  
    } 
    
    public static int calculateTotsPrice( stock stock){
      int price = (stock.getCement().getPrice() * stock.getCement().getCount()) +
              (stock.getNails().getPrice() * stock.getNails().getCount() ) +
              (stock.getTile().getPrice()* stock.getTile().getCount());
      
      return price;  
    } 
    
    public static int calculateTotsWeight( stock stock){
      int weight = stock.getCement().getWeight() + stock.getNails().getWeight() +
              stock.getTile().getWeight();
      
      return weight;  
    } 
}
