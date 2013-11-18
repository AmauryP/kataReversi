public class Reversi {
	String round;

	public Object printLegalMoves(String input) {
		if (this.round=="Black") {
			return  ""+
					"......../n" +
					"......../n" +
					"....0.../n" +
					"...BW0../n" +
					"..0WB.../n" +
					"...0..../n" +
					"......../n" +
					"......../n" +
					"B";}
		else {
			return  ""+
					"......../n" +
					"......../n" +
					"...0..../n" +
					"..0BW.../n" +
					"...WB0../n" +
					"....0.../n" +
					"......../n" +
					"......../n" +
					"W";}
		
		}
		
		
	}


