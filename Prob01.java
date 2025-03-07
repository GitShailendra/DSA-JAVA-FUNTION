public class Prob01{
    public static void main(String[] args) {
        int n=5;
        int r=2;
       System.out.println(binocofi(n, r));
    }
    public static int factorial(int n){
        int a=1;
        for(int i=1; i<=n; i++){
            a=a*i;
        }
        return a;
    }
    public static int binocofi(int n,int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int ncrfact = factorial(n-r);
        int ans = nfact/(rfact*ncrfact);
        return ans;
    }
}