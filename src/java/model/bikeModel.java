/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author oem
 */
public class bikeModel {
    private int bikeid;
    private String name;
    private String price;
    private String description;
    private String image1;
    private String image2;
    private String image3;

    public bikeModel(int bikeid, String name, String price, String description, String image1, String image2, String image3) {
        this.bikeid = bikeid;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }

    public bikeModel() {
    }

    public int getBikeid() {
        return bikeid;
    }

    public void setBikeid(int bikeid) {
        this.bikeid = bikeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }
    
    
    
    
    
    
    
}
