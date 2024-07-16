class Solution {
    public boolean isValidSudoku(char[][] board) {

        
        List<List<List<Integer>>> cube=List.of(
        List.of(new ArrayList<>(),new ArrayList<>(),new ArrayList<>()),
        List.of(new ArrayList<>(),new ArrayList<>(),new ArrayList<>()),
        List.of(new ArrayList<>(),new ArrayList<>(),new ArrayList<>()));


        for(int i=0;i<board.length;i++){
            List<Integer> horizontal=new ArrayList<>();
            List<Integer> vertical=new ArrayList<>();
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.'){
                    int mm=Integer.parseInt(board[i][j]+"");
                    if(!horizontal.contains(mm))horizontal.add(mm);
                    else return false;
                    if(!cube.get(i/3).get(j/3).contains(mm))cube.get(i/3).get(j/3).add(mm);
                    else return false;
                }
                if(board[j][i]!='.'){
                    int nn=Integer.parseInt(board[j][i]+"");
                    if(!vertical.contains(nn))vertical.add(nn);
                    else return false;
                }

            }
        }
        return true;
    }
}