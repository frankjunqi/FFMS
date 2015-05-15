package org.openflashchart.component;

import java.util.ArrayList;
import java.util.List;

import org.openflashchart.chart.BaseGraphProperty;

/**
 * @author zhuzhenhua
 * 
 * @time Aug 5, 200812:56:32 PM
 */
public abstract class BaseAxis extends BaseGraphProperty {

	/** the basic steps*/
	private Integer steps;

	/** the offset of Axis*/
	private Boolean offset;

	/** value is visible*/
	private Boolean visible;

	/** Axis's colour*/
	private String colour;

	/** parallel's colour*/
	private String grid__colour;

	/** the min scale*/
	private Integer min;

	/** the max scale*/
	private Integer max;

	/** the labels of Axis*/
	private Labels labels;

	/** the labels of Axis*/
	private List list_labels;

	/** 3D purpose*/
	private Integer ___3d;

	/**
	 * @return the ___3d
	 */
	public Integer get___3d() {
		return ___3d;
	}

	/**
	 * @param ___3d
	 *            the ___3d to set
	 */
	public void set___3d(Integer ___3d) {
		this.___3d = ___3d;
	}

	/**
	 * @return the offset
	 */
	public Boolean getOffset() {
		return offset;
	}

	/**
	 * @param offset
	 *            the offset to set
	 */
	public void setOffset(Boolean offset) {
		this.offset = offset;
	}

	/**
	 * @return the visible
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * @param visible
	 *            the visible to set
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	/**
	 * @return the list_labels
	 */
	public List getList_labels() {
		return list_labels;
	}

	/**
	 * @param list_labels
	 *            the list_labels to set
	 */
	public void setList_labels(List list_labels) {
		this.list_labels = list_labels;
	}

	/**
	 * set list_lables by array
	 * @param objArray labels's array
	 */
	@SuppressWarnings("unchecked")
	public void setList_labels(Object[] objArray) {
		if (null == this.list_labels) {
			this.list_labels = new ArrayList();
		}
		for (Object obj : objArray) {
			if (obj instanceof Object[]) {
				List objList = new ArrayList();
				this.objArrayToList((Object[]) obj, objList);
				this.list_labels.add(objList);
			} else {
				this.list_labels.add(obj);
			}
		}
	}

	/**
	 * change array to list
	 * @param objArray labels's array
	 * @param objList labels's list is changed by this method 
	 */
	@SuppressWarnings("unchecked")
	private void objArrayToList(Object[] objArray, List objList) {
		for (Object o : objArray) {
			if (o instanceof Object[]) {
				this.objArrayToList((Object[]) o, objList);
			} else {
				objList.add(o);
			}
		}
	}

	/**
	 * @return the labels
	 */
	public Labels getLabels() {
		return labels;
	}

	/**
	 * @param labels
	 *            the labels to set
	 */
	public void setLabels(Labels labels) {
		this.labels = labels;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour
	 *            the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * @return the grid_colour
	 */
	public String getGrid__colour() {
		return grid__colour;
	}

	/**
	 * @param grid_colour
	 *            the grid_colour to set
	 */
	public void setGrid__colour(String grid__colour) {
		this.grid__colour = grid__colour;
	}

	/**
	 * @return the max
	 */
	public Integer getMax() {
		return max;
	}

	/**
	 * @param max
	 *            the max to set
	 */
	public void setMax(Integer max) {
		this.max = max;
	}

	/**
	 * @return the min
	 */
	public Integer getMin() {
		return min;
	}

	/**
	 * @param min
	 *            the min to set
	 */
	public void setMin(Integer min) {
		this.min = min;
	}

	/**
	 * @return the steps
	 */
	public Integer getSteps() {
		return steps;
	}

	/**
	 * @param steps
	 *            the steps to set
	 */
	public void setSteps(Integer steps) {
		this.steps = steps;
	}
}
