package LambdaExprsn;

public class Car
{
	//Vehicle  v1=()->{
		//System.out.println("car is moving");
	//};
	
	
	
	//Vehicle  v1=a->{
		//System.out.println("car is moving");//for one parameter there is no need of parenthesis
	//};
	
	
	
	//Vehicle  v1=(a,b)->{
		//System.out.println("car is moving");
	//};
	
	
	
//if there is only one statement in the method,then there is no need of parenthesis
	Vehicle  v1=(a,b)->System.out.println("car is moving");
	
	
	
}



