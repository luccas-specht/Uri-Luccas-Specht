package Lista1;



public class Exercicio1 {
	
	int v1[]= {4,3,17,8,4,5,1,96};
	int v2[] = {17,3,34,8,4,127,8};
	int i=0;
	
	public int INTERSECCAO() {
		
	
	int tam=0;
	
	
	for(i=0;i<v1.length;i++) {
	for(i=0;i<v2.length;i++) {
		
	
	if(v2[i]!=v1[i]) {
		
		tam++;
	}
	}
	}

	int[] y= new int[tam];
	 

	for( i = 0 ; i < tam ; i++){
    
	y[i] = v2[i];
	y[i] = v1[i];
	}

	

    System.out.print(y[0]+ ","+ y[1]+ ","+ y[2]+ ","+ y[3]);
	

	
		
		return 0;
	}


 
	
	
	public int UNIAO() {
	 
//		int v1[]= {4,3,17,8,4,5,1,96};
//		int v2[] = {17,3,34,8,4,127,8};
		int i=0;	
		 
		int v3[] = new int [10];
		
		
		if(v1[0]==v1[4]) {
			
			
		}
		
		
        for (i=0; i<v1.length; i++ ) {
        	 v3[i] =v1[i];
        }        
             
        for (  i=0; i<v2.length; i++ ) {
        	 v3[i] =v2[i];
        }
		

        	if(v3[3]==v3[6]) {
        	
       		
       		
        	
        	}
     
		return 0;
	  
  }



	}























//for(i=0;i<v1.length;i++) {
//	for(i=0;i<v2.length;i++) {
//		
//	
//	if(v1[i]!=v2[i]) {
//		
//		tam++;
//}
//}
//}
//
//int [] y= new int[tam];
//	 
//
//for( i = 0 ; i < tam ; i++){
//    
//	y[i] = v2[i];
//	y[i] = v1[i];
//}

//for(i = 0 ; i <y.length ; i++) {
//
//	System.out.print(y[i]);
//}























