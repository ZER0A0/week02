package week02;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Shape{
	private int r , w , h , a , b , type = 0;
	private float angle;
	private static int count = 0;
	
	public Shape(int r1){
		type = 1 ; r = r1 ; count ++;
	}
	
	public Shape(int w1 , int h1){
		type = 2 ; w = w1 ; h = h1 ; count ++;
	}
	
	public Shape(int a1 , int b1 , float angle1){
		type = 3 ; a = a1 ; b = b1 ; angle = angle1 ; count ++;
	}
	
	public float getPerimeter(){
		float ans1 = 0.0f;
		switch(type){
		case 1:
			ans1 = 2 * r * 3.14f;
			break;
			
		case 2:
			ans1 = 2 * w + 2 * h;
			break;
			
		case 3:
			ans1 = a + b + (float)(a * a + b * b - 2 * a * b * Math.cos(angle));
			break;
		}
		return ans1;
	}
	
	public float getArea(){
		float ans2 = 0.0f;
		switch(type){
		case 1:
			ans2 = r * r * 3.14f;
			break;
			
		case 2:
			ans2 = w * h;
			break;
			
		case 3:
			ans2 = (float)(a * b * Math.sin(angle) / 2);
			break;
		}
		return ans2;
	}
	
	public static int getCount(){
		return count;
	}
	
}