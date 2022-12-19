package baseball;

public class Records extends Player{
	public int games;
	public int pa;
	public int ab;
	public int run;
	public int hits;
	public int hit;
	public int doubles;
	public int triples;
	public int homeruns;
	public int rbi;
	public int hbp;
	public int bb;
	public int so;
	public int sb;
	public int cs;
	public double avg;
	public double obp;
	public double slg;
	public double ops;
	
	public int win;
	public int lose;
	public double ip;
	public int hits2;
	public int bb2;
	public int hbp2;
	public int so2;
	public int run2;
	public int er;
	public double era;
	public double whip;
	
	public double avg(){
		avg = (double) hit / ab;
		return avg;
	}
	public double obp() {
		obp = (double) (hit + bb + hbp) / pa;
		return obp;
	}
	public double slg() {
		slg = (double) (hit + (doubles *2) + (triples*3) + (homeruns*4)) / ab;
		return slg;
	}
	public double ops() {
		ops = obp + slg;
		return ops;
	}
	public double era() {
		era = (double) (er*9) / ip;
		return era;
	}
	public double whip() {
		whip = (bb2 + hbp2 + hits2) / ip;
		return whip;
	}
	Player player1 = new Player();

}
