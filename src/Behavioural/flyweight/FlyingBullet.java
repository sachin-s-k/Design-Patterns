package Behavioural.flyweight;

public class FlyingBullet {
    private double X_direction;
    private double Y_direction;
    private double Z_direction;
    private double bulletSpeed;
    private BulletStatus bulletStatus;
    private double x;
    private double y;
    private double z;
    private  Bullet bullet;

    public double getX_direction() {
        return X_direction;
    }

    public void setX_direction(double x_direction) {
        X_direction = x_direction;
    }

    public double getZ_direction() {
        return Z_direction;
    }

    public void setZ_direction(double z_direction) {
        Z_direction = z_direction;
    }

    public double getY_direction() {
        return Y_direction;
    }

    public void setY_direction(double y_direction) {
        Y_direction = y_direction;
    }

    public double getBulletSpeed() {
        return bulletSpeed;
    }

    public void setBulletSpeed(double bulletSpeed) {
        this.bulletSpeed = bulletSpeed;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public BulletStatus getBulletStatus() {
        return bulletStatus;
    }

    public void setBulletStatus(BulletStatus bulletStatus) {
        this.bulletStatus = bulletStatus;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
