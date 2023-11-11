public static void main (String[] args) {
    Monster ft = new Firetype("Mayon", 150, 700); 
    Monster gt = new Grasstype("Rocky", 100, 600); 
    Monster wt = new Watertype("Pacific", 150, 550); 
    fight(ft, gt); 
    fight(wt, gt);
    fight(ft, wt);
}
