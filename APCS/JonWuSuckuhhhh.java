import java.util.*;
public class JonWuSuckuhhhh
{
    private static boolean[][] checkStuff;
    private static ArrayList<Integer> things;
    private static int capacity;
    private static Random r;
    public JonWuSuckuhhhh(int c){
        capacity = c;
        r = new Random();
        things = new ArrayList<Integer>();
    }
    public static void main(String[] args){
        JonWuSuckuhhhh jws = new JonWuSuckuhhhh(30);
        for(int i = 0; i <3; i++){
           things.add(r.nextInt(20));
        }
        checkStuff = new boolean[capacity+1][things.size()+1];
        for(int m = 0; m < checkStuff.length; m++){
            for(int n = 0; n < checkStuff[0].length; n++){
                if(n==0){
                    checkStuff[0][0]= true;
                }else if(things.get(n-1)==m){
                    checkStuff[m][n]=true;
                }
                else if(checkStuff[m][n-1]){
                    checkStuff[m][n]=true;
                }else if(things.get(n-1) < m){
                    if(checkStuff[m-things.get(n-1)][n-1]){
                        checkStuff[m][n] = true;
                    }else{
                        checkStuff[m][n] = false;
                    }
                }else{
                    checkStuff[m][n] = false;
                }
            }
        }
        
    }
}
