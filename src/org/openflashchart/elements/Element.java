package org.openflashchart.elements;

import java.util.ArrayList;
import java.util.List;

import org.openflashchart.json.JsonHelper;

/**
 * The base class of graphic's component 
 * @author zhuzhenhua
 * 
 * @time Jul 29, 20081:17:22 PM
 */
@SuppressWarnings("unused")
public abstract class Element {

	/** the component's type*/
	protected String type;

	/** the component's values*/
	private List values;

	/** the component's text*/
	protected String text;

	/** the component's tip*/
	private String tip;

	/** the component's colour*/
	private String colour;

	/** the font's size of component*/
	private Integer font__size;

	/**
	 * @param colour
	 *            the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * @param font__size
	 *            the font__size to set
	 */
	public void setFont__size(Integer font__size) {
		this.font__size = font__size;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @param tip
	 *            the tip to set
	 */
	public void setTip(String tip) {
		this.tip = tip;
	}

	/**
	 * @param values
	 *            the values to set
	 */
	public void setValues(List values) {
		this.values = values;
	}

	/**
	 * set list_lables by array
	 * @param objArray labels's array
	 */
	@SuppressWarnings("unchecked")
	public void setValues(Object[] objArray) {
		if (null == this.values) {
			this.values = new ArrayList();
		}
		for (Object obj : objArray) {
			if (obj instanceof Object[]) {
				List objList = new ArrayList();
				this.objArrayToList((Object[]) obj, objList);
				this.values.add(objList);
			} else {
				this.values.add(obj);
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

	public String toString() {
		return JsonHelper.getJsonString(this);
	}

}
