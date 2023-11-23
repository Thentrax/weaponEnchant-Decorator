package weaponEnchant;

public class Impact extends WeaponDecorator{
    public Impact(Weapon weapon){
        super(weapon);
    }
    @Override
    public float getDamageBonus() {
        return 5;
    }
    @Override
    public String getBaseName(){
        return "Impact";
    }
}
