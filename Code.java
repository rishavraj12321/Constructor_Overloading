/*Rishav Raj
 * 2017182
 */
import java.util.Scanner;
public class Box {
	double length,breadth,height;
	public Box()
	{
		length=0.0;
		breadth=0.0;
		height=0.0;
	}
	public Box(double length,double breadth,double height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public Box(double parameter)
	{
		this.length=parameter;
		this.breadth=parameter;
		this.height=parameter;
	}
	public Double Volume()
	{
		return this.length*this.breadth*this.height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box A=new Box();
		System.out.println(A.Volume());
		
		Box B=new Box(8.0,7.0,2.0);
		System.out.println(B.Volume());
		
		Box C=new Box(3.0);
		System.out.println(C.Volume());
	}
		
}
// New Function has been added to this code 

