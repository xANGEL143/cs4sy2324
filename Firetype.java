public class Firetype extends SimpleMonster{
    private int atk; 
    private int def; 

    public Firetype(String n, int base, int m){
        super(n, "fire", "grass", "water", m, base);
        this.atk = 1.3 * base; 
        this.def = 0.7 * base; 
    }

    @Override

    public void special(String n){
        int hp = getHP();
        int maxHP = getMaxHP();
        
        hp += maxHP *.20; 

        System.out.println(n.getName() + " did a pose.");
    }
}
