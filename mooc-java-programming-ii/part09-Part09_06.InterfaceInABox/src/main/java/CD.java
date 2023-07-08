/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tónie
 */
public class CD implements Packable {
    
    private String artist;
    private String name;
    private int publication; 
    private double weight = 0.1;
    
    public CD(String artist, String name, int publication){
        this.artist = artist;
        this.name = name;
        this.publication = publication;
    }
    
    public double weight(){
        return this.weight;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String toString(){
        return this.getArtist() + ": " + this.getName()+ " (" + this.getPublication() + ")";
    }
    
    
    
}
