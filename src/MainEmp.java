//using Thread 


public class MainEmp{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Employee e1=new Employee(1,"AAA",9328,"hr","it");
			Employee e2=new Employee(2,"BBB",8000,"hr","it");
			Employee e3=new Employee(3,"CCC",5000,"hr","it");
			Employee e4=new Employee(4,"DDD",6000,"hr","it");
			Employee e5=new Employee(5,"EEE",7000,"hr","it");
			
			e1.start();
			e2.start();
			e3.start();
			e4.start();
			e5.start();
			
	}

}
