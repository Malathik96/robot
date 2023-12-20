package org.newDay;

public class NewDay {//classname
	
	private void intro() {//method name -- type name then Ctrl+space
		System.out.println("your first day - 20th Sept");
		

	}
	
	
	private void javaintro() {//method name -- type name then Ctrl+space
		System.out.println("Sample Program");

	}
	
	
	public static void main(String[] args) {//main method  -- type main then Ctrl+space
		
		//ClassName objName= new ClassName();
		
		NewDay nd=new NewDay();
		
		nd.javaintro();
		nd.intro();
		//nd.intro();
		
			
	}

}
