package Hokify;

public class Menu {

	public static void main(String[] args) {
		Hokify hk = new Hokify();
		Utilizador user =
		        new Utilizador(
		            "Pedro",
		            "email@email.com",
		            Hokify_quotes.MasculinoQuote.getInstance(),
		            Hokify_quotes.LicenciaturaQuote.getInstance(),
		            "Portugal",
		            "Porto",
		            27L,
		            123456789L);
		
		System.out.println("NOME:" + user.getIdade());
	}

}
