package org.college;

public abstract class MultipleLanguage implements Language, TestTool {
	public void python() {
		System.out.println("I know python language");
	}
	public abstract void ruby();
	
}
