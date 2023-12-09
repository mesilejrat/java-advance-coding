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
        System.out.println(bulletAmount);
       if (bulletAmount > 0) {
           return true;
       }
         return false;
    }

    public void loadBullet(String amount) {
        if (magazineSize < Integer.parseInt(amount)) {
            System.out.println("cannot load, bullets exceed magazine size");
           // bulletAmount = Integer.parseInt(amount) - magazineSize;
        } else {
            bulletAmount += Integer.parseInt(amount);
        }
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
