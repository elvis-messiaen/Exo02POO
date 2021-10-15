package fr.dessin;

import java.util.ArrayList;
import java.util.List;

public class Point2D {
    private int x;
    private int y;
    public static int compteur;

    public Point2D() {

    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
        compteur++;
    }

    public void afficher() {
        List<Integer> afficher = new ArrayList<>();
        afficher.add(this.x);
        afficher.add(this.y);
        System.out.println(afficher);
    }

    public void translater(int dX, int dY) {
        this.x += dX;
        this.y += dY;
    }

    public static int getCompteur() {
        return compteur;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "compteur de nombre d'instance " + compteur;
    }
}
