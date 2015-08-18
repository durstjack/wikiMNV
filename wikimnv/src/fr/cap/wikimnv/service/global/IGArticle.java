package fr.cap.wikimnv.service.global;

import java.util.Set;

import fr.cap.wikimnv.domaine.pojo.*;




public interface IGArticle {
	Set<Article> listerArticles() ;
	Article lireArticle(int id) ;
	Set<Article> rechercheParTexte(String texte) ;
	Set<Article> rechercheParTag(String tag) ;
	void accrocher(Tag tag) ;
	void decrocher(Tag tag) ;
	void noter(Article article) ;
	void signaler(Article article) ;
	Set<Historique> getHistorique(int id) ;
	void ajouterFavorit(User user, Article article) ;
	}
