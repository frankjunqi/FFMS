package org.openflashchart.elements;

/**
 * The base class of each of Lines
 * @author zhuzhenhua
 * 
 * @time Aug 1, 20084:50:43 PM
 */
public abstract class BaseLine extends Element {

	private Integer width;

	private Integer dot__size;

	/**
	 * @return the dot__size
	 */
	public Integer getDot__size() {
		return dot__size;
	}

	/**
	 * @param dot__size the dot__size to set
	 */
	public void setDot__size(Integer dot__size) {
		this.dot__size = dot__size;
	}

	/**
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}
}
