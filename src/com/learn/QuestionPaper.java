package com.learn;

public class QuestionPaper {

	public void twoMarkQuestion(){
		System.out.println("TwoMarks");
	}
	public void fiveMarkQuestion(){
		System.out.println("FiveMarks");
	}
	public static void main(String[] args){
		QuestionPaper q = new QuestionPaper();
		q.twoMarkQuestion();
		q.fiveMarkQuestion();
		QuestionPaper q1 = new QuestionPaper();
		q1.twoMarkQuestion();
		q1.fiveMarkQuestion();
		QuestionPaper q2 = new QuestionPaper();
		q2.twoMarkQuestion();
		q2.fiveMarkQuestion();	
	}
}
