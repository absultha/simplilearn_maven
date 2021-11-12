package  tdd;
public class PrimeCheck {
    public boolean isPrime(int n) {
        
        
        int i,m=0;      
          boolean flag=true;   
          m=n/2;      
          if(n==0||n==1){  
           System.out.println(n+" is not prime number");      
          }else{  
           for(i=2;i<=m;i++){      
            if(n%i==0){      
                 
             flag=false;      
             break;      
            }      
           }      
           if(flag==false)  { System.out.println(n+" is prime number"); }  
          }
		return flag;
    }
}
