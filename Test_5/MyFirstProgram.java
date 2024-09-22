import myfirstpackage.*;

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
}
