package fr.cap.wikimnv.consultation.service;

import java.util.Set;





import fr.cap.wikimnv.consultation.domaine.pojo.Commentaire;


public interface IGCommentaire {
	Set<Commentaire> lister() ;
	Commentaire lire(int id) ;
	int sauver(Commentaire commentaire) ;
	int supprimer(Commentaire commentaire) ;
	boolean banir(boolean etat) ;
	}