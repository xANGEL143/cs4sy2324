public class Song {
    private String name;
    private String artistName; 
    private String album; 

    public Song(String name, String Artistname, String album){
        this.name = name; 
        this.artistName = Artistname; 
        this.album = album;
    }

    public String getName(){
        return name;
    }

    public String getArtistname(){
        return artistName;
    }

    public String getAlbum(){
        return album;
    }
}
