class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int[] arr = new int[heights.length];

        int beg = 0, end = heights.length-1;
        while (beg<end){
            if (heights[beg]<heights[end]){
                arr[beg] = heights[beg]*(end-beg);
                beg++;
            }
            else if (heights[end]<heights[beg]){
                arr[end] = heights[end]*(end-beg);
                end--;
            }
            else {
                arr[beg] = heights[beg]*(end-beg);
                arr[end] = heights[end]*(end-beg);
                beg++; end--;
            }
        }

        for (int num: arr){
            area = Math.max(area, num);
        }

        return area;
    }
}
