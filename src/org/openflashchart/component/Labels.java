package org.openflashchart.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuzhenhua
 * 
 * @time Jul 29, 20089:08:43 AM
 */
public class Labels {

	private Boolean visible;

	private Integer steps = null;

	private String rotate = null;

	private Integer size = null;

	private List labels = null;

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
	 * @return the labels
	 */
	public List getLabels() {
		return labels;
	}

	/**
	 * @param labels
	 *            the labels to set
	 */
	public void setLabels(List labels) {
		this.labels = labels;
	}

	@SuppressWarnings("unchecked")
	public void setLabels(Object[] objArray) {
		if (null == this.labels) {
			this.labels = new ArrayList();
		}
		for (Object obj : objArray) {
			if (obj instanceof Object[]) {
				List objList = new ArrayList();
				this.objArrayToList((Object[]) obj, objList);
				this.labels.add(objList);
			} else {
				this.labels.add(obj);
			}

		}

	}

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
	 * @return the rotate
	 */
	public String getRotate() {
		return rotate;
	}

	/**
	 * @param rotate
	 *            the rotate to set
	 */
	public void setRotate(String rotate) {
		this.rotate = rotate;
	}

	/**
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(Integer size) {
		this.size = size;
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
