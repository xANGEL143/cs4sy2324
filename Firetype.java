public class Firetype extends SimpleMonster{
    public Firetype(String n, int base, int m){
        super(n, "fire", "grass", "water", m, base);
    }

    @Override

    public void special(String n){
        int hp = getHP();
        int maxHP = getMaxHP();
        
        hp += maxHP *.20; 

        System.out.println(n.getName() + " did a pose.");
    }
}
