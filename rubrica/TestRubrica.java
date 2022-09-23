package rubrica;

import io.Console;

public class TestRubrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inserisci il numero di persone da inserire nella tua rubrica");

		int quantiContatti = Console.leggiInt();

		
		Rubrica rubrica = new Rubrica(quantiContatti);
		
//		
		// contatto 1
		Contatto carloMagno = new Contatto();

		carloMagno.setNome("Carlo");
		carloMagno.setCognome("Magno");
		carloMagno.setNumTelefono("3210103021");
		carloMagno.setEta(20);

		// contatto 2
		Contatto marcoRossi = new Contatto();

		marcoRossi.setNome("Marco");
		marcoRossi.setCognome("Rossi");
		marcoRossi.setNumTelefono("4210103021");
		marcoRossi.setEta(24);

		
		// contatto 3
		Contatto guidoGialli = new Contatto();

		guidoGialli.setNome("Guido");
		guidoGialli.setCognome("Gialli");
		guidoGialli.setNumTelefono("3210102021");
		guidoGialli.setEta(30);
		
		rubrica.aggiungiContatto(carloMagno);
		rubrica.aggiungiContatto(marcoRossi);
		rubrica.aggiungiContatto(guidoGialli);
		
//		rubrica.getContatti();
		if(rubrica.getContatti().length > 0){
			
			System.out.println( rubrica.vediDescrizione());
			
		}
		
//		
//		
		
		

	}

}
