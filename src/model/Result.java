package model;

public class Result {

	
	Settings settings;
	double correlationCoefficient;
	double meanAbsoluteError;
	double rootMeanSquaredError;
	double relativeAbsoluteError;
	double rootRelativeSquaredError;
	double instances;
	
	
	public Result(Settings settings, double correlationCoefficient, double meanAbsoluteError,
			double rootMeanSquaredError, double relativeAbsoluteError, double rootRelativeSquaredError,
			double instances) {
		super();
		this.settings = settings;
		this.correlationCoefficient = correlationCoefficient;
		this.meanAbsoluteError = meanAbsoluteError;
		this.rootMeanSquaredError = rootMeanSquaredError;
		this.relativeAbsoluteError = relativeAbsoluteError;
		this.rootRelativeSquaredError = rootRelativeSquaredError;
		this.instances = instances;
	}


	public Settings getSettings() {
		return settings;
	}


	public void setSettings(Settings settings) {
		this.settings = settings;
	}


	public double getCorrelationCoefficient() {
		return correlationCoefficient;
	}


	public void setCorrelationCoefficient(double correlationCoefficient) {
		this.correlationCoefficient = correlationCoefficient;
	}


	public double getMeanAbsoluteError() {
		return meanAbsoluteError;
	}


	public void setMeanAbsoluteError(double meanAbsoluteError) {
		this.meanAbsoluteError = meanAbsoluteError;
	}


	public double getRootMeanSquaredError() {
		return rootMeanSquaredError;
	}


	public void setRootMeanSquaredError(double rootMeanSquaredError) {
		this.rootMeanSquaredError = rootMeanSquaredError;
	}


	public double getRelativeAbsoluteError() {
		return relativeAbsoluteError;
	}


	public void setRelativeAbsoluteError(double relativeAbsoluteError) {
		this.relativeAbsoluteError = relativeAbsoluteError;
	}


	public double getRootRelativeSquaredError() {
		return rootRelativeSquaredError;
	}


	public void setRootRelativeSquaredError(double rootRelativeSquaredError) {
		this.rootRelativeSquaredError = rootRelativeSquaredError;
	}


	public double getInstances() {
		return instances;
	}


	public void setInstances(double instances) {
		this.instances = instances;
	}
	
	@Override
	public String toString() {


		//TODO Fix toString so it outputs in the format I want	
		//TODO output appropriate d.p.
		return "CorrelationCoefficient=\t\t" 
		+ correlationCoefficient
		+ ", \nmeanAbsoluteError=\t\t" 
		+ meanAbsoluteError
		+ ", \nrootMeanSquredError=\t\t" 
		+ rootMeanSquaredError 
		+ ", \nrelativeAbsoluteError=\t\t" 
		+ relativeAbsoluteError
		+ ", \nrootRelativeSquredError=\t\t" 
		+ rootRelativeSquaredError
		+ ", \ninstances=\t\t" 
		+ instances; 


	}
	
	
	
	
	
	
	
	
	
	
	
	
}
