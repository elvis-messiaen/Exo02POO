package fr.dessin;

public class Main {

    public static void main(String[] args) {
    Point2D p = new Point2D(4,34);
    Point2D p2 = new Point2D(5,25);
    p.afficher();
    p.translater(7,14);
    p.afficher();
    System.out.println(p);
    }
}
