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
public class WindowsPhone extends Handphone {
	private String wpKeyStore;

	public WindowsPhone(String man, String os, String model, int harga){
		super(man, os, model, harga);
	}

	public String getWpKeyStore() {
		return wpKeyStore;
	}

	public void setWpKeyStore(String wpKeyStore) {
		this.wpKeyStore = wpKeyStore;
	}

	@Override
	public void displayProduct() {
		super.displayProduct(); //To change body of generated methods, choose Tools | Templates.
		System.out.println("Wp Key Store : " +  this.wpKeyStore + "\n");
	}

		
	
}
