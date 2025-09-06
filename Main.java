import java.util.*;
class Main {
	public static int add(int x, int y){
		int sum=x+y;
		return sum;
		}
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of x: 		");
		int x=sc.nextInt();
		System.out.print("Enter value of y: 		");
		int y=sc.nextInt();
		int result=add(x,y);
		System.out.println("Sum=" +result);
    }
}