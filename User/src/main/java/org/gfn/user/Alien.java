package org.gfn.user;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author H-Bahiraei
 * Created on 10/23/2022
 */

//@Component
@Entity
public class Alien {


    @Id
    private int aid;

    private String aname;

    private String tech;


    public Alien() {
        System.out.println("Alien.Alien is created...");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }


//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//
//    public void methodOne(){
//        System.out.println("Alien.methodOne");
//        laptop.compilng();
//    }


    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aname='" + aname + '\'' +
                ", aid=" + aid +
                '}';
    }
}
