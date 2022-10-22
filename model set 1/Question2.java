class ExceptionHandling{
public static void main(String args[ ]) {

    //Answer
    try{
        int i=1;
        int j=0;
        int A=i/j;
        System.out.print("A");
    } 

catch(ArithmeticException e) {
      System.out.print("0");        	
    }
    finally  {            
	  System.out.print("B");
    }
  }
}
    