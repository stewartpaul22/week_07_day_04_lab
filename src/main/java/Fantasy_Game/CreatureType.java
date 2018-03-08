package Fantasy_Game;

public enum CreatureType {

    OGRE(5),
    DRAGON(10);

    private final int protection;

    CreatureType(int protection) { this.protection = protection; }

    public int getProtection() {
        return this.protection;
    }

}
