class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char r = board[i][j];
                if (r != '.') {
                    if (row.contains(r)) return false;
                    row.add(r);
                }

                char c = board[j][i];
                if (c != '.') {
                    if (col.contains(c)) return false;
                    col.add(c);
                }
            }
        }

        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                HashSet<Character> box = new HashSet<>();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[boxRow * 3 + i][boxCol * 3 + j];
                        if (c == '.') continue;
                        if (box.contains(c)) return false;
                        box.add(c);
                    }
                }
            }
        }

        return true;
    }
}