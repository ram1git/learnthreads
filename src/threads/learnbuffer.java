package threads;

public class learnbuffer {
	
	static Float f=new Float(234.890);
	
	
	public static void main(String [] args) throws InterruptedException{
	
		Thread t=new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				StringBuilder bf=new StringBuilder("helllowert");
				bf.append(f);
			//	System.out.println(bf);
			//	System.out.println(System.currentTimeMillis());
				System.out.println(System.currentTimeMillis());
					
			}
			
		});
		
		
		Thread t2=new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				StringBuffer bf=new StringBuffer("helllowert");
				bf.append(f);
				//System.out.println(bf);
				//System.out.println(System.currentTimeMillis());
				System.out.println(System.currentTimeMillis());
					
			}
			
		});
		
		t.start();
		
		t2.start();
	 //  System.out.println(System.currentTimeMillis());
		
		
		}
	}

