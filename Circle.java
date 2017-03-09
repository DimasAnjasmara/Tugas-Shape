/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author INDOPORCELAIN
 */
class Circle extends Shape {
    
    private double alas;
    private double tinggi;
    private String nama;
    private double area;

    @Override
    public String getName() {
        return nama;
    }

    @Override
    public double getArea() {
        this.area = 1/2 * this.getAlas() * this.getTinggi();
        return area;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    
    
}
   
   
