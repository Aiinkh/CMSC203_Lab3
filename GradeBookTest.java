import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook fallGr;
	private GradeBook sprGr;
	
	@BeforeEach
	void setUp() throws Exception {
		fallGr = new GradeBook(5);
		sprGr = new GradeBook(5);
		fallGr.addScore(85);
		fallGr.addScore(92);
		fallGr.addScore(78);
		sprGr.addScore(90);
		sprGr.addScore(87);
		sprGr.addScore(95);
		
	}
	
	@AfterEach
	void tearDown() throws Exception {
		fallGr = null;
		sprGr = null;
	}

	@Test
	void addScoreTest() {
		
		assertTrue(fallGr.toString().equals("85.0 92.0 78.0"));
		assertEquals(3, fallGr.getScoreSize());
		assertTrue(sprGr.toString().equals("90.0 87.0 95.0"));
		assertEquals(3, sprGr.getScoreSize());
	}
	@Test
	void minimumTest() {
		
		assertEquals(78.0, fallGr.minimum(),0.1);
		assertEquals(87.0, sprGr.minimum(), 0.1);
	}
	@Test
	void sumTest() {
		
		assertEquals(255.0, fallGr.sum(), 0.1);
		assertEquals(272.0, sprGr.sum(), 0.1);
	}
	@Test
	void finalScoreTest() {
		
		assertEquals(177.0, fallGr.finalScore(), 0.1);
		assertEquals(185.0, sprGr.finalScore(), 0.1);
	}
	
	

}
