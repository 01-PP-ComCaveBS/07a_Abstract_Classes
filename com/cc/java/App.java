package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Rechangle Rechangle = new Rechangle(10.0, 10.0);
        Circle circle = new Circle(5.0);
        Triangle triangle = new Triangle(10.0,10.0);


        // Das geht jetzt nicht mehr ... Abstraktion
       // Shape shape = new Shape() {   
       // };

       output("------ Flächen ------"); 
        output("Fläche Rechteck: " + Rechangle.area());
        output("Fläche Kreis: " + circle.area());
        output("Fläche Dreieck: " + triangle.area());

        output(("----Differenzen----"));
        output(("Diff. r-t: " + areaDiff(Rechangle, triangle)));
        output(("Diff. r-t: " + areaDiff(Rechangle, circle)));
        

        output("Diff. c-r: " + areaDiff(circle,Rechangle));
            output("Diff. c-t: " + areaDiff(circle, triangle));
            output("Diff. t-t: " + areaDiff(triangle, triangle));
    
    
    }

  
    // 1. iteration : ggf. 1000x überladen ...
    //private static double areaDiff(Rechangle r, Triangle t){
    //    return r.area() - t.area();


        // 2. iteration : polymorphie - besse ! // Safe , Bro ; safe !
       private static double areaDiff(Shape s1, Shape s2){
       return s1.area() - s2.area();

    


   
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

