class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sum = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                if (tickets[i] > tickets[k]) {
                    sum += tickets[k];
                } else {
                    sum += tickets[i];
                }
            } else {
                if (tickets[i] >= tickets[k]) {
                    sum += tickets[k] - 1;
                } else {
                    sum += tickets[i];
                }
            }
        }
        return sum;
    }
}