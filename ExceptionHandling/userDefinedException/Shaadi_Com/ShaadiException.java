package userDefinedException.Shaadi_Com;

public class ShaadiException extends Exception{
	private String msg;
	ShaadiException(String msg){
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}
}
