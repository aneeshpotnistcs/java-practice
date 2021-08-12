package com.tcs.map.demo;

public class Student {

	private float mathScore;
	private float biologyScore;
	private float physicsScore;
	
	
	public Student(float mathScore, float biologyScore, float physicsScore) {
		super();
		this.mathScore = mathScore;
		this.biologyScore = biologyScore;
		this.physicsScore = physicsScore;
	}
	public float getMathScore() {
		return mathScore;
	}
	public void setMathScore(float mathScore) {
		this.mathScore = mathScore;
	}
	public float getBiologyScore() {
		return biologyScore;
	}
	public void setBiologyScore(float biologyScore) {
		this.biologyScore = biologyScore;
	}
	public float getPhysicsScore() {
		return physicsScore;
	}
	public void setPhysicsScore(float physicsScore) {
		this.physicsScore = physicsScore;
	}
	@Override
	public String toString() {
		return "Student [mathScore=" + mathScore + ", biologyScore=" + biologyScore + ", physicsScore=" + physicsScore
				+ "]";
	}
	
	
}
