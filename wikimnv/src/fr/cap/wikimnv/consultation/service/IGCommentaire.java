package fr.cap.wikimnv.consultation.service;

import java.util.Set;

import fr.cap.wikimnv.domain.pojo.Commentaire;
import fr.cap.wikimnv.domain.pojo.EtatPublication;
import fr.cap.wikimnv.exception.MNVException;
import fr.cap.wikimnv.global.service.ICRUDGeneric;

public interface IGCommentaire extends ICRUDGeneric {
	Commentaire banir(Commentaire commentaire,  EtatPublication etat) throws MNVException ;
	}