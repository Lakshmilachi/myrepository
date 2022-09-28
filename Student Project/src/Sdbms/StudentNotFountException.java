package Sdbms;

public class StudentNotFountException extends RuntimeException{
	
	private String message;
	
	StudentNotFountException(String message){
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

}
