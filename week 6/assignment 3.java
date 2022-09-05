interface A {
	public abstract void run();
}
class B implements A {
	public void run() {}
}


// answer start
class MyThread extends B
{
  public void run()
  {
		System.out.print("NPTEL Java week-6 new Assignment Q3");
  }
}
// ends


public class Question63 {
     public static void main(String[] args) {
         MyThread t = new MyThread();
         t.run();
     }
}