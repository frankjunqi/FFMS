package com.gem.ffms.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openflashchart.chart.Chart;
import org.openflashchart.component.ToolTip;
import org.openflashchart.component.X_Axis;
import org.openflashchart.component.Y_Axis;
import org.openflashchart.elements.Bar;
import org.openflashchart.elements.Line;

import com.gem.ffms.service.CountService;
public class GetCountDataServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		CountService cs = new CountService();
		
		String year1 = request.getParameter("year1");
		
		String year2 = request.getParameter("year2");
		
		List<Double> list1 = cs.getEveryMonthIncome("2011");
//		for(Integer i : list1){
//			System.out.println("-----  "+i);
//		}
		
		List<Double> list2 = cs.getEveryMonthIncome("2012");
		System.out.println(list1.size()+" - 0000----- "+list2.size());
//		for(Integer i : list2){
//			System.out.println("---++++++++--  "+i);
//		}
		System.out.println(year1+", "+year2);
		
		Chart chart = new Chart();
		X_Axis x_axis = new X_Axis();
		x_axis.setColour("#00EE00");

		Y_Axis y_axis = new Y_Axis();
		y_axis.setStroke(1);
		y_axis.setTick_length(20);
		y_axis.setGrid__colour("#00ff00");
		y_axis.setMax(100);
//		y_axis.setSteps(100);
		y_axis.setSteps(5);

		// ==========Bar=====================
		Bar bar = new Bar();
		bar.setBar_3d(true);
		bar.setAlpha(0.9);
		bar.setColour("#9933CC");
		bar.setFont__size(10);
		bar.setText("2012");
		bar.setValues(list1);
//		bar.set
		bar.setTip("2012 = #val#");

//		Bar bar2 = new Bar();
//		bar2.setBar_3d(true);
//		bar2.setAlpha(0.9);
//		bar2.setColour("#00AADD");
//		bar2.setFont__size(10);
//		bar2.setText("2011");
//		bar2.setValues(list2);
//		bar2.setTip("2011 = #val#");
		Line line = new Line("2011");
		line.setColour("#URELS");
		line.setDot__size(10);
		line.setFont__size(12);
		line.setWidth(4);
		line.setValues(list2);

		ToolTip toolTip = new ToolTip();
		toolTip.setShadow(false);
		toolTip.setStroke(5);
		toolTip.setBody("{font-size: 10px; font-weight: bold; color: #000000;}");
		toolTip.setBackground("#BDB396");
		toolTip.setTitle("{font-size: 14px; color: #CC2A43;}");
		
		chart.setBar(bar);
		chart.setLine(line);
		chart.setToolTip(toolTip);
		chart.setX_Axis(x_axis);
		chart.setY_Axis(y_axis);
		chart.setBg_colour("#EEEEEE");
		response.getWriter().write(chart.createChart());
		
		
	}
	
	
	
	
}

