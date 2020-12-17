package demo1;

public class occurance {
	public void occurance1(String name){
		
		while(name.length()>0){
			char ch=name.charAt(0);
			System.out.println(ch+" "+countval(ch,name));
			name=name.replace(""+ch,"");
		}
			
	}
	public static int countval(char ch,String name){
		int count =0;
	char[] ch1=name.toCharArray();
		for(int j=0;j<name.length();j++){
			if(ch==ch1[j]){
				count++;	
			}
		}
		return count;
	}

}
