package bo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import dao.Dao;
import model.Record;

public class BO {

	public static void main(String[] args) {
		
		Dao d= new Dao();
		BufferedReader in=null;
		try {
			in = new BufferedReader(new FileReader("C:\\Users\\saad1\\Downloads\\test_two-anon.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			in.readLine();
			in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Iterable<CSVRecord> records=null;
		try {
			records = CSVFormat.EXCEL.parse(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<Record> r=new ArrayList();
		int i=1;
		for(CSVRecord record: records)
		{
			Record c=new Record();
			try{
				
			c.setId(i);	
			c.setUserId(record.get(0));
			c.setScheme(record.get(2));
			c.setTimeTaken(record.get(3));
			c.setSState(record.get(4));
			c.setTC1(record.get(6));
			c.setTC1State(record.get(7));
			c.setTC2(record.get(9));
			c.setTC2State(record.get(10));
			c.setTC3(record.get(12));
			c.setTC3State(record.get(13));
			c.setTC4(record.get(15));
			c.setTC4State(record.get(16));
			c.setTC5(record.get(18));
			c.setTC5State(record.get(19));
			c.setTC6(record.get(21));
			c.setTC6State(record.get(22));
			c.setTC7(record.get(24));
			c.setTC7State(record.get(25));
			}catch(IndexOutOfBoundsException e)
			{
				
				c.setUserId(record.get(0));
			}
			i++;
			if(c.getTimeTaken() == null||c.getTimeTaken().equals("0"))
			{
				i--;
				continue;
			}
			r.add(c);
			
		
		
		}
				
			
	
		try{
		
		d.save(r);
	
		} finally
		{
			System.out.println("Hi");
			d.finalize();
		
		}
		
	}
}


