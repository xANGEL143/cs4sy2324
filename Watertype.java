public class Watertype extends SimpleMonster{
    public Watertype(String n, int base, int m){
        super(n, "water", "fire", "fire", m, base);
    }

    @Override

    public void special(String n){
        int hp = getHP();
        int maxHP = getMaxHP();
        
        hp += maxHP *.20; 

        System.out.println(n.getName() + " did a pose.");
    }
}
