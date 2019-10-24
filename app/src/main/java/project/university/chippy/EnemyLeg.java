package project.university.chippy;

import android.graphics.Bitmap;
import android.graphics.Rect;

public class EnemyLeg {
    int hitPoints;
    Bitmap image;
    int xPos;
    int yPos;

    public Rect getHitbox() {
        return hitbox;
    }

    public void setHitbox(Rect hitbox) {
        this.hitbox = hitbox;
    }

    Rect hitbox;

    public EnemyLeg(int hitPoints, Bitmap image, int xPos, int yPos) {
        this.hitPoints = hitPoints;
        this.image = image;
        this.xPos = xPos;
        this.yPos = yPos;
        this.hitbox = new Rect(xPos,yPos,xPos+image.getWidth(),yPos+image.getHeight());
    }



    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
