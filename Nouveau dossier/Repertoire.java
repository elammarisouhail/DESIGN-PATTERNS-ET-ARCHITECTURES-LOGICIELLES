import java.util.ArrayList;


public class Repertoire implements Element{
		
	public Repertoire(String name) {
		fichiers = new ArrayList<Element>();
		this.name = name;
	}
	
    
     @Override
    public static long getTaille(Fichier Repertoire) {
    long taille = 0;
    File[] files = Repertoire.listElement();
    if (files !=null) { 
        for (File Fichier : Repertoire.listElement()) {
            if (Fichier.isFile()) 
                taille += Fichier.length();
        
             else
            taille += getTaille(Fichier);
    }
    return size;
}

    public static void display(Element Element) {
		System.out.println("la taille de "+ Element.getName()+" est: " + Element.getTaille()+" octets");
	}


}