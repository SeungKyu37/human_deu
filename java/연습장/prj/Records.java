package prj;

import javafx.beans.property.StringProperty;

public class Records extends Player{
	

	public Records(StringProperty team, StringProperty region) {
		super(team, region);
	}
	
	int games;
	int pa;
	int ab;
	int run;
	int hits;
	int hit;
	int doubles;
	int triples;
	int homeruns;
	int rbi;
	int hbp;
	int bb;
	int so;
	int sb;
	int cs;
	double avg;
	double obp;
	double slg;
	double ops;
	
	int win;
	int lose;
	double ip;
	int hits2;
	int bb2;
	int hbp2;
	int so2;
	int run2;
	int er;
	double era;
	double whip;

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
}
