package fr.cap.wikimnv.consultation.service;

import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.domain.pojo.Commentaire;
import fr.cap.wikimnv.global.domain.pojo.EtatPublication;
import fr.cap.wikimnv.global.service.ICRUDGeneric;


public interface IServiceCommentaire extends ICRUDGeneric {
	Commentaire banir(Commentaire commentaire,  EtatPublication etat) throws MNVException ;
	}
