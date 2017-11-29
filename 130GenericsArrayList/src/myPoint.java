import java.awt.*;
public class myPoint extends Point{
	Point p;
	myPoint(){
		p = new Point(0,0);
	}
	myPoint(int x, int y){
		p = new Point(x,y);
	}
	void setXY(int x, int y){
		p.x = x; p.y = y;
	}
	public String toString(){
		return "("+p.x+","+p.y+")";
	}
}