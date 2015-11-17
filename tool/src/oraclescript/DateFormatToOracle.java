package oraclescript;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormatToOracle {
	
	private static void print(String msg){
		System.out.println(msg);
	}
	
	
	public static void main(String[] arg){
		try {  
			String file = "res/OracleScript/data_load_task.txt";
			String outputFile = "res/OracleScript/output/output_data_load_task.txt";
			String el = "[\'][A-Z]{1}[a-z]{2}\\s*\\d*\\s\\d*\\s*(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(AM|PM)[\']";
			String el2 = "[\']\\d*-\\d*-\\d*[\']";
			
			BufferedReader bufReader = new BufferedReader(new FileReader(file));
            StringBuffer strBuf = new StringBuffer(); 
            
            Pattern p = Pattern.compile(el);
            Pattern pp = Pattern.compile(el2);
            int i = 1;
            for (String line = null; (line = bufReader.readLine()) != null; line = null) {
            	
            	//date farmat 1 MM DD YYYY HH:MI(AM|PM)
            	Matcher m = p.matcher(line);
            	if(m.find()){
            		print("第"+ i++ +"条：");
//            		while(m.find()){
//            			print(m.group(0));
//            			if(m.group(0).contains("AM")){
//            				line = line.replaceAll(el, "to_date('"+m.group(0)+"','mm dd yyyy hh:miAM')"); 
//            			}else{
//            				line = line.replaceAll(el, "to_date('"+m.group(0)+"','mm dd yyyy hh:miPM')"); 
//            			}
//            			line = line.replaceAll(el, "to_date('"+m.group(0)+"','mm dd yyyy hh:miAM')"); 
//            		}
            		if(m.group(0).contains("AM")){
            			line = line.replaceAll(el, "to_date("+m.group(0)+",'mm dd yyyy hh:miAM')"); 
            		}else{
            			line = line.replaceAll(el, "to_date("+m.group(0)+",'mm dd yyyy hh:miPM')"); 
            		}
            		
            		 
            	}
//            	
            	//date farmat 2 YYYY-MM-DD
            	Matcher mm = pp.matcher(line);
            	if(mm.find()){
            		line = line.replaceAll(el2, "to_date("+mm.group(0)+",'yyyy-mm-dd')"); 
            		//print("当前行："+line);
            	}
            	
            	
            	line = line.replaceAll("\\[", "");
            	line = line.replaceAll("]", "");
            	print("当前行："+line);
            	strBuf.append(line+";"+"\n"); 
                
            }  
            bufReader.close();  
  
            PrintWriter printWriter = new PrintWriter(outputFile);  
            printWriter.write(strBuf.toString().toCharArray());  
            printWriter.flush();  
            printWriter.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }

	}
	

}
