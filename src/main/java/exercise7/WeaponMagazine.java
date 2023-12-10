package exercise7;

public class WeaponMagazine {
    Integer magazineSize = 0;
    Integer bulletAmount = 0;
    boolean loaded = false;

    public static void main(String[] args) {
        WeaponMagazine glock = new WeaponMagazine(20);
        glock.loadBullet("10");
        glock.shoot();
        glock.shoot();
        glock.shoot();
        System.out.println(glock.isLoaded());
    }

    public WeaponMagazine(Integer magazineSize){
        this.magazineSize = magazineSize;
    }
    public boolean isLoaded(){
     return loaded;
    }

    public void loadBullet(String amount) {
        if (bulletAmount + Integer.parseInt(amount) > magazineSize) {
            System.out.println("cannot load, bullets exceed magazine size");
            return;
        }
        loaded = true;
        bulletAmount += Integer.parseInt(amount);
    }

    public void shoot() {
        if (bulletAmount == 0) {
            System.out.println("magazine is empty");
        } else {
            bulletAmount -= 1;
            System.out.println("bang");
        }
    }
}
