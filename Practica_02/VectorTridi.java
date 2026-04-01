/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;
public class VectorTridi {

    private double x, y, z;

    // Constructores
    public VectorTridi() {
        x = 0;
        y = 0;
        z = 0;}

    public VectorTridi(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;}

    public VectorTridi suma(VectorTridi v) {
        return new VectorTridi(
            this.x + v.x,
            this.y + v.y,
            this.z + v.z); }

    public VectorTridi escalar(double r) {
        return new VectorTridi(
            r * this.x,
            r * this.y,
            r * this.z);}
    
    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);}

    public VectorTridi normal() {
        double mag = magnitud();
        if (mag == 0) return new VectorTridi(0,0,0);

        return new VectorTridi(
            x/mag,
            y/mag,
            z/mag);}

    public double productoEscalar(VectorTridi v) {
        return this.x*v.x + this.y*v.y + this.z*v.z;}

    public VectorTridi productoVectorial(VectorTridi v) {
        double cx = this.y*v.z - this.z*v.y;
        double cy = this.z*v.x - this.x*v.z;
        double cz = this.x*v.y - this.y*v.x;
        return new VectorTridi(cx, cy, cz);}

    public void mostrar() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");}

    public static void main(String[] args) {

        VectorTridi a = new VectorTridi(1, 2, 3);
        VectorTridi b = new VectorTridi(4, 5, 6);

        System.out.print("Suma ");
        a.suma(b).mostrar();

        System.out.print("Escalar (2*a) ");
        a.escalar(2).mostrar();

        System.out.println("Magnitud de a " + a.magnitud());

        System.out.print("Vector normal de a ");
        a.normal().mostrar();

        System.out.println("Producto escalar " + a.productoEscalar(b));

        System.out.print("Producto vectorial ");
        a.productoVectorial(b).mostrar();
    }
}