package gfg;
import java.util.Scanner;
import java.util.Arrays;
public class wipro {
    public static void main(String[] args) {
     int key1=0;
     int key2=0;
     int key33=0;
//     int[] key3=new int[4];`
     int input1=3521;
     int input2=2452;
     int input3=1352;

     key1=(input1/1000);
     key2=(input2/100)%10;
     int l=9;
     while(input3>0){
         int r=input3%10;
         l=Math.min(r,l);
         input3=input3/10;
     }
     key33=l;
        System.out.print(key1+" "+key2+" "+key33);
   int ans=(key1*key2)+(key33);
        System.out.println(ans);
    }
}
