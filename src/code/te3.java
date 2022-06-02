package code;

public class te3 {
    public static void main(String[] args) {
        int[][] board1 = new int[][]{
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };
        Integer output1 = boardGame(board1, "RRRRR");
        System.out.println(output1); // 4
    }

    public static Integer boardGame(int[][] board, String operation) {
        // TODO:
        String[] arr = operation.split("");
        int count = 0;
        int x = 0;
        int y = 0;
        int start;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("U")) {
                x = x - 1;
                if(x < 0){
                    return null;
                }
                start = board[x][y];
                count += start;
            } else if (arr[i].equals("D")) {
                x = x + 1;
                if(x >= board.length){
                    return null;
                }
                start = board[x][y];
                count += start;
            } else if (arr[i].equals("L")) {
                y = y - 1;
                if(y < 0){
                    return null;
                }
                start = board[x][y];
                count += start;
            } else if (arr[i].equals("R")) {
                y = y + 1;
                if(y >= board.length){
                    return null;
                }
                start = board[x][y];
                count += start;
            }
         }
        return count;
    }
}