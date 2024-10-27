class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<List<List<Character>>> cube=List.of(
                                    List.of(new ArrayList<>(),new ArrayList<>(),new ArrayList<>()),
                                    List.of(new ArrayList<>(),new ArrayList<>(),new ArrayList<>()),
                                    List.of(new ArrayList<>(),new ArrayList<>(),new ArrayList<>()));
        for(int i=0;i<board.length;i++){
            List<Character> h=new ArrayList<>();
            List<Character> v=new ArrayList<>();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    if(!h.contains(board[i][j])){
                        h.add(board[i][j]);
                    }else return false;
                    if(!cube.get(i/3).get(j/3).contains(board[i][j])){
                        cube.get(i/3).get(j/3).add(board[i][j]);
                    }else return false;
                }
                if(board[j][i]!='.'){
                    if(!v.contains(board[j][i])){
                        v.add(board[j][i]);
                    }else return false;
                } 
            }
        }
        return true;
    }
}