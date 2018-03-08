package Fantasy_Game;

public enum WeaponType {

    SWORD(10),
    AXE(10),
    CLUB(5);

    private final int damage;

    WeaponType(int damage) { this.damage = damage; }

    public int getDamage() { return this.damage; }

}
