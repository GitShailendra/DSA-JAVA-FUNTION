public class Prob04 {
    public static void main(String[] args) {
        int n=101;
        convertBinaryToDecimal(n);
    }
    public static void convertBinaryToDecimal (int n){
        int myNum = n;
        int dec =0;
        int pow =0;
        while (n>0) {
            int ld = n%10;
            dec  = dec+(ld*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("decimal of "+ myNum +" number is  "+ dec);
    }
}
