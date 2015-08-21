package fr.cap.wikimnv.test.consultation.service;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.cap.wikimnv.consultation.service.IGCommentaire;
import fr.cap.wikimnv.consultation.service.impl.GCommentaireImpl;
import fr.cap.wikimnv.domain.pojo.Commentaire;
import fr.cap.wikimnv.domain.pojo.EtatPublication;
import fr.cap.wikimnv.domain.pojo.Profil;
import fr.cap.wikimnv.domain.pojo.Template;

public class IGCommentaireTest {

	IGCommentaire Gcommentaire = new GCommentaireImpl();
	
	@Test
	public void testLister() {
		Gcommentaire.lister();
	}

	@Test
	public void testLire() {
		Gcommentaire.lire(new Commentaire(new Profil(), new Template("NomTest")));
	}

	@Test
	public void testSauver() {
		Gcommentaire.sauver(new Commentaire(new Profil(), new Template("NomTest")));
	}

	@Test
	public void testSupprimer() {
		Gcommentaire.supprimer(new Commentaire(new Profil(), new Template("NomTest")));
	}

	@Test
	public void testBanir() {
		Gcommentaire.banir(new Commentaire(new Profil(), new Template("NomTest")), EtatPublication.BROUILLON) ;
		
	}

}
