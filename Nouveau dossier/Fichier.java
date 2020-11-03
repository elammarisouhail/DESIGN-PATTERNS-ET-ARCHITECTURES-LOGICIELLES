public class Fichier implements Element {
    private int taille;
	private String name;
	
    public Fichier( String name, int taille) {
		this.taille = taille;
		this.name=name;
	}
	
    @Override
	public int getTaille() {
		return this.taille;
	}
	public String getName() {
		return this.name;
	}
	
	
	public static void display(Element Element) {
		System.out.println("la taille de "+ Element.getName()+" est: " + Element.getTaille()+" octets");
	}
}