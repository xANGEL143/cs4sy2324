public class Main {
    public static void main(String[] args){
        Artists artist1 = new Artists("Fiona Apple", 45, "Solo artist");
        Artists artist2 = new Artists("Robert Smith", 64,"The cure");
        Artists artist3 = new Artists("Dave Grohl", 54, "Nirvana and Foo Fighters");

        Song song1 = new Song("Pressed", "Alvvays", "Blue Rev");
        Song song2 = new Song("Duvet", "Boa", "Twilight");

        Singer singer = new Singer("Kate Bush");

        singer.changeFavSong(song1);

        singer.performForAudience("Kurt Cobain", 12);

        singer.changeFavSong(song2);
    }
}
