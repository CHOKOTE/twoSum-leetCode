class Structure{
    public static int numOfDigit(int n){
        int count = 0;
        if(n<0) n=-n;

        while(n>0){
            n /=10;
            count++;
        }
        return count;

    }
    public static int sumOfDigit(int n){
       var sum=0;
       if(n<0) n=-n;
       while(n>0){
        sum += n%10;
        n/=10;
       }
       return sum;
    }
    public static int reverseDigits(int n){
         var sign = n<0 ? -1 :1;
         if(n==0) return 0;
         if(n<0) n=-n;
         var reverse = 0;
         while(n>0){
            reverse= 10*reverse + n%10;
            n/=10;
         }
        
        return sign*reverse;
    }
    
   public static void main(String[] arg){
          
          
          System.out.println(reverseDigits(-8036800));
    }
}