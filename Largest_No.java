package Array;

import com.sun.javafx.binding.StringFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Largest_No {
    //example given [3,30,34,5,9] ->> largest no formed by these elements is -> 9534440
    static String largestNumber(List<Integer> a)
    {
        String[] arr=new String[a.size()];
        for(int i=0;i<a.size();i++)
        {
            arr[i]=String.valueOf(a.get(i));
        }
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(String s:arr)
        {
            sb.append(s);
        }
        if(sb.charAt(0)=='0')
        {
            return String.valueOf(0);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(1);
        String s=largestNumber(list);
        System.out.println(s);
    }



}
