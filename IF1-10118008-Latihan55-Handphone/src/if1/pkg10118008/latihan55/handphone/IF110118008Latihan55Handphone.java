/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan55.handphone;

/**
 *
 * @author ASUS
 */
public class IF110118008Latihan55Handphone {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Android andro = new Android("Samsung", "Android", "Grand", 3000000);
		andro.setKeyStore("234ibfd3840fo");
		andro.displayProduct();
		BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
		bb.setPinBB("BHS249");
		bb.displayProduct();
		WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
		wp.setWpKeyStore("UUUQIJWORJ");
		wp.displayProduct();
	}
	
}
