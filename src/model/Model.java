package model;

import java.util.ArrayList;

import view.ChartView;

public class Model {
	
	
	
	public void outputMLPResults(ChartSettings chartSettings, Settings settings, ArrayList<Result> results) {

		ChartView window = new ChartView(chartSettings.getTitle(), chartSettings.getSubTitle(),
				chartSettings.getxAxisTitle(), chartSettings.getyAxisTitle(), results);
		ChartView.initialize(window);

	}
	
	public void outputRegressionResults(ChartSettings chartSettings, Settings settings,
			ArrayList<Result> results) {
		ChartView window = new ChartView(chartSettings.getTitle(), chartSettings.getSubTitle(),
				chartSettings.getxAxisTitle(), chartSettings.getyAxisTitle(), results);
		ChartView.initialize(window);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
