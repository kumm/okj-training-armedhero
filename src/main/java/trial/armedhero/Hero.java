package trial.armedhero;

public class Hero {
    private int hp = 30;
    private Fegyver fegyver = new DefaultFegyver();

    public void setFegyver(Fegyver fegyver) {
        this.fegyver = fegyver;
    }

    public boolean isAlive() {
        return hp != 0;

    }

    public void attack(Hero cel){
        cel.hp -= fegyver.getSebzes();
        cel.hp = Math.max(cel.hp,0);
    }

    public int getHp() {
        return hp;
    }
}
