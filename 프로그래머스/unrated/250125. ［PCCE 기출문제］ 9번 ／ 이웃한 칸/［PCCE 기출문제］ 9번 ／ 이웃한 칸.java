class Solution {
    public int solution(String[][] board, int h, int w) {
        int boardLength = board.length;
        int result = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        String color = board[h][w];
//        if(h >= 1){
//            for(int i = h-1; i <= h + 1; i++){
//                if(board[i][w].equals(color) && (i != h)){
//                    result++;
//                }
//            }
//        } else {
//            if(board[0][w].equals(color)){
//                result++;
//            }
//        }
//
//        if(w >= 1){
//            for(int i = w - 1; i <= w + 1; i++){
//                if(board[h][i].equals(color) && (i != w)){
//                    result++;
//                }
//            }
//        } else {
//            if(board[h][0].equals(color)){
//                result++;
//            }
//        }

        // 4개만 비교하면 되니까
        for(int i = 0; i < 4; i++){
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if(h_check >= 0 && h_check < boardLength && w_check >= 0 && w_check < boardLength){
                if(board[h_check][w_check].equals(board[h][w])){
                    result++;
                }
            }
        }
        return result;
    }
}