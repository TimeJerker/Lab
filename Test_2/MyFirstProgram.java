class MyFirstClass {
	public static void main(String[] s){
		MySecondClass  Start = new MySecondClass();
		System.out.println(Start.maximum());
		for(int i = 1; i <= 8; i++){
			for(int j = 1; j <= 8; j++){
				Start.setX(i);
				Start.setY(j);
				System.out.println(Start.maximum());
				System.out.println(" ");
			}
			System.out.println();
		}
	}
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