package org.gfn.user;

/**
 * @author H-Bahiraei
 * Created on 10/23/2022
 */

//@Component("loplop")
public class Laptop {


    public Laptop() {
        System.out.println("Laptop.Laptop is created!!!!");

    }

    private int lid;
    private String brand;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void compilng() {
        System.out.println("Laptop.compilng");
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "lid=" + lid +
                ", brand='" + brand + '\'' +
                '}';
    }
}
