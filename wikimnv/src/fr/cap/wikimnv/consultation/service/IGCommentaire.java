package fr.cap.wikimnv.consultation.service;

import java.util.Set;

import fr.cap.wikimnv.domain.pojo.Commentaire;
import fr.cap.wikimnv.domain.pojo.EtatPublication;

public interface IGCommentaire {
	Set<Commentaire> lister() ;
	Commentaire lire(Commentaire commentaire) ;
	Commentaire sauver(Commentaire commentaire) ;
	Commentaire supprimer(Commentaire commentaire) ;
	Commentaire banir(Commentaire commentaire,  EtatPublication etat) ;
	}