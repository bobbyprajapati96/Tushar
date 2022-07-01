package Array;

public class wiproexam {
    public static void findPin(int input1,int input2,int input3,int input4)
    {
        int pin=0;
//        int lar=0;
        int smallest=9;
        int smallest2=9;
        int smallest3=9;
        int ans1=0;
        int ans2=0;
        int ans3=0;
        if (input4 % 2 == 0) {
            while(input1!=0)
            {
                int r=input1%10;
                smallest=Math.min(r,smallest);
                input1=input1/10;
                ans1=smallest;
            }
            System.out.println(ans1);
//           lar=0;
//            smallest=9;
            while(input2!=0)
            {

                int r=input2%10;
                 smallest2=Math.min(r,smallest2);
                input2=input2/10;
                ans2=smallest2;

            }
            System.out.println(ans2);

//            System.out.println(lar+" "+ smallest);
            while(input3!=0)
            {
                int r=input3%10;
                smallest3=Math.min(r,smallest3);
                input3=input3/10;
                ans3=smallest3;
            }
            System.out.println(ans3);

            pin=(ans1*ans2*ans3) +input4;
            System.out.println(pin);
        }
    }

    public static void main(String[] args) {
        int one=3521;
        int two=2452;
        int three=1352;
        int four=38;
        findPin(one,two,three,four);

    }
}
