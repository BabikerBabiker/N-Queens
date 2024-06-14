# N-Queens 
### Overview
The N-Queens Solver is a classic problem in computer science and chess that involves placing n queens on an n x n chessboard such that no two queens threaten each other. This means no two queens can share the same row, column, or diagonal. The goal is to find all possible solutions for a given n.

### How to Use
1. Start the Program: The program prompts the user to input the size of the board (n).
2. Initialize Board: An empty n x n board is created with all positions initially set to ".".
3. Solve the Problem: The program uses a recursive backtracking algorithm to place queens on the board.
4. Print Solutions: Each valid configuration of queens on the board is printed.

### Example
#### Input
Enter n: 4

#### Output
. q . .  
. . . q   
q . . .   
. . q .   

. . q .   
q . . .  
. . . q  
. q . .  
