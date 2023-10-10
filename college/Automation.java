package org.college;

public class Automation extends MultipleLanguage {

	
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("I know java");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("I know selenium");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("I do not know ruby");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation language= new Automation();
		language.java();
		language.python();
		language.ruby();
		language.Selenium();
	}

}
