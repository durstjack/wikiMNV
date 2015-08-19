package fr.cap.wikimnv.consultation.service;

import java.util.Set;




import fr.cap.wikimnv.consultation.domaine.pojo.* ;


public interface IGCommentaire {
	Set<Commentaire> lister() ;
	Commentaire getById(int idArticle) ;
	int creer() ;
	int supprimer(int id) ;
	void changerEtat(Etat etat) ;
	
	}
