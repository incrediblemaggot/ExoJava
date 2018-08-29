package td3Collection.stock;

public class Main {
    public static void main(String[] args)  {
        StockArticles stockArticles = new StockArticles("Stock 1");

        stockArticles.ajouteArticle("Jeans", 29.99, new String[]{"xs", "s", "l"});
        stockArticles.ajouteArticle("Pull", 9.99);

        stockArticles.afficheParOrdreAlphabetique();

        System.out.println("valeur du stock : " + stockArticles.valeur());
        System.out.println("taille du stock : " + stockArticles.taille());

        stockArticles.modifieArticleDeNom("jeans", "xs", 50);
        stockArticles.modifieArticleDeNom("pull", "s", 50);
        stockArticles.modifieArticleDeNom("jeans", "m", 50);

        stockArticles.afficheArticleDeNom("pull");

        stockArticles.afficheMotsCles(new String[]{"jeans", "pull"});

        Article article = stockArticles.getArticleByName("jeans");
        System.out.println("Nombre d'élément en stock pour le jeans en m : "+article.dispoTaille("m"));
    }
}
