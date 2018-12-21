package threads;

public class Lrnthrds {
	
	public static int a=7;
	
	public static synchronized   void hty(){
		
			
		a++;
		
		System.out.println(a);
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		
		 Thread t =new Thread(new Runnable(){
                
			@Override
			public void run() {
				
				
				// TODO Auto-generated method stub
			for(int i=0;i<6;i++)	{
			//	hty();
				
				System.out.println("first");
				
			}
				
				
			}
			
			
		});
		
		
		
		Thread t1=new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for(int i=0;i<6;i++)	{
				//	hty();
					
					System.out.println("second");
					
				}
				
			}
			
			
			
		});
		
		
		
		t.start();
		t1.start();
		
		
		
		t.join();
		t1.join();
		
		
		System.out.println("main");
		
		}		
			
		
	
	
	
}		
		
	
	
		
		
	

		
	
	
	
	



