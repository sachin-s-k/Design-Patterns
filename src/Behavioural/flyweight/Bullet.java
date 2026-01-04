package Behavioural.flyweight;

public class Bullet {
    private double radius;


    private double weight;
    private BulletType type;

    private byte[] image;

    public double getRadius() { 
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public BulletType getType() {
        return type;
    }

    public void setType(BulletType type) {
        this.type = type;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
