/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weight;

public class Weight {
    private static final int OUNCES_IN_A_POUND = 16;

    private int pounds;
    private int ounces;

    public Weight( int pounds, int ounces ) {
	this.pounds = pounds;
	this.ounces = ounces;
    } // Weight( int, int )

    public int getPounds() {
	return this.pounds;
    } // getPounds()

    public int getOunces() {
	return this.ounces;
    } // getOunces()

    public void setPounds( int pounds ) {
	this.pounds = pounds;
    } // setPounds( int )

    public void setOunces( int ounces ) {
	this.ounces = ounces;
    } // setOunces( int )

    public Weight add( Weight otherWeight ) {
	int lbs = this.pounds + otherWeight.pounds;
	int oz = this.ounces + otherWeight.ounces;
	Weight sum = new Weight( lbs + oz/OUNCES_IN_A_POUND,
				 oz % OUNCES_IN_A_POUND );
        return sum;
    } // add( Weight )

    @Override
    public String toString() {
	return this.pounds + " lbs., " + this.ounces + " oz.";
    } // toString()

    public static void main( String[] args ) {
	Weight cherries = new Weight( 1, 10 );
	Weight grapes = new Weight( 2, 8 );
	Weight fruit = cherries.add( grapes );
	System.out.println( cherries + " + " + grapes + " = " + fruit );
    } // main( String[] )

} // Weight