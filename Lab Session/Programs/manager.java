Author Name:M.Abitha
Title: Write a program in thread concepts

class Thread1 extends Thread{
	
	synchronized void test1() {
		for(int i=1;i<10;++i) {
			System.out.println(i);
		}
	}
	synchronized void test2() {
		for(int i=6;i<15;++i) {
			System.out.println(i);
		}
	}	
}

class Thread2 extends Thread{
	Thread1 obj;
	
	Thread2(Thread1 obj){
		this.obj=obj;
	}	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj.test1();
	}
}

class Thread3 extends Thread{
	Thread1 obj1;
	Thread3(Thread1 obj1)
	{
		this.obj1=obj1;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		obj1.test2();
	}
}

public class Manager{	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread1 obj = new Thread1();			
			Thread2 obj1 = new Thread2(obj);
			Thread3 obj2 = new Thread3(obj);			
			obj1.start();
			obj2.start();	
		
	}

}