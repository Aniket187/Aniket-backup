package demo1;

public class MyException extends Exception{
	private String Str;
	public MyException(String str) {
		this.Str=str;
		
	}
	@Override
	public String toString() {
		return "MyException [Str=" + Str + "]";
	}

}
