package threads;

public class Learnthreads  {

	public static int a=1;
 public  static synchronized void first(){
	 
	 a++;
	
	
	
}
	
	
	public static void main(String [] args) throws InterruptedException{
		
		
	Thread t =new Thread(new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<7;i++){
				first();
				System.out.println(i+a);
			}
			
		}
		
		
	});
	
	
	Thread t2 =new Thread(new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0;i<7;i++){
			first();
				System.out.println(i+a);
			}
			
		}
		
		
	});
	
	t.start();
	t.join();
	t2.start();
	
	}
}
