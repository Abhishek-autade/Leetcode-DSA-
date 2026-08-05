class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int i = startcol; i <= endcol; i++) {
                ans.add(matrix[startrow][i]);
            }

            // right
            for (int j = startrow + 1; j <= endrow; j++) {
                ans.add(matrix[j][endcol]);
            }

            // bottom
            if (startrow < endrow) {
                for (int i = endcol - 1; i >= startcol; i--) {
                    ans.add(matrix[endrow][i]);
                }
            }

            // left
            if (startcol < endcol) {
                for (int j = endrow - 1; j > startrow; j--) {
                    ans.add(matrix[j][startcol]);
                }
            }

            startcol++;
            startrow++;
            endrow--;
            endcol--;
        }

        return ans;
    }
}