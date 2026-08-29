class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sc = source[1];
        int sr = source[0];

        int tr = target[0];
        int tc = target[1];
        
        if(sr == tr && sc == tc){
            return 0;
        }else if ((sr + sc) % 2 != (tr + tc) % 2){
            return -1;
        }else if (Math.abs(sr - tr) == Math.abs(sc - tc)){
            return 1;
        }
        return 2;
    }
}