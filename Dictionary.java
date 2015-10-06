import java.io.*;
import java.lang.*;
import java.util.*;

class Dictionary{

	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		if(input.length()<2 || input.length()>6){
			System.out.println("invalid input string length b/w 2 and 6 and contains only alphabet");
		}else{
			allSubstrings(input);
		}
	}

	private static void allSubstrings(String input){
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i =0;i<input.length();i++){
			for(int j=i;j<=input.length();j++){
				if(!input.substring(i,j).equals("") && !arr.contains(input.substring(i,j)))
					arr.add(input.substring(i,j));
			}
		}

		Collections.sort(arr);

		for(String temp :arr){
			System.out.println(temp);
		}
	}
}
