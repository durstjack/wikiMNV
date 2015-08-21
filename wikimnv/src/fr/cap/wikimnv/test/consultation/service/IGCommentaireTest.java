package fr.cap.wikimnv.test.consultation.service;

import static org.junit.Assert.fail;

import org.junit.Test;

import fr.cap.wikimnv.consultation.service.IGCommentaire;
import fr.cap.wikimnv.consultation.service.impl.GCommentaireImpl;
import fr.cap.wikimnv.domain.pojo.Commentaire;
import fr.cap.wikimnv.domain.pojo.Profil;
import fr.cap.wikimnv.domain.pojo.Template;
import fr.cap.wikimnv.exception.MNVException;

public class IGCommentaireTest {

	IGCommentaire Gcommentaire = new GCommentaireImpl();
	Profil profil = new Profil() ;
	Template template = new Template("NomTest") ;
	Commentaire commentaire = new Commentaire(profil, template) ;
	
	@Test
	public void testLister() throws MNVException {
		Gcommentaire.lister(null) ;
	}

	@Test
	public void testLire() throws MNVException {
		Gcommentaire.lire(commentaire, null) ;
	}

	@Test
	public void testSauver() throws MNVException {
		Gcommentaire.sauver(commentaire) ;
	}

	@Test
	public void testSupprimer() throws MNVException {
		Gcommentaire.supprimer(commentaire);
	}

	@Test
	public void testBanir() throws MNVException {
		Gcommentaire.banir(commentaire, null);
		
	}

}
