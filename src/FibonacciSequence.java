
public class FibonacciSequence {

//    private static int fNum;
    
 public static void main(String[] args) {
     
     
//     int k, a=1, b=0;
//     for (int i = 0; i < 10; i++) {
//     k=0;
//     k=a+b;
//     a=b;
//     b=k;
//     System.out.println(k);
//     }
     
int index =0;
 while(index<10){
System.out.println(fibonacci(index));
index++;
  int num =0;
  int num2 = 1;
  int loop;
  int fibonacci;
 } 
  
//   }
   
        
        }
 


 public static long fibonacci(int i ){
 if(i==0) return 0;
  if(i<=2) return 1;
 
  long fibTerm = fibonacci(i-1)+ fibonacci(i-2);
   return fibTerm;
    }    
      

}
