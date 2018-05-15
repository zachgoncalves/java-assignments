
package maze;

import java.util.*;
import java.awt.Point;
import java.util.LinkedList;

public class YourMazeWithPath
{       
    private InputGraphicMaze maze;
    private int R, C; private int[][] V;

    public YourMazeWithPath() 
    {       
        // an R rows x C columns maze
        maze = new InputGraphicMaze();
        R=maze.Rows(); 
        C=maze.Cols(); 
        V=new int[R+1][C+1];
        for (int i=1; i<=R; i++) {
           for (int j=1; j<=C; j++) {
               V[i][j]=0;
           } 
        }
        // Path holds the cells of the path
        LinkedList<Point> Path = new LinkedList<Point>();
        //Create the path
        CreatePath(maze, 1, 1, R, C, Path);
        // show the path in the maze
        maze.showPath(Path);
    }
    public boolean CreatePath(InputGraphicMaze maze, int srow, int scol, int erow, int ecol, LinkedList<Point> L) {
        boolean done = ((srow == erow) && (scol == ecol));
        L.push(new Point(srow, scol));
        V[srow][scol] = 1;
            if ((!done)&&(srow>1)&&(V[srow-1][scol]!=1)&&(maze.can_go(srow, scol,'U'))){
                done = CreatePath(maze, srow-1, scol, erow, ecol, L);
                if(!done){
                    L.pop();
                    V[srow-1][scol] = 0;
                }
            } 
            if ((!done)&&(scol<C)&&(V[srow][scol+1]!=1)&&(maze.can_go(srow, scol,'R'))){
                done = CreatePath(maze, srow, scol+1, erow, ecol, L);
                if(!done){
                    L.pop();
                    V[srow][scol+1] = 0;
                }
            }           
            if ((!done)&&(srow<R)&&(V[srow+1][scol]!=1)&&(maze.can_go(srow, scol, 'D'))){
                done = CreatePath(maze, srow+1, scol, erow, ecol, L);
                if(!done){
                    L.pop();
                    V[srow+1][scol] = 0;
                }
            }              
            if ((!done)&&(scol>1)&&(V[srow][scol-1]!=1)&&(maze.can_go(srow, scol, 'L'))){
                done = CreatePath(maze, srow, scol-1, erow, ecol, L);
                if(!done){
                    L.pop();
                    V[srow][scol-1] = 0;
                }
            }
        return done;
     }
 
    public static void main(String[] args) {
        new YourMazeWithPath();
    }
}
