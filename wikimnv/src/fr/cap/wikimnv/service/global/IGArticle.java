package fr.cap.wikimnv.service.global;

import java.util.Set;

import fr.cap.wikimnv.domaine.pojo.*;
import fr.cap.wikimnv.exception.MNVException;




public interface IGArticle extends ICRUD {
	Set<Article> rechercheParTexte(String texte) ;
	Set<Article> rechercheParTag(String tag) ;
	void accrocher(Tag tag) ;
	void decrocher(Tag tag) ;
	void noter(Article article) ;
	void signaler(Article article) ;
	
	void ajouterFavorit(User user, Article article) ;
	}
