package myfirstpackage;

public class MySecondClass {
	private int x;
	private int y;

	public MySecondClass(){
		x = 0;
		y = 0;
	}

	public MySecondClass(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY (int y){
		this.y = y;
	}
	public int maximum(){
		if (x > y){
			return x;
		}
		else{
			return y;
		}
	}
}