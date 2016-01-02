package presenter;

import java.io.Serializable;

public class Properties implements Serializable {
	
	private static final long serialVersionUID = 42L;
	int xSize;
	int ySize;
	int zSize;
	int numberOfThreads;
	String name;
	String algorithemForSolution;
	String algorithemForCreate;
	String ui;
	
/**
 * Constructor of Properties
 */
	public Properties() {
		this.xSize = 9;
		this.ySize = 9;
		this.zSize = 9;
		this.numberOfThreads = 10;
		this.algorithemForSolution = "A* Air Distance";
		this.algorithemForCreate = "My Maze generator";
		this.ui = "CLI";
		this.name = "DefualtName";
	}
	public String getAlgorithemForCreate() {
		return algorithemForCreate;
	}

	/**
	 * set the algorithm of create
	 * @param algorithemForCreate -String name
	 */

	public void setAlgorithemForCreate(String algorithemForCreate) {
		this.algorithemForCreate = algorithemForCreate;
	}

	/**
	 * get the ui
	 * @return -ui
	 */

	public String getUi() {
		return ui;
	}


	/**
	 * set the ui
	 * @param -ui
	 */
	public void setUi(String ui) {
		this.ui = ui;
	}


	/**
	 * get the x size
	 * @return int x
	 */
	public int getXSize() {
		return xSize;
	}
	/**
	 * set the x size
	 * @param int x size
	 */

	public void setXSize(int xSize) {
		this.xSize = xSize;
	}

	/**
	 * get the y size
	 * @return int y
	 */
	public int getYSize() {
		return ySize;
	}

	/**
	 * set the x size
	 * @param int x size
	 */
	public void setYSize(int ySize) {
		this.ySize = ySize;
	}

	/**
	 * get the z size
	 * @return int z
	 */
	public int getZSize() {
		return zSize;
	}
	/**
	 * set the x size
	 * @param int x size
	 */
	public void setZSize(int zSize) {
		this.zSize = zSize;
	}

	/**
	 * get the number of threads
	 * @return int 
	 */
	public int getNumberOfThreads() {
		return numberOfThreads;
	}

	/**
	 * set the number of threads
	 * @param int 
	 */

	public void setNumberOfThreads(int numberOfThreads) {
		this.numberOfThreads = numberOfThreads;
	}


	/**
	 * get the algorithm for solution
	 * @return String
	 */
	public String getAlgorithemForSolution() {
		return algorithemForSolution;
	}
	/**
	 * set the algorithm for solution
	 * @return String
	 */

	public void setAlgorithemForSolution(String algorithemForSolution) {
		this.algorithemForSolution = algorithemForSolution;
	}
	/**
	 * set maze name
	 * @param String name
	 */
	public void setName(String name) {
		this.name = name;		
	}
	/**
	 * get maze name
	 * @return String name
	 */
	public String getName() { return this.name; }

}
