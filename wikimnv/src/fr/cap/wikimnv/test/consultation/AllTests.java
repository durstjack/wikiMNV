package fr.cap.wikimnv.test.consultation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.cap.wikimnv.test.consultation.service.IConsultationTest;
import fr.cap.wikimnv.test.consultation.service.IGCommentaireTest;

@RunWith(Suite.class)
@SuiteClasses({ IConsultationTest.class, IGCommentaireTest.class })
public class AllTests {
	

}
