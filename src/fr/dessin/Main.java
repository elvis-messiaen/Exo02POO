package fr.dessin;

public class Main {

    public static void main(String[] args) {
        Point2D p = new Point2D(4, 34);
        Point2D p2 = new Point2D(5, 25);
        p.afficher();
        p.translater(7, 14);
        p.afficher();
        System.out.println(p);

        Point3d point3d = new Point3d(5, 5, 14);
        point3d.translater(41,77,88);
        point3d.afficher();
        System.out.println(point3d);
    }
}
