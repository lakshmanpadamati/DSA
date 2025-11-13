import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChessBoardAndQueens {
    static  Long ans=0L;
    public static void main(String[] args) throws Exception{
        String []boardString=new String[8];
        char[][]board=new  char[8][8];

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<8;i++){
            boardString[i]=br.readLine();
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                board[i][j]=boardString[i].charAt(j);
            }
        }
        solve(0,board);
        System.out.println(ans);

    }
    static void solve(int row, char[][]board){
        if( row==8){
            ans++;
            return ;
        }
        for(int col=0;col<8;col++) {
            if (checkSafe(row,col, board)) {
                board[row][col] = 'O';
                solve(row + 1, board);
                board[row][col] = '.';
            }
        }

    }
    static boolean checkSafe(int row,int col,char[][]board){
        if(board[row][col]=='*')return false;
        //same column
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='O')
                return false;
        }
        // positive diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){

            if(board[i][j]=='O')return false;

        }
        for(int i=row-1,j=col+1;i>=0&& j<8;i--,j++){

            if(board[i][j]=='O')return false;

        }
        return true;
    }
}
