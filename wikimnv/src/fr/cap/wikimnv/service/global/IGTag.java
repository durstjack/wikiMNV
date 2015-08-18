package fr.cap.wikimnv.service.global;

import java.util.Set;
import fr.cap.wikimnv.domaine.pojo.*;

public interface IGTag {
	Set<Tag> lister() ;
	Tag getById(int id) ;
	
	// Gère la création et la modification grâce à la valeur de l'id passé en paramètre
	int sauver(int id) ;
	
	int supprimer() ;
	
	}
