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
public class stock {
    
    private String name;
    private product nails;
    private product cement;
    private product tile;
    
    public stock(){}
    
    public stock(String name){this.name = name;}
    
    public stock(String name, product nails, product cement, product tile) {
        this.name = name;
        this.nails = nails;
        this.cement = cement;
        this.tile = tile;
    }

    public String getName() {
        return name;
    }

    public product getNails() {
        return nails;
    }

    public product getCement() {
        return cement;
    }

    public product getTile() {
        return tile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNails(product nails) {
        this.nails = nails;
    }

    public void setCement(product cement) {
        this.cement = cement;
    }

    public void setTile(product tile) {
        this.tile = tile;
    }

    @Override
    public String toString() {
        return "stock " + name + "\n" + nails + "\n" + cement + "\n" + tile;
    }

    
    
}
