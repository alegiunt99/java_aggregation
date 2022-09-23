package rubrica;

public class Rubrica {
	
	// DATA
	private Contatto[] contatti;
	

	// CONSTRUCTOR
	public Rubrica(int quantita) {
		
		this.contatti = new Contatto[quantita];
		
	}
	
	// GETTERS & SETTERS
	
	public Contatto[] getContatti(){
		
		
		return this.contatti;
		
	}
	
	/**
	 * Aggiungo un elemento di tipo Contatto ad un array di Contatto
	 * 
	 * @param nuovoContatto: il parametro da aggiungere
	 */
	public void aggiungiContatto(Contatto nuovoContatto) {
		
		for(int i = 0; i < this.contatti.length; i++) {
			
			if(this.contatti[i] == null) {
				
				this.contatti[i] = nuovoContatto;
				break;
				
			}
			
		}
		
		
	}
	
	
	/**
	 * In base ai calcoli e alla presenza o meno di elementi all'interno dell'array, 
	 * creo una Stringa che rappresenta la descrizione del risultato
	 * @return descrizione del risultato
	 */
	public String vediDescrizione() {
		
		String descrizione = "RUBRICA\n\n";
		
		for(Contatto contatto: this.contatti){
			
			if(!(contatto == null)){
				
				descrizione +=  "{\n" + contatto.vediDescrizione() + "}\n";
	
			}
			
		}
		
		return descrizione;
		
		
	}
	
}
