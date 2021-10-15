package fr.dessin;

import java.util.ArrayList;
import java.util.List;

public class Point2D {
    private int x;
    private int y;

    public Point2D () {

    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void afficher (){
        List<Integer> afficher = new ArrayList<>();
        afficher.add(this.x);
        afficher.add(this.y);
        System.out.println(afficher);
    }
    public void translater (int dX, int dY) {
        this.x += dX;
        this.y += dY;

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
}
