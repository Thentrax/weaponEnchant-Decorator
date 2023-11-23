package weaponEnchant;

public class Sword implements Weapon{
    public float damage;
    public Sword(){

    }
    public Sword(float damage){
        this.damage = damage;
    }
    public float getDamage(){
        return damage;
    }
    public String getBase(){
        return "Sword";
    }
}
