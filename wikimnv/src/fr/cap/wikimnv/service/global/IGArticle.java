package fr.cap.wikimnv.service.global;

import java.util.Set;

import fr.cap.wikimnv.domaine.pojo.*;
import fr.cap.wikimnv.exception.MNVException;




public interface IGArticle extends ICRUD {
	Set<Article> rechercher(String texte, TypeRecherche type) ;	void accrocher(Tag tag) ;
	boolean decrocher(Tag tag) ;
	boolean noter(Article article) ;
	boolean signaler(Article article) ;
	
	boolean ajouterFavorit(User user, Article article) ;
	}
