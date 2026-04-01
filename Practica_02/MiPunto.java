/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;
public class MiPunto {
    private double x;
    private double y;

    public MiPunto() {
        this.x = 0;
        this.y = 0;
    }

    public MiPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distancia(MiPunto p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distancia(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        MiPunto p1 = new MiPunto(); 
        MiPunto p2 = new MiPunto(10, 30.5); 

        double d = p1.distancia(p2);

        System.out.println("Punto 1: (0,0)");
        System.out.println("Punto 2: (10,30.5)");
        System.out.println("Distancia: " + d);
    }
}