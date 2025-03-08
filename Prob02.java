public class Prob02 {
    public static void main(String[] args) {
        findPrimeRange(20);
    }
    public static void findPrimeRange(int n){
        
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println("this is a prime number "+i);

            }
        }
    }
    public static boolean isPrime(int i){
        if (i<2) return false;
        if(i==2){
            return true;
        }
        for(int j=2; j<=Math.sqrt(i); j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
