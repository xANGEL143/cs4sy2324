public class Grasstype extends SimpleMonster{
    public Grasstype(String n, int base, int m){
        super(n, "grass", "water", "fire", m, base);
        int atk= getAtk();
        int def= getDef();
        atk = base; 
        def = base; 
    }
    
    public void rest(){
        restoreHealth();
    }

    @Override

    public void special(String n){
        int hp = getHP();
        int maxHP = getMaxHP();
        
        hp += maxHP *.20; 

        System.out.println(n.getName() + " did a pose.");
    }

}
