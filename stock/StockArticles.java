package td3Collection.stock;

import java.util.*;

public class StockArticles {
	private String nom;
	private HashMap<String,Article> stock;

	public StockArticles(String nom){
		this.nom = nom;
		stock  = new HashMap<String,Article>();
	}

	public String getNom() {
		return nom;
	}

    /**
     * Creation d'un nouvel article
     * @param nom
     * @param prix
     */
    public void ajouteArticle(String nom, double prix){
        ajouteArticle(nom, prix, new String[0]);
    }


    /**
	 * Creation d'un nouvel articles avec les tailles donnes dans un
	 * tableau et des quantites 0 pour chacune
	 * @param nom
	 * @param prix
	 * @param tailles
	 */
	public void ajouteArticle(String nom, double prix, String[] tailles){
		Article a = new Article(nom.toLowerCase(), prix);
		for (String t:tailles) {
			a.ajouteExemplairesDansTaille(t.toLowerCase(), 0);
		}
		stock.put(nom.toLowerCase(), a);
	}

    /**
     * Réccupère l'article avec le nom
     * @param nom le nom de l'article de l'on veut
     * @return l'article ou null s'il n'existe pas
     */
    public Article getArticleByName(String nom) {
        return stock.get(nom.toLowerCase());
    }

	/**
	 *
	 * @param n
	 */
	public void afficheArticleDeNom(String n){
		Article a = stock.get(n.toLowerCase());
		if (a == null){
			System.out.println("Aucun article de nom "+n);
		} else 
			a.affiche();
	}

	/**
	 * Ajout pour un article et une taille des exemplaires
	 * @param nom
	 * @param taille
	 * @param nb
	 * @return
	 */
	public boolean modifieArticleDeNom(String nom, String taille, int nb){
		Article a = stock.get(nom.toLowerCase());
		if (a == null){
			return false;
		} else {
			a.ajouteExemplairesDansTaille(taille.toLowerCase(), nb);
			return true;
		}
	}

	/**
	 * La taille du stock
	 * @return
	 */
	public int taille(){
		Collection<Article> s= stock.values();
		int res = 0;
		for (Article a : s){
			res = res + a.disponibilite();
		}
		return res;
	}

	/**
	 * La valeur de tous les articles en stock
	 * @return
	 */
	public double valeur(){
		Collection<Article> s= stock.values();
		double res = 0;
		for (Article a : s){
			res = res + a.getPrix()*a.disponibilite();
		}
		return res;
	}

	/**
	 * Affiche tous les articles par ordre alphabetique
	 */
	public void afficheParOrdreAlphabetique(){
		ArrayList<String> ka = new ArrayList<>(stock.keySet());
		Collections.sort(ka);
		for (String s : ka){
			stock.get(s.toLowerCase()).affiche();
		}
	}
	
	public void afficheMotsCles(String[] mc){
		Set<Article> sa = new HashSet<Article>();
		for(String s : stock.keySet()){
			String ks = s.toLowerCase();
			for (String m: mc){
				String km = m.toLowerCase();
				if (ks.indexOf(km)>=0) {
					sa.add(stock.get(ks));
				}
			}
		}
		for (Article a : sa){
			a.affiche();		
		}
	}
}
