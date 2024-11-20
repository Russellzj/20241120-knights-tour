# Knights Tour Kata

## The Challenge
Write a program that generates the moves a Knight makes on a standard 8x8 chessboard such that the knight completes the Knight’s Tour. In the Knight’s Tour a knight starts at a square and visits each square on the board without landing on any square twice. 
* A knight in chess moves in a L shape, (2 spaces in vertical / horizontal), and 1 space in (horizontal / vertical)
* Find the first solution for a starting point if one exists
* Display the final solution with step numbers in a grid

## Extra Credit
* Make the size of the board configurable
* Find all the possible solutions for the starting point
* Find optimizations for the solutions

## Concepts

### Recursion
My dumb version: 
- Breaking a problem down into multiple smaller solvable problems, and reusing the same function to solve the smaller problems
- Need one or more terminal conditions

From AI
A recursive function is a function that calls itself during its execution. It's made up of two parts:
- Base case: A stopping condition
- Recursive step: The function calls itself to solve smaller instances of the problem

### Backtracking
My dumb version: 
- Think of it like following going through a maze, and getting to a dead end.
- Work your way back to the last possible decision point, and choose the other road

From AI
Backtracking is a problem-solving algorithmic technique used to find all (or some) solutions to a computational problem by incrementally building candidates and abandoning ("backtracking") those candidates as soon as it is determined that they cannot lead to a valid solution.

## Data Types
- Linked List, List, or Stack
- 2D Array, List of List
