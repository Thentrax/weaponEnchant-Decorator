package weaponEnchant;

public class Sharpness extends WeaponDecorator{
    public Sharpness(Weapon weapon){
        super(weapon);
    }
    @Override
    public float getDamageBonus() {
        return 3;
    }
    @Override
    public String getBaseName(){
        return "Sharpness";
    }
}
