

public class FizzBuzz {
 public static void main(String[] args) {

for (int i = 1; i <= 100; i++) {
	int fizz = 3;
        int buzz = 5;
        
        if(i%fizz==0 && i%buzz==0){
	 System.out.println("fizzbuzz");	
	}else  if( i%buzz==0){
	 System.out.println("buzz");
	}else if(i%fizz==0 ){
	 System.out.println("fizz");	
	}else if(!(i%fizz==0)|| !(i%buzz==0)){
	 System.out.println(i);	
	}
		
}
  
    
}
} 
