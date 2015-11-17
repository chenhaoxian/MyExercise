package oraclescript;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TsqlDatetypeToOracle {
	
	public static void main(String[] arg) throws IOException{
		String file = "res/OracleScript/data_load_task.txt";
		String outputFile = "res/OracleScript/output/output_{0}.txt";
		//String el = ".*[A-Z]{3}\\s[0-9]{1,2}\\s[0-9]{4}\\s[0-9]{1,2}:[0-9]{2}[AP]M.*";
		//String el = ".*[A-Z]{3}.*";
		//Oct  6 2015 11:30AM   (1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)
		//String el = ".*[A-Z]{3}\\s*\\d*\\s\\d*\\s*.*";
		String el = "[A-Z]{1}[a-z]{2}\\s*\\d*\\s\\d*\\s*(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(AM|PM)";
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		StringBuffer sb = new StringBuffer();
		Pattern p = Pattern.compile(el);
		int i = 1;
		while(null != line ){
			line = line.trim();
			//print(line);
			Matcher m = p.matcher(line);
			if(m.find()){
				print(i+"@@@@@@@@@"+m.group(1));
				i++;
			}
//			if(line.matches(el)){
//				print(i+"aaaaa");
//				i++;
//			}
//			while(line.matches(el)){
//				print(i+"aasa");
//				i++;
//			}

			line = br.readLine();	
		}
	}
	
	private static void print(String msg){
		System.out.println(msg);
	}

}
