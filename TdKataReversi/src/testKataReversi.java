import static org.junit.Assert.*;

import org.junit.Test;


public class testKataReversi {

	@Test
	public void legalPositionsForWhite() {
		String input = ""+
				"......../n" +
				"......../n" +
				"......../n" +
				"...BW.../n" +
				"...WB.../n" +
				"......../n" +
				"......../n" +
				"......../n" +
				"W";
		String output = ""+
				"......../n" +
				"......../n" +
				"...0..../n" +
				"..0BW.../n" +
				"...WB0../n" +
				"....0.../n" +
				"......../n" +
				"......../n" +
				"W";
		
		Reversi reversi = new Reversi();
		reversi.round="White";
		assertEquals(output,reversi.printLegalMoves(input));
}
	@Test
	public void legalPositionsForBlack() {
		String input = ""+
				"......../n" +
				"......../n" +
				"......../n" +
				"...BW.../n" +
				"...WB.../n" +
				"......../n" +
				"......../n" +
				"......../n" +
				"B";
		String output = ""+
				"......../n" +
				"......../n" +
				"....0.../n" +
				"...BW0../n" +
				"..0WB.../n" +
				"...0..../n" +
				"......../n" +
				"......../n" +
				"B";
		
		Reversi reversi = new Reversi();
		reversi.round="Black";
		assertEquals(output,reversi.printLegalMoves(input));

}
}
