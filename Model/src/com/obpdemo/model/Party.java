package com.obpdemo.model;

public class Party {
    private String name = "Suncorp Employee";
   private String id;

   public Party(String id, String name){
       this.name = name;
       this.id = id;
       }
   
   public Party(){}
   
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
