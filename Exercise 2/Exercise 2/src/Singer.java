public class Singer {
    String name; 
    int noOfPerformances; 
    double earnings; 
    Song favoriteSong; 

    public Singer(String name){
        this.name = name; 
        this.noOfPerformances = 0;
        this.earnings = 0.0; 
    }
    public void performForAudience(int people){
        this.noOfPerformances++; 
        this.earnings += people *100;
    }

    public void changeFavSong(Song newFavoriteSong){
        this.favoriteSong= newFavoriteSong; 
    }
}
