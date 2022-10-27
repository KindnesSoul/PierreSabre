package personnages;

public class humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public int getArgent() {
		return argent;
	}
	public void setArgent(int argent) {
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void direBonjour(String texte) {
		parler(" Bonjour ! Je m’appelle "+nom+" et j’aime boire du "+boisson);
		}
	public void boire(String texte) {
		parler("Mmmm, un bon verre de" +boisson+" ! GLOUPS !");
	}
	public void parler(String texte) {
		System.out.println(texte);
	}
	public int gagnerArgent(int gain) {
		return argent=argent+gain;
	}
	public int perdreArgent(int perte) {
		return argent=argent+perte;
		}
	public void acheter(String bien, int prix) {
		if (argent>prix) {
			parler("j'ai"+argent+"sous s en poche. Je vais pouvoir m'offrir un jeu à"+prix);
		}else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir" +bien+ "a "+prix +"sous");
		}
		
	} 

}
