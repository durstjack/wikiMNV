package fr.cap.wikimnv.service.consultation;

import java.util.List;
import fr.cap.wikimnv.service.global.*;
import fr.cap.wikimnv.exception.*;

import java.util.Set;

public interface IConsultation {
	public IGArticle getGArticle() throws MNVException ;
	public IGTag getGTag() throws MNVException ;
	public IGCommentaire getGCommentaire() throws MNVException ;
}
