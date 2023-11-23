package weaponEnchant;

public abstract class WeaponDecorator implements Weapon{
    private Weapon weapon;
    public String base;
    public WeaponDecorator(Weapon weapon){
        this.weapon = weapon;
    }
    public Weapon getWeapon(){
        return weapon;
    }
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public abstract float getDamageBonus();
    public float getDamage(){
        return this.weapon.getDamage() + this.getDamageBonus();
    }
    public abstract  String getBaseName();
    public String getBase(){
        return this.weapon.getBase() + "/" + this.getBaseName();
    }
    public void setBase(){
        this.base = base;
    }
}
