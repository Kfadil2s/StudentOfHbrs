package org.hbrs.se1.ws25.uebung4.prototype.Model;

public class Expertise implements java.io.Serializable {

    private String name;
    private Integer level;

    public Expertise(String name, Integer level){
        this.name = name;
        this.level = level;
    }
}
