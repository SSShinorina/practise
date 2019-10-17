public class Calculator{
	public static void main(String[] args){

		System.out.println(addition(3,4));
		System.out.println(subtraction(13,4));
		System.out.println(multiplication(x:10,y:2));
		System.out.println(division(x:9,y:3));
                
	}

	double addition(double x, double y){
		return x + y;
	}

	double subtraction(double x, double y){
		return x - y;
	}
	double division(double x,double y){return x / y};
 
   
 
}