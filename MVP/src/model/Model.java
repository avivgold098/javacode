package model;

import algorithms.mazeGenerators.Position;
import algorithms.search.Solution;

public interface Model {
	/**
	 * this method is write to file  all the files and and the folders into the path we sent
	 * @param str- the path
	 */
	public void dir(String str);
	/**
	 * this method create solution  to our search problem
	 * using BFS,Astar
	 * @param name  the name of the name of the maze
	 * @param algoname the name of the algo we using into the solution 
	 */
	void createSolution(String name,String Algoname) ;
	/**
	 * this method write to file the maze (using to string) with the name we sent
	 * @param str- the name of the maze we wants to get him from the hash map
	 */
	public void displaySolution(String name);
	/**
	 * this method return solution for the name of the maze we sent
	 * @param name the name of the maze we wont for him the solution
	 * @return the solution 
	 */
	Solution<Position> getSolution(String name);
	/**
	 * this method write to file the maze (using to string) with the name we sent
	 * @param str- the name of the maze we wants to get him from the hash map
	 */
	void display(String str);
	/** this method generate our maze with name we sent and also with the limits we sent
	 * and put the maze into the hash map of string(key) and 3dmaze(value)
	 * @param name - the name of the maze
	 * @param y- the high of the maze
	 * @param z- the num of Lines in every  floor 
	 * @param x- the length of every floor
	 * after the maze is created we showing from the view into file message that maze is ready
	 */
	void generate(String name, int y, int z, int x);
	
	void getMazeByName(String name);
	/**
	 * this method is write to file the cross section we wants 
	 * @param by- the section we wants
	 * @param index- the index into the section 
	 * @param name- the name of the maze
	 */
	void crossBy(String by, int index, String name);
	/**
	 * this method save our maze by in compressing way
	 * @param name- the name of the maze we want to saving him
	 * @param filename- the name of the file we will save the compressing maze 
	 */
	public void saveMaze(String Name,String FileName) ;
	/**
	 * this method is create maze from comperssing maze from file we sent
	 * @param file name - the name of the file that we taking from him the compressing maze
	 * @param name- the name of the maze we create
	 */
	void loadMaze(String FileName,String Name);
	/**
	 * this method is calculate  the maze size in the memory
	 * this method calculate the maze3d class size by using formula 
	 * @param the name of the maze we wont to calculate from him his size
	 */
	void mazeSizeMemory(String name);
	/**
	 * this method calculate the maze size into file 
	 * @param name - the name of the maze we took from the hash map
	 */
	void mazeSizeFile(String name);
	/**
	 * this method closed all the threads and the files 
	 */
	public void exit() ;
	void save();
	
}

