/**
 * Solution for traversing a matrix from start(0,0) to end(n-1,n-1)
 * assuming rat can only traverse through adjecent 1's of current position.
 */
package backtracking;

public class RatMaze {
    static int N;

    public static void main(String[] args){
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        N = maze.length;
        solveMaze(maze);
    }

    public static boolean isSafe(int[][] maze, int x, int y){
        return (x>=0 && x<N && y>=0 && y<N && maze[x][y]==1);
    }

    public static void printSolution(int[][] sol) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(sol[i][j]+ "  ");
            }
            System.out.println();
        }
    }

    public static boolean solveMaze(int[][] maze){
        int[][] sol = new int[N][N];

        if(!solveMazeUtil(maze, 0,0,sol)){
            System.out.println("Solution not possible");
            return false;
        }
            printSolution(sol);
        return true;
    }

    public static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol){
        if(x==N-1 && y==N-1 && maze[x][y]==1){
            sol[x][y]=1;
            return true;
        }

        if(isSafe(maze,x,y)){
            if(sol[x][y]==1)
                return false;
            sol[x][y]=1;

            if(solveMazeUtil(maze, x+1,y,sol))
                return true;

            if(solveMazeUtil(maze, x,y+1,sol))
                return true;

            if(solveMazeUtil(maze, x-1,y,sol))
                return true;
            if(solveMazeUtil(maze, x,y-1,sol))
                return true;

            sol[x][y]=0;
            return false;
        }
        return false;
    }
}
