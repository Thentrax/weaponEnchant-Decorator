package weaponEnchant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponTest {

    @Test
    public void mustReturnBasicDamage(){
        Weapon sword = new Sword(10);
        assertEquals(10, sword.getDamage());
    }

    @Test
    public void mustReturnSharpnessDamage(){
        Weapon sword = new Sharpness(new Sword(10));
        assertEquals(13, sword.getDamage());
    }

    @Test
    public void mustReturnImpactDamage(){
        Weapon sword = new Impact(new Sword(10));
        assertEquals(15, sword.getDamage());
    }

    @Test
    public void mustReturnSharpnessImpactDamage(){
        Weapon sword = new Impact(new Sharpness(new Sword(10)));
        assertEquals(18, sword.getDamage());
    }
}