package com.quiz.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
	Scanner scan = new Scanner(System.in);
	static int marks=0;
	int wrongAnsCount=0;
	public void log() {
		Questions q1=new Questions("Which statement is true about Java?",
				"A. Java is a sequence-dependent programming language ",
				"B. Java is a code dependent programming language ",
				"C. Java is a platform-dependent programming language ", 
				"D. Java is a platform-independent programming language ");

        Questions q2 = new Questions("What is the extension of java code files?",
        		" A. .txt","B. .pdf","C. .sql","D. .java");
        Questions q3 = new Questions("Who invented Java Programming? ",
        		"A. Guido van Rossum","B. James Gosling","C. Dennis Ritchie","D. Bjarne Stroustrup");
        Questions q4 = new Questions("Which one of the following is not a Java feature?",
        		"A. Object-oriented","B. Use of pointers","C. Portable", "D. Dynamic and Extensible");
        Questions q5 = new Questions("Which of these cannot be used for a variable name in Java?",
        		"A. identifier & keyword","B. identifier", "C. Keyword", "D. none of the mentioned");
        Questions q6= new Questions("Which component is used to compile,debug and execute the java programs?",
        		"A.JRE","B.JIT",	"C.JDK",	"D.JVM" );
        Questions q7= new Questions("Which of the following is a reserved keyword in java?",
        		"A.object",	"B.strictfp","C.main",	"D.system");
        Questions q8= new Questions("An interface with no fields or methods is known as a...?",
        		"A.Runnable interface",	"B.Marker interface","C.Abstract interface","D.CharSequence interface");
        Questions q9= new Questions("Which of the following is not an OOPS concept in Java?",
        		"A.Polymorphism","B.Inheritance","C.Compilation","D.Encapsulation");
        Questions q10= new Questions("Which exception is thrown when java is out of memory?",
        		"A.MemoryError","B.OutOfMemoryError","C.MemoryOutOfBoundsException","D)MemoryFullException");
        
        
        HashMap<Questions,Character> hm =new HashMap<Questions,Character>();
        hm.put(q1,'D');
        hm.put(q2,'D');
        hm.put(q3, 'B');
        hm.put(q4, 'B');
        hm.put(q5, 'C');
        hm.put(q6, 'C');
        hm.put(q7, 'B');
        hm.put(q8, 'B');
        hm.put(q9, 'C');
        hm.put(q10, 'B');
        
        for(Map.Entry<Questions, Character> map:hm.entrySet()) {
        	System.out.println(map.getKey().getQuestion());
        	System.out.println(map.getKey().getOption1());
        	System.out.println(map.getKey().getOption2());
        	System.out.println(map.getKey().getOption3());
        	System.out.println(map.getKey().getOption4());
        	
        	System.out.println("Enter your answer");
        	Character ans=scan.next().charAt(0);
        	int cans=Character.compare(ans, map.getValue());
        	if(cans==0) {
        		System.out.println("correct");
        		marks++;
        	}else {
        		System.out.println("Wrong");
        		wrongAnsCount++;
        	
        	}
        	
        }
        System.out.println("******Result******");
        System.out.println("Total Question ="+hm.size());
        System.out.println("Correct Answer Question= "+marks);
        if(marks>8-10) {
        	System.out.println("Grade : Class A");
        }else if (marks<6-8) {
        	System.out.println("Grade : Class B");
        }else if(marks<5) {
        	System.out.println("Grade : Class C");
        	
        }else {
        	System.out.println("Fail");
        }
		
	}
	


}
