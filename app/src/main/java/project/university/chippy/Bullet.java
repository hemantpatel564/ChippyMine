package project.university.chippy;

import android.graphics.Bitmap;
import android.graphics.Rect;

public class Bullet {
    int xPos;
    int yPos;

    public Rect getHibox() {
        return hibox;
    }

    public void setHibox(Rect hibox) {
        this.hibox = hibox;
    }

    Rect hibox;
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

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    Bitmap image;

    public Bullet(int xPos, int yPos, Bitmap image) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.image = image;
        this.hibox = new Rect(xPos,yPos,xPos+getImage().getWidth(),
                yPos+getImage().getHeight());
    }
}
