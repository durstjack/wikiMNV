package fr.cap.wikimnv.consultation.service.impl;

import java.util.Set;

import fr.cap.wikimnv.consultation.service.IGCommentaire;
import fr.cap.wikimnv.domain.dao.IDAOGenric;
import fr.cap.wikimnv.domain.pojo.Commentaire;
import fr.cap.wikimnv.domain.pojo.EtatPublication;
import fr.cap.wikimnv.global.service.impl.CrudImpl;

public class GCommentaireImpl implements IGCommentaire {
	CrudImpl crud ;
	
	public GCommentaireImpl() {
		crud = new CrudImpl();
	}
	@Override
	public Set<Commentaire> lister() {
		// Renvoie la liste des comentaires
		return  (Set<Commentaire>) crud.lister(Commentaire.class) ;
	}

	@Override
	public Commentaire lire(Commentaire commentaire) {
		// Renvoie le commentaire demand� en param�tre
		return (Commentaire) crud.lire(commentaire, Commentaire.class) ;
	}

	@Override
	public Commentaire sauver(Commentaire commentaire) {
		// Sauvegarde le commentaire pass� en param�tre
		return (Commentaire) crud.sauver(commentaire) ;
	}

	@Override
	public Commentaire supprimer(Commentaire commentaire) {
		// Supprime le commentaire depuis la base pass� en param�tre
		return (Commentaire) crud.supprimer(commentaire) ;
	}

	@Override
	public Commentaire banir(Commentaire commentaire, EtatPublication etat) {
		// Publie ou d�publie un commentaire
		commentaire.setEtat(etat);
		return sauver(commentaire) ;
	}
}
