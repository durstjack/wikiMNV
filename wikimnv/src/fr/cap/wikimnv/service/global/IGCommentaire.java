package fr.cap.wikimnv.service.global;

import java.util.Set;

import fr.cap.wikimnv.domaine.pojo.*;

public interface IGCommentaire {
	Set<Commentaire> lister() ;
	Commentaire getById(int idArticle) ;
	int creer() ;
	int supprimer(int id) ;
	void changerEtat(Etat etat, int id) ;
	
	}
