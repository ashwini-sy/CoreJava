package test;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//----------While-Loop------------------
		 int i=3;
		 while(i>0){
			 
			 if(i!=3)
			    System.out.println(i);
			    i--;
			 }
		 //---------While-Loop -trail-2
		 
		 System.out.println("-------------------------------");
		 int i1=5;
		 while(i1>0)
		 {
			 
			 if(i1==3)
			    break;
			 System.out.println(i1);
			 i1--;
		
			 
		 }
		 System.out.println("-------------------------------");
		 int j=9;
		 while(j>0) {
			 j--;
			
			  if(j==5)
			  {
				  continue;
			    
			  }
			  System.out.println(j);
				  
			  
		 }
		 
		 
		 
		 System.out.println("++++++++++++++++++++++++++");
		  int k=0;
		  do {
			  System.out.println(k);
			  k++;
			  
		  }while(k<=10);
		  
		  //--For Loop---
		  System.out.println("++++++++++++++++++++++++++");
		
		  for(int s1=0;s1<=7;s1++) {
			  System.out.println(s1);
			  
		  }
		  
		  System.out.println("----------------------------");
			
		  for(int s1=10;s1>7;s1--) {
			  System.out.println(s1);
			  
		  }
			  
// --------Print array using For Loop----------
		  
		  System.out.println("---------Print arrays using Loop--");
		   int arrays[]= {1,2,3,49};
		   for(int p=0;p<arrays.length;p++) {

                     System.out.println(arrays[p]);
		   }
		  
		  
	}

}
