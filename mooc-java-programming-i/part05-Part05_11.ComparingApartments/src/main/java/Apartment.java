import java.lang.Math;


public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSquares(){
        return this.squares;
    }
    
    public int getPrice(){
        return this.princePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.getSquares()){
            return true;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared){
        return Math.abs((this.princePerSquare * this.squares) - (compared.getSquares() * compared.getPrice()));
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if ( (this.squares * this.princePerSquare) > (compared.getSquares() * compared.getPrice()) ){
            return true;
        }
        
        return false;
    }

}
