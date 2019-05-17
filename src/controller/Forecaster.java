package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.ChartSettings;
import model.Result;
import model.Settings;
import weka.classifiers.Classifier;
import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.evaluation.NumericPrediction;
import weka.classifiers.timeseries.WekaForecaster;
import weka.core.Instances;

public class Forecaster {

	public void main(File arffFile, String fieldsToForecast, int classIndex, int iterations, int numberOfPredictions, Settings settings ) {
		try {
			Instances data = getInstances(arffFile.getName(), classIndex);
			ArrayList<Result> meanResults = new ArrayList<Result>();
			
			for(int i = 1; i <= iterations; i++) {
			
			
				
		ArrayList<Result> foldResults =	crossValidation(data, settings, classifier );	
				
		List<List<NumericPrediction>> forecast = generateForecast(fieldsToForecast, classifier);
				
			}
				
			
			
			
			
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
		
	}

	
	
	
	
	
	private ArrayList<Result> crossValidation(Instances data, Settings settings, Classifier classifier) {

		try {
			ArrayList<Result> foldResults = new ArrayList<Result>();

			Random generator = new Random(System.currentTimeMillis());
			Instances randData = new Instances(data);
			Instances train, test;

			randData.randomize(generator);

			int folds = randData.size();
			Evaluation eval = new Evaluation(randData);

			for (int n = 0; n < folds; n++) {
				train = randData.trainCV(folds, n, generator);
				test = randData.testCV(folds, n);

				classifier.buildClassifier(train);
				eval.evaluateModel(classifier, test);

				Result result = new Result(settings, eval.correlationCoefficient(), eval.meanAbsoluteError(),
						eval.rootMeanSquaredError(), eval.relativeAbsoluteError(), eval.rootRelativeSquaredError(),
						eval.numInstances());

				System.out.println(eval.toSummaryString("=== " + folds + "-fold Cross-validation ===", false));

				foldResults.add(result);

			}

			return foldResults;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
		

	}
	
	private List<List<NumericPrediction>> generateForecast(String fieldsToForecast, Classifier classifier, Instances train, int numberOfPredictions) {
		
		
		try {
			
		WekaForecaster forecaster = new WekaForecaster();
		forecaster.setFieldsToForecast(fieldsToForecast);
		forecaster.setBaseForecaster(classifier);
		forecaster.buildForecaster(train, System.out);
		forecaster.primeForecaster(train);
		
		List<List<NumericPrediction>> forecast = forecaster.forecast(numberOfPredictions, System.out);

		for (int j = 0; j < numberOfPredictions; j++) {

			List<NumericPrediction> predsAtStep = forecast.get(j);
			NumericPrediction predForTarget = predsAtStep.get(0);

			System.out.println("" + predForTarget.predicted() + " ");
		}
		
		return forecast;
		
		}catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
		
		private void outputResults(String fieldsToForecast ) {
			
			ChartSettings chartSettings = new ChartSettings("Forecast", fieldsToForecast, "Iteration", "");
			//Change this so its more generic
		//	model.outputMLPResults(chartSettings, null, meanResults);
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


