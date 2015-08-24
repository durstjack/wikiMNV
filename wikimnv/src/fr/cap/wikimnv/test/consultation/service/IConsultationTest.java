package fr.cap.wikimnv.test.consultation.service;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.cap.wikimnv.consultation.service.IConsultation;
import fr.cap.wikimnv.consultation.service.impl.ServiceConsultationImpl;
import fr.cap.wikimnv.exception.MNVException;

public class IConsultationTest {
	IConsultation consultation = new ServiceConsultationImpl();
	@Test
	public void testGetGArticle() {
		try {
			consultation.getGArticle();
		} catch (MNVException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetGTag() {
		try {
			consultation.getGTag();
		} catch (MNVException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetGCommentaire() {
		try {
			consultation.getServiceCommentaire();
		} catch (MNVException e) {
			fail(e.getMessage());
		}
	}

}
