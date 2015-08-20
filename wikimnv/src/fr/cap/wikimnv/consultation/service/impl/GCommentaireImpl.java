package fr.cap.wikimnv.consultation.service.impl;

import java.util.Set;

import fr.cap.wikimnv.consultation.service.IGCommentaire;
import fr.cap.wikimnv.domain.dao.IDAOGenric;
import fr.cap.wikimnv.domain.pojo.Commentaire;
import fr.cap.wikimnv.domain.pojo.EtatPublication;
import fr.cap.wikimnv.global.service.impl.CrudImpl;
import fr.cap.wikimnv.domain.pojo.;



public class GCommentaireImpl implements IGCommentaire {
	IDAOGenric dao ;
	CrudImpl crud ;
	
	public GCommentaireImpl() {
		dao=(IDAOGenric) Class.forName("fr.cap.wikimnv.domain.dao.impl.DaoMongoDB").newInstance();
	}
	@Override
	public Set<Commentaire> lister() {
		// Renvoie la liste des comentaires
		return dao.getAll(Commentaire.class);
	}

	@Override
	public Commentaire lire(Commentaire commentaire) {
		// Renvoie le commentaire demandé en paramètre
		return (Commentaire) dao.get(commentaire) ;
	}

	@Override
	public Commentaire sauver(Commentaire commentaire) {
		// Sauvegarde le commentaire passé en paramètre
		return (Commentaire) dao.saveOrUpdate(commentaire) ;
	}

	@Override
	public Commentaire supprimer(Commentaire commentaire) {
		// Supprime le commentaire depuis la base passé en paramètre
		return (Commentaire) dao.delete(commentaire) ;
	}

	@Override
	public Commentaire banir(Commentaire commentaire, EtatPublication etat) {
		// Publie ou dépublie un commentaire
		commentaire.setEtat(etat);
		return commentaire ;
	}
	@Override
	public Commentaire lire(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
