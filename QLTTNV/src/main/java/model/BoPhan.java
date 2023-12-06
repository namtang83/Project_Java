/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NamTang
 */
public class BoPhan {
    private String maBP;
    private String tenBP;

    public BoPhan(String maBP, String tenBP) {
        this.maBP = maBP;
        this.tenBP = tenBP;
    }

    public BoPhan() {
        this.maBP = new String();
        this.tenBP = new String();
    }

    public String getMaBP() {
        return maBP;
    }

    public void setMaBP(String maBP) {
        this.maBP = maBP;
    }

    public String getTenBP() {
        return tenBP;
    }

    public void setTenBP(String tenBP) {
        this.tenBP = tenBP;
    }
    
    
    
}
