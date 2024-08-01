import java.util.*;

public class MaxRecInHisto {

    public static int maxArea(int[] height) {

        int maxArea = 0;
        int n = height.length;
        int nxtSmallLeft[] = new int[height.length];
        int nxtSmallRight[] = new int[height.length];

        //NSL
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int currHeight = height[i];
            while (!st.isEmpty() && height[st.peek()] > currHeight) {
                st.pop();
            }
            if (st.isEmpty()) {
                nxtSmallLeft[i] = -1;
            } else {
                nxtSmallLeft[i] = st.peek();
            }
            st.push(i);
        }

        //NSR
        st = new Stack<>();
        for (int i = n-1; i >=0 ; i--) {
            int currHeight = height[i];
            while (!st.isEmpty() && height[st.peek()] >= currHeight) {
                st.pop();
            }
            if (st.isEmpty()) {
                nxtSmallRight[i] = n;
            } else {
                nxtSmallRight[i] = st.peek();
            }
            st.push(i);
        }

        //Calculating maxArea
        for(int i = 0; i<n; i++){
            int currArea = height[i] * (nxtSmallRight[i]-nxtSmallLeft[i]-1);
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int height[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea(height));
    }
}
