class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int length = 0;
        
        for (int[] size : sizes) {
            width = Math.max(width, Math.max(size[0], size[1]));
            length = Math.max(length, Math.min(size[0], size[1]));
        }
        
        return width * length;
    }
}