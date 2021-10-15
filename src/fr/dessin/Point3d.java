package fr.dessin;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Point3d extends Point2D {
    private int z;

    public Point3d() {
    }

    public Point3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }


    public void translater(int dX, int dY) {
        super.translater(dX, dY);
    }

    public void translater(int dX, int dY, int dz) {
        super.translater(dX, dY);
        this.z += dz;
    }

    @Override
    public void afficher() {
        int dX = super.getX();
        int dY = super.getY();
        List<Integer> afficher = new ArrayList<>();
        afficher.add(dX);
        afficher.add(dY);
        afficher.add(this.z);
        System.out.println(afficher);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

}
