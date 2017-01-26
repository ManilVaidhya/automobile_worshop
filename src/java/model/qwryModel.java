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
public class qwryModel {
    private int cmid;
    private String Name;
    private String phone;
    private String message;

    public qwryModel(int cmid, String Name, String phone, String message) {
        this.cmid = cmid;
        this.Name = Name;
        this.phone = phone;
        this.message = message;
    }

    public qwryModel() {
    }
    
    

    public int getCmid() {
        return cmid;
    }

    public void setCmid(int cmid) {
        this.cmid = cmid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
