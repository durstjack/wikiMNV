package fr.cap.wikimnv.consultation.service;

import java.util.List;

import fr.cap.wikimnv.contribution.service.IGArticle;
import fr.cap.wikimnv.contribution.service.IGTag;
import fr.cap.wikimnv.exception.*;

import java.util.Set;

public interface IConsultation {
	public IGArticle getGArticle() throws MNVException ;
	public IGTag getGTag() throws MNVException ;
	public IServiceCommentaire getServiceCommentaire() throws MNVException ;
}
