class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Integer> mapHor = new HashMap<Character, Integer>();
        ArrayList<Map<Character, Integer>> listMapVer = new ArrayList<Map<Character, Integer>>();
        ArrayList<Map<Character, Integer>> listMapSquare = new ArrayList<Map<Character, Integer>>();
        for (int i = 0; i < 9; i++) {
            listMapVer.add(new HashMap<Character, Integer>());
            listMapSquare.add(new HashMap<Character, Integer>());
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    //System.out.println(i + " ," + j + " ," + board[i][j]);
                    // check horizontally
                    if (mapHor.containsKey(board[i][j])) return false;
                    else mapHor.put(board[i][j], 1); 

                    // check vertically
                    if (listMapVer.get(j).containsKey(board[i][j])) return false;
                    else listMapVer.get(j).put(board[i][j], 1);

                    // check 3 x 3
                    if (j < 3) {
                        if (i < 3) {
                            if (listMapSquare.get(0).containsKey(board[i][j])) return false;
                            else listMapSquare.get(0).put(board[i][j], 1);
                        } else if (i < 6) {
                            if (listMapSquare.get(3).containsKey(board[i][j])) return false;
                            else listMapSquare.get(3).put(board[i][j], 1);
                        } else {
                            if (listMapSquare.get(6).containsKey(board[i][j])) return false;
                            else listMapSquare.get(6).put(board[i][j], 1);
                        }
                    } else if (j < 6) {
                        if (i < 3) {
                            if (listMapSquare.get(1).containsKey(board[i][j])) return false;
                            else listMapSquare.get(1).put(board[i][j], 1);
                        } else if (i < 6) {
                            if (listMapSquare.get(4).containsKey(board[i][j])) return false;
                            else listMapSquare.get(4).put(board[i][j], 1);
                        } else {
                            if (listMapSquare.get(7).containsKey(board[i][j])) return false;
                            else listMapSquare.get(7).put(board[i][j], 1);
                        }
                    } else {
                        if (i < 3) {
                            if (listMapSquare.get(2).containsKey(board[i][j])) return false;
                            else listMapSquare.get(2).put(board[i][j], 1);
                        } else if (i < 6) {
                            if (listMapSquare.get(5).containsKey(board[i][j])) return false;
                            else listMapSquare.get(5).put(board[i][j], 1);
                        } else {
                            if (listMapSquare.get(8).containsKey(board[i][j])) return false;
                            else listMapSquare.get(8).put(board[i][j], 1);
                        }
                    }
                }
            }
            mapHor.clear();
        }
        return true;
    }
}