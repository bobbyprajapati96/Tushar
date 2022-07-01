package StringBuilder;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        int front;
        for (int i = 0; i < sb.length() / 2; i++) {
            front = i;
            int back = sb.length() - i - 1;
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(back);
            sb.setCharAt(back, frontChar);// sets frontChar at back position
            sb.setCharAt(front, backChar); // sets backChar at front position

        }

        System.out.println(sb);

    }
}
