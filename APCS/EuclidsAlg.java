
public class EuclidsAlg
{
    public static int GCD(int a, int b){
        if(a < 0 || b < 0){
            return -1;
        }else if(a>b){
            return GCD(b,a);
        }else if(a==1){
            return 1;
        }else if(a==0){
            return b;
        }else{
            return GCD(a,b-a);
        }
    }
}
