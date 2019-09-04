//using Runnable
public class MainEmpRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(1,"AAA",9328,"hr","it");
		Employee e2=new Employee(2,"BBB",8000,"hr","it");
		Employee e3=new Employee(3,"CCC",5000,"hr","it");
		Employee e4=new Employee(4,"DDD",6000,"hr","it");
		Employee e5=new Employee(5,"EEE",7000,"hr","it");
		
		Thread t1=new Thread(e1);
		Thread t2=new Thread(e2);
		Thread t3=new Thread(e3);
		Thread t4=new Thread(e4);
		Thread t5=new Thread(e5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
