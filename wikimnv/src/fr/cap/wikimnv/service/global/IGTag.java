package fr.cap.wikimnv.service.global;

import java.util.Set;
import fr.cap.wikimnv.domaine.pojo.*;

public interface IGTag {
	Set<Tag> lister() ;
	Tag getById(int id) ;
	
	// G�re la cr�ation et la modification gr�ce � la valeur de l'id pass� en param�tre
	int sauver(int id) ;
	
	int supprimer() ;
	
	}
