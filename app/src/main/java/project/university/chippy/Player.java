package project.university.chippy;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;

import java.util.ArrayList;

import static project.university.chippy.GameEngine.TAG;

public class Player {
    public int xPos;
    public int yPos;

    public ArrayList<Rect> getBullets() {
        return bullets;
    }

    public void setBullets(ArrayList<Rect> bullets) {
        this.bullets = bullets;
    }

    public ArrayList<Rect> bullets = new ArrayList<>();
    public Rect getHitbox() {
        return hitbox;
    }

    public void setHitbox(Rect hitbox) {
        this.hitbox = hitbox;
    }

    public Rect hitbox;

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public Bitmap image;

    public Player(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
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
    public void addBullet(){
        Log.d(TAG, "addBullet: ");
        Log.d(TAG, "addBullet: "+getImage().getWidth());
        Rect newBullet = new Rect(
                this.xPos + getImage().getWidth()+10,
                this.yPos + this.image.getHeight() / 2,
                this.xPos + getImage().getWidth()+100   ,
                this.yPos + this.image.getHeight() / 2 + 10);
        bullets.add(newBullet);
    }
}
