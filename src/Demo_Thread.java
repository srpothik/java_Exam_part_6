
public class Demo_Thread extends Thread{  
	  public void run(){  
	    System.out.println("Yaappp My thread is in running state.");  
	  }   
	  public static void main(String args[]){  
		  Demo_Thread obj=new Demo_Thread();   
	     obj.start();  
	  }  
	}