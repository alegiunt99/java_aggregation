package rubrica;

import io.Console;

public class Contatto {
	
	// DATA
	private String nome;
	private String cognome;
	private String numTelefono;
	private int eta;
	
	// GETTERS - SETTERS
	
	public String getNome() {
		
		return this.nome;
		
	}
	
	public String getCognome() {
		
		return this.cognome;
		
	}
	
	
	public String getNumTelefono() {
	
			
			return this.numTelefono;
			
				
	}
	
	public int getEta() {
		
			return this.eta;
			
	}
	
	public void setNome(String name) {
		
		this.nome = name;
		
	}
	
	public void setCognome(String cognome) {
		
		this.cognome = cognome;
		
	}
	
	public void setNumTelefono(String phoneNumber) {
		if(phoneNumber.length() == 10) {

			this.numTelefono = phoneNumber;

		}else {

			String messaggio = "Scrivi un numero di 10 cifre";

			System.out.println(messaggio);
		}
	}
	
	public void setEta(int eta) {
		
		if(eta > 0 && eta < 100) {

			this.eta = eta;

		}else {
			
			System.out.println("inserisci un età tra 1 e 99");
		
		}
		
	}
	
	// METHODS
	
	public int setLength() {

		System.out.println("Inserisci il numero di persone da inserire nella tua rubrica");

		int quantiContatti = Console.leggiInt();

		return quantiContatti;

	}
	
	/**
	  Creo una Stringa che rappresenta la descrizione del risultato
	 * @return descrizione del risultato
	 */
	public String vediDescrizione(){
		
		String descrizione = "\tNome: " + this.getNome()+ "\n" 
							+ "\tCognome: " + this.getCognome()+ "\n"
							+ "\tNumero: +39 " + this.getNumTelefono()+ "\n"
							+ "\tEta': " + this.getEta() + "\n";
		return descrizione;
		
	}
		
}
