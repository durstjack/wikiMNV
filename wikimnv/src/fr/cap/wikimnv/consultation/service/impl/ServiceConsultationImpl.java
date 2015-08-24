package fr.cap.wikimnv.consultation.service.impl;

import fr.cap.wikimnv.consultation.service.IConsultation;
import fr.cap.wikimnv.consultation.service.IServiceCommentaire;
import fr.cap.wikimnv.contribution.service.IGArticle;
import fr.cap.wikimnv.contribution.service.IGTag;
import fr.cap.wikimnv.exception.MNVException;

public class ServiceConsultationImpl implements IConsultation {
public IServiceCommentaire serviceCommentaire ;	

	@Override
	public IGArticle getGArticle() throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IGTag getGTag() throws MNVException {
		// TODO Auto-generated method stub
		return null;
	}

	public IServiceCommentaire getServiceCommentaire() {
		return serviceCommentaire;
	}

	public void setServiceCommentaire(IServiceCommentaire serviceCommentaire) {
		this.serviceCommentaire = serviceCommentaire;
	}
	
	

	
	

}
