package td3Collection.stock;

import java.util.*;

public class Article {
	private String nom;
	private double prix;
	private Map<String,Integer> tailles;
	
	public Article(String nom, double prix){
		this.nom = nom;
		this.prix = prix;
		tailles = new HashMap<String,Integer>();
	}	
	// Accesseurs
	public String getNom() { 
		return nom;
	}
	public double getPrix() {
		return prix;		
	}
	public int nbTailles() {
		return tailles.size();
	}

	/**
	 * Disponibilité pour une taille
	 * @param taille
	 * @return
	 */
	public int dispoTaille(String taille) {
		/*if(tailles.containsKey(taille.toLowerCase())) {
			return tailles.get(taille.toLowerCase());
		}else {
			return 0;
		}*/
		tailles.getOrDefault(taille.toLowerCase(), 0);

		Integer dispo = tailles.get(taille.toLowerCase());
		if (dispo == null){
			return 0;
		} else
			return dispo;		
	}

	/**
	 * Ajouter une quantité sur une taille, ajoute cette taille si elle n'existe pas
	 * @param taille la taille
	 * @param n la quantité
	 */
	public void ajouteExemplairesDansTaille(String taille, int n) {
		String k = taille.toLowerCase();
		Integer dispo = tailles.get(k);
		if (dispo == null){
			tailles.put(k, n);
		} else
			tailles.put(k, dispo+n);
	}

	/**
	 * Nombre d'exemplaires de l'article (toutes tailles confondu)
	 * @return le nombre d'exemplaire
	 */
	public int disponibilite(){
		Set<Map.Entry<String, Integer>> set = tailles.entrySet();

		int total = 0;
		for(Map.Entry<String, Integer> e : set) {
			total += e.getValue();
		}
		return total;

		/*int total = 0;
		for (int n: tailles.values()){
			total= total+n;
		}
		return total;*/
	}

	/**
	 * Affiche tous les details + disponibilites de l'article
	 */
	public void affiche(){
		System.out.println(nom + ", Prix= "+ prix);
		afficheDispoTailles();
	}

	/** Affiche toutes les tailles et disponibilites */
	public void afficheDispoTailles(){
		if (tailles.isEmpty()){
			System.out.println("  Article actuellement indisponible");
		}else {
			for (Map.Entry<String, Integer> e : tailles.entrySet()){
				System.out.println(e.getKey() + " : " + e.getValue() + " exemplaires");
			}
		}
	}
}
