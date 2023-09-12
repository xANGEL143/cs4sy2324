public class Singer {
    private String name; 
    private int noOfPerformances; 
    private double earnings; 
    private Song favoriteSong; 
    private static int totalPerformances = 0;

    public Singer(String name){
        this.name = name; 
        this.noOfPerformances = 0;
        this.earnings = 0.0; 
    }
    public void performForAudience(Singer otherSinger, int people){
        this.noOfPerformances++; 
        otherSinger.noOfPerformances++; 
        this.totalPerformances++; 
        this.earnings += people *50;
        otherSinger.earnings += people *50;  

    }

    public void changeFavSong(Song newFavoriteSong){
        this.favoriteSong= newFavoriteSong; 
    }

    public String getName(){
        return name;
    }

    public int getNoOfPerformances(){
        return noOfPerformances;
    }

    public double getEarnings(){
        return earnings;
    }

    public Song getFavoriteSong(){
        return favoriteSong;
    }

    public int totalPerformances(){
        return totalPerformances; 
    }
}
