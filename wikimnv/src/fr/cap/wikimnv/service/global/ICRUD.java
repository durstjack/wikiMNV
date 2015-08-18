package fr.cap.wikimnv.service.global;

import java.util.Set;

public interface ICRUD  {
	
	Set<?> lister() ;
	Object lire(Object obj) ;
	Object supprimer(Object obj) ;
	Object sauver(Object obj) ;

}
