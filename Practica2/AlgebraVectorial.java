/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;
public class AlgebraVectorial {
    private double ax, ay;
    private double bx, by;

    public AlgebraVectorial() {
        ax = 0;
        ay = 0;
        bx = 0;
        by = 0;}

    public AlgebraVectorial(double ax, double ay, double bx, double by) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;}

    private double magnitud(double x, double y) {
        return Math.sqrt(x*x + y*y);}

    private double punto() {
        return ax*bx + ay*by;}

    private double cruz() {
        return ax*by - ay*bx;}

    // Perpendicular. Si el vector a es ortogonal o perpendicular a b: |a + b| = |a − b|
    public boolean perpendicular() {
        double suma = magnitud(ax+bx, ay+by);
        double resta = magnitud(ax-bx, ay-by);
        return Math.abs(suma - resta) < 0.0001;
    }

    // b)  Perpendicular. Si el vector a es mutuamente ortogonal a b: |a − b| = |b − a|
    public boolean perpendicular(AlgebraVectorial v) {
        double ab = magnitud(ax-bx, ay-by);
        double ba = magnitud(bx-ax, by-ay);
        return Math.abs(ab - ba) < 0.0001;
    }

    // c)Perpendicular. Si el vector a es ortogonal a b: a · b = 0
    public boolean perpendicular(double t) {
        return punto() == 0;
    }

    // d) Perpendicular. Si el vector a es ortogonal a b:  |a + b|² = |a|² + |b|²
    public boolean perpendicular(double x, double y) {
        double izq = Math.pow(magnitud(ax+bx, ay+by),2);
        double der = Math.pow(magnitud(ax, ay),2) + Math.pow(magnitud(bx, by),2);
        return Math.abs(izq - der) < 0.0001;
    }

    // e) Paralela. Si el vector a es paralela a b: a = rb
    public boolean paralela() {
        if (bx == 0 && by == 0) return false;

        double r1 = (bx != 0) ? ax/bx : 0;
        double r2 = (by != 0) ? ay/by : 0;

        return Math.abs(r1 - r2) < 0.0001;}
    //f)Paralela. Si el vector a es paralela a b: a × b = 0
    public boolean paralela(AlgebraVectorial v) {
        return cruz() == 0;
    }

    // g) Proyeccion de a sobre b. La proyeccion ortogonal de a sobre b: 
    public double[] proyeccion() {
        double escalar = punto() / Math.pow(magnitud(bx, by), 2);
        double px = escalar * bx;
        double py = escalar * by;
        return new double[]{px, py};
    }

    // h) Componente de a en b. El componente de a en la direcci´on de b: 
    public double componente() {
        return punto() / magnitud(bx, by);
    }

    // MAIN
    public static void main(String[] args) {

        AlgebraVectorial v = new AlgebraVectorial(2, 4, 1, 2);

        if (v.perpendicular()) {
            System.out.println("a) Los vectores son perpendiculares");
        } else {
            System.out.println("a) No son perpendiculares");}

        if (v.perpendicular(v)) {
            System.out.println("b) Los vectores son perpendiculares");
        } else {
            System.out.println("b) No son perpendiculares");
        }

        if (v.perpendicular(0)) {
            System.out.println("c) Los vectores son perpendiculares");
        } else {
            System.out.println("c) No son perpendiculares");
        }

        if (v.perpendicular(1,1)) {
            System.out.println("d) Los vectores son perpendiculares");
        } else {
            System.out.println("d) No son perpendiculares");
        }

        // PARALELOS
        if (v.paralela()) {
            System.out.println("e) Los vectores son paralelos");
        } else {
            System.out.println("e) No son paralelos");
        }

        if (v.paralela(v)) {
            System.out.println("f) Los vectores son paralelos");
        } else {
            System.out.println("f) No son paralelos");
        }

        // PROYECCIÓN
        double[] p = v.proyeccion();
        System.out.println("g) Proyección: (" + p[0] + ", " + p[1] + ")");

        // COMPONENTE
        System.out.println("h) Componente: " + v.componente());
    }
}