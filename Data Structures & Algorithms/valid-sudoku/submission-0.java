class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            HashSet<Character>set = new HashSet<>();
            for(int col=0;col<9;col++){
                char nums=board[row][col];
                if(nums=='.'){
                    continue;
                }
                if(set.contains(nums)){
                    return false;
                }
                set.add(nums);
            
            }
        
        }
        for(int col=0;col<9;col++){
            HashSet<Character>set=new HashSet<>();
            for(int row=0;row<9;row++){
                char nums=board[row][col];
                if(nums=='.'){
                    continue;

                }
                if(set.contains(nums)){
                    return false;
                }
                set.add(nums);
            }
        }
        for(int boxrow=0;boxrow<9;boxrow+=3){
            for(int boxcol=0;boxcol<9;boxcol+=3){
                HashSet<Character>set=new HashSet<>();
                for(int r=0;r<3;r++){
                    for(int c=0;c<3;c++){
                        char nums=board[boxrow+r][boxcol+c];
                        if(nums=='.'){
                            continue;

                        }
                        if(set.contains(nums)){
                            return false;
                        }
                        set.add(nums);
                    }
                }
            }
        }
    return true;
    }

}