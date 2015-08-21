package fr.cap.wikimnv.test.consultation.service;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.cap.wikimnv.consultation.service.IGCommentaire;
import fr.cap.wikimnv.consultation.service.impl.GCommentaireImpl;
import fr.cap.wikimnv.domain.pojo.Commentaire;

public class IGCommentaireTest {

	IGCommentaire Gcommentaire = new GCommentaireImpl();
	
	@Test
	public void testLister() {
		Gcommentaire.lister();
	}

	@Test
	public void testLire() {
		Gcommentaire.lire();
	}

	@Test
	public void testSauver() {
		Gcommentaire.sauver();
	}

	@Test
	public void testSupprimer() {
		Gcommentaire.supprimer(commentaire);
	}

	@Test
	public void testBanir() {
		Gcommentaire.banir(commentaire, etat);
	}

}
