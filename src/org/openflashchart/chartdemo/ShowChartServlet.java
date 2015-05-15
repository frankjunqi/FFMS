package org.openflashchart.chartdemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openflashchart.chart.Chart;
import org.openflashchart.component.Labels;
import org.openflashchart.component.Title;
import org.openflashchart.component.ToolTip;
import org.openflashchart.component.X_Axis;
import org.openflashchart.component.Y_Axis;
import org.openflashchart.elements.Area_Hollow;
import org.openflashchart.elements.Bar;
import org.openflashchart.elements.Bar_3d;
import org.openflashchart.elements.Bar_Fade;
import org.openflashchart.elements.Bar_Glass;
import org.openflashchart.elements.Bar_Sketch;
import org.openflashchart.elements.Bar_Stack;
import org.openflashchart.elements.Filled_Bar;
import org.openflashchart.elements.HBar;
import org.openflashchart.elements.Line;
import org.openflashchart.elements.Line_Dot;
import org.openflashchart.elements.Line_Hollow;
import org.openflashchart.elements.Pie;
import org.openflashchart.elements.Scatter;


/**
 * 
 * @author fanhaibo
 *
 * @time Aug 8, 20089:08:03 AM
 */		
@SuppressWarnings("unchecked")
public class ShowChartServlet extends HttpServlet {

	private static final long serialVersionUID = 8953556519136570651L;

	

	private static final String BAR = "bar";

	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String graphType = request.getParameter("graphType");
		if (null != graphType) {
			
			if (BAR.equalsIgnoreCase(graphType)) {
				showBar(request, response);
			} 
		
		}
	}

	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}





	private void showBar(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		Chart chart = new Chart();
		X_Axis x_axis = new X_Axis();
		x_axis.setColour("#00EE00");

		Y_Axis y_axis = new Y_Axis();
		y_axis.setMax(15);

		// ==========Bar=====================
		Bar bar = new Bar();
		bar.setBar_3d(true);
		bar.setAlpha(0.9);
		bar.setColour("#9933CC");
		bar.setFont__size(10);
		bar.setText("My name is bar");
		bar.setValues(new Object[] { 7, 9, 6, 11, null, 4 });
		bar.setTip("Bar 1<br> val = #val#");

		Bar bar2 = new Bar();
		bar2.setBar_3d(true);
		bar2.setAlpha(0.9);
		bar2.setColour("#00AADD");
		bar2.setFont__size(10);
		bar2.setText("My name is bar");
		bar2.setValues(new Object[] { 7, 9, 6, 11, 5, 4 });
		bar2.setTip("Bar 2 val = #val#");

		ToolTip toolTip = new ToolTip();
		toolTip.setShadow(false);
		toolTip.setStroke(5);
		toolTip
				.setBody("{font-size: 10px; font-weight: bold; color: #000000;}");
		toolTip.setBackground("#BDB396");
		toolTip.setTitle("{font-size: 14px; color: #CC2A43;}");
		
		chart.setBar(bar);
		chart.setBar(bar2);
		chart.setToolTip(toolTip);
		chart.setX_Axis(x_axis);
		chart.setY_Axis(y_axis);
		chart.setBg_colour("#EEEEEE");
		response.getWriter().write(chart.createChart());
	}



}
