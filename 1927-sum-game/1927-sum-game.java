class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int mid = n / 2;

        int sumLeft = 0;
        int sumRight = 0;
        int qLeft = 0;
        int qRight = 0;

        for (int i = 0; i < n; i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                if (i < mid) {
                    qLeft++;
                } else {
                    qRight++;
                }
            } else {
                if (i < mid) {
                    sumLeft += ch - '0';
                } else {
                    sumRight += ch - '0';
                }
            }
        }


        if ((qLeft + qRight) % 2 == 1) {
            return true;
        }


        return 2 * (sumLeft - sumRight) != 9 * (qRight - qLeft);
    }
}
