class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if ((num & 1) == 0) { // even
                num >>= 1;        // divide by 2
            } else {
                num--;            // subtract 1
            }
            steps++;
        }

        return steps;
    }
}
