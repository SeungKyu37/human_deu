package Human09;

public class MyPoint {
	public int x;
	public int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int i, int j) {
		double dis;
		dis = Math.sqrt((this.x-i)*(this.x-i) + (this.y-j)*(this.y-j));
		return dis;
	}

}
