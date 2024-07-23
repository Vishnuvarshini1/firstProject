package com.learn;

public class Authorization {
public static void main(String[] args) throws Sample1 {
	String access="user";
	if(access=="Admin") {
		System.out.println("you are welcome!");
	}else {
		try {
		throw new Sample1();
		}catch(Sample1 s) {
			s.printStackTrace();
		}
	}
	System.out.println("program ends here");
}

}
