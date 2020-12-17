package demo1;

import java.util.HashMap;
import java.util.Map;

public class Trial {
	public void Occurance(String name){
		Map<Character, Integer> cad= new HashMap<Character,Integer>();
		//name.toLowerCase();
		name=name.replace(" ", "").toLowerCase();
	
		char[]ch=name.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			if(cad.containsKey(ch[i])){
				cad.put(ch[i],cad.get(ch[i])+1);
				
			}
			else{
				cad.put(ch[i], 1);
		
			}
		}
		
		for(Map.Entry<Character, Integer> c1 :cad.entrySet()){
			if(c1.getValue()>1){
			System.out.println("Character "+c1.getKey()+" is repeated  "+c1.getValue()+" times");
			}
		}
		
		
	}

}
