/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author INDOPORCELAIN
 */
class Square extends Shape{
    
   private double p=2;
   private double l=4;
   private String name;
   private double  area;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double  getArea() {
       this.area = this.getP() * this.getL();
       return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setL(double l) {
        this.l = l;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public double getP() {
        return p;
    }
    
   
    
   
   

    
}
