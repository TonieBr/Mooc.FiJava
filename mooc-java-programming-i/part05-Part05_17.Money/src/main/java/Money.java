
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        int totalOrig = this.cents() + (this.euros() * 100);
        int totalComp = addition.cents() + (addition.euros() * 100);
        
        
        Money newMoney = new Money(0, (totalOrig + totalComp));
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        int totalOrig = this.cents() + (this.euros() * 100);
        int totalComp = compared.cents() + (compared.euros() * 100);
        
        if (totalOrig < totalComp){
            return true;
        }
        
        return false;
       
    }
    
    public Money minus(Money decreaser){
        
        if ((this.euros() - decreaser.euros()) < 0){
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        
        int totalOrig = this.cents() + (this.euros() * 100);
        int totalComp = decreaser.cents() + (decreaser.euros() * 100);
        
        Money newMoney = new Money(0, (totalOrig - totalComp));
        return newMoney;
    }

}
