class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int col = matrix[0].length;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<col;j++){
                heap.add(matrix[i][j]);
            }
        }
        for(int i = 0;i<k-1;i++){
            heap.remove();
        }
        return heap.peek();
    }
}