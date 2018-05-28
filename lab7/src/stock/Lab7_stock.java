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
public class Lab7_stock {

    public static void main(String[] args) {
        
        product cement = new product("cement",14,50,200);
        product nails = new product("nails",500,1,3);
        product tile = new product("tile",200,4,40);
        
        stock stock = new stock("constructionWarehouse");
        stock.setCement(cement);
        stock.setNails(nails);
        stock.setTile(tile);
        
        int totalCount = storekeeper.calculateTotsCount(stock);
        int totalPrice = storekeeper.calculateTotsPrice(stock);
        int totalWeight = storekeeper.calculateTotsWeight(stock);
        
        View.print(stock + "");
        View.print("\n Total count = " + totalCount);
        View.print("\n Total price = " + totalPrice);
        View.print("\n Total weight = " + totalWeight);
    }
    
}
