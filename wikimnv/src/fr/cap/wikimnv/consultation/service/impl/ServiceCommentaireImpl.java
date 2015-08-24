package fr.cap.wikimnv.consultation.service.impl;

import java.util.Set;

import fr.cap.wikimnv.consultation.service.IServiceCommentaire;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Commentaire;
import fr.cap.wikimnv.global.domain.pojo.EtatPublication;
import fr.cap.wikimnv.global.service.ICRUD;
import fr.cap.wikimnv.global.service.impl.CrudImpl;


public class ServiceCommentaireImpl implements IServiceCommentaire {
	ICRUD crud ;
	
	public ServiceCommentaireImpl() {
		crud = new CrudImpl();
	}
	
	/**
	 * Permet d'obtenir la liste de tous les commentaires
	 *@return  Renvoie la liste des comentaires
	 *@author  Sohail, Messan  
	 */ 
	
	public Set<?> lister() throws MNVException {
		return  crud.lister(Commentaire.class) ;
	}
	
	/**
	 * Permet de charg� un commentaire depuis la base
	 * @param Le commentaire � lire
	 * @return  Renvoie le commentaire demand� en param�tre
	 * @author Sohail, Messan
	 */ 

	
	public Object lire(Object commentaire) throws MNVException {
		return crud.lire(commentaire, Commentaire.class) ;
	}
	
	/**
	 * Permet de sauvegarde un commentaire
	 * @param Le commentaire � sauvegarder
	 * @return le commentaire pass� en param�tre apr�s le sauvegarde
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */ 

	
	public Object sauver(Object commentaire) throws MNVException {
		return crud.sauver(commentaire) ;
	}
	
	/**
	 * Supprime le commentaire depuis la base pass� en param�tre
	 * @param le commentaire � supprimer
	 * @return le commentaire supprim� 
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */

	
	public Commentaire supprimer(Commentaire commentaire) throws MNVException {
		return (Commentaire) crud.supprimer(commentaire) ;
	}

	/**
	 * Permet de publier ou d�publier un commentaire
	 * @param le commentaire � banir
	 * @return le commentaire banis
	 * @author Sohail, Messan
	 * @throws MNVException 
	 */
	
	
	public Commentaire banir(Commentaire commentaire, EtatPublication etat) throws MNVException {
		// Publie ou d�publie un commentaire
		commentaire.setEtat(etat);
		return (Commentaire) sauver(commentaire) ;
	}

	@Override
	public Set<?> lister(Class cls) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object lire(Object obj, Class cls) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object supprimer(Object obj) throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}
}
	