package model;

public class Settings {

	double ridge;
	int decimalPlaces;
	int attributeSelectionMethod;
	
	String structure;
	double iterations;
	double learningRate;
	double momentum;
	double seed;
	double validationThreshold;
	double validationSize;
	
	
	public Settings(double ridge, int decimalPlaces, int attributeSelectionMethod) {
		super();
		this.ridge = ridge;
		this.decimalPlaces = decimalPlaces;
		this.attributeSelectionMethod = attributeSelectionMethod;
	}


	public Settings(String structure, double iterations, double learningRate, double momentum, double seed,
			double validationThreshold, double validationSize) {
		super();
		this.structure = structure;
		this.iterations = iterations;
		this.learningRate = learningRate;
		this.momentum = momentum;
		this.seed = seed;
		this.validationThreshold = validationThreshold;
		this.validationSize = validationSize;
	}


	public double getRidge() {
		return ridge;
	}


	public void setRidge(double ridge) {
		this.ridge = ridge;
	}


	public int getDecimalPlaces() {
		return decimalPlaces;
	}


	public void setDecimalPlaces(int decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
	}


	public int getAttributeSelectionMethod() {
		return attributeSelectionMethod;
	}


	public void setAttributeSelectionMethod(int attributeSelectionMethod) {
		this.attributeSelectionMethod = attributeSelectionMethod;
	}


	public String getStructure() {
		return structure;
	}


	public void setStructure(String structure) {
		this.structure = structure;
	}


	public double getIterations() {
		return iterations;
	}


	public void setIterations(double iterations) {
		this.iterations = iterations;
	}


	public double getLearningRate() {
		return learningRate;
	}


	public void setLearningRate(double learningRate) {
		this.learningRate = learningRate;
	}


	public double getMomentum() {
		return momentum;
	}


	public void setMomentum(double momentum) {
		this.momentum = momentum;
	}


	public double getSeed() {
		return seed;
	}


	public void setSeed(double seed) {
		this.seed = seed;
	}


	public double getValidationThreshold() {
		return validationThreshold;
	}


	public void setValidationThreshold(double validationThreshold) {
		this.validationThreshold = validationThreshold;
	}


	public double getValidationSize() {
		return validationSize;
	}


	public void setValidationSize(double validationSize) {
		this.validationSize = validationSize;
	}
	
	
	
	
	
	
	
	
	
}
