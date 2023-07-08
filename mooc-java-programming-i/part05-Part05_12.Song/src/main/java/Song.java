
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    public String getArtist(){
        return this.artist;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getDurationInSeconds(){
        return this.durationInSeconds;
    }
    
    public boolean equals(Object compared){
        // Checks if in same memory place 
        if (this == compared){
            return true;
        }
        
        if (!(compared instanceof Song)){
        return false;
    }
        
        
        Song cast = (Song) compared;
        
        if    ( this.artist.equals(cast.getArtist()) &&
                this.name.equals(cast.getName()) &&
                this.durationInSeconds == cast.getDurationInSeconds()){
            return true;
        }
        
        
        
        
        return false;
    }


}
