package Behavioural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BulletRegistry bulletRegistry = new BulletRegistry();
        Bullet fiveMMbullet= new Bullet();
        fiveMMbullet.setType(BulletType.FIVE_MM);
        Bullet sevenMMbullet= new Bullet();
        sevenMMbullet.setType(BulletType.SEVEN_MM);
        Bullet nineMMbullet= new Bullet();
        nineMMbullet.setType(BulletType.NINE_MM);
        bulletRegistry.addBullet(BulletType.FIVE_MM,fiveMMbullet);
        bulletRegistry.addBullet(BulletType.SEVEN_MM,sevenMMbullet);
        bulletRegistry.addBullet(BulletType.NINE_MM,nineMMbullet);
        List<FlyingBullet> flyingBullets = new ArrayList<>();
        for(int i=0;i<20000;i++){
            FlyingBullet flyingBullet = new FlyingBullet();
            flyingBullet.setBulletSpeed(200);
            flyingBullet.setBullet(bulletRegistry.getBullet(BulletType.FIVE_MM));
            flyingBullets.add(flyingBullet);

        }
        System.out.println("Demo");
    }
}
