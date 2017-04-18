package dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.apache.commons.csv.CSVRecord;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.HibernateUtil;
import model.Record;



public class Dao {
	public Session currentSession=null;
	public Dao()
	{
		HibernateUtil.createSessionFactory();
		currentSession=HibernateUtil.getSessionFactory().openSession();
	}
	public void finalize()
	{
		currentSession.close();
	}
	public void save(ArrayList<Record> o)
	{
		Transaction t=currentSession.beginTransaction();
		for(Record r:o){
			currentSession.persist(r);
		}
		t.commit();
	}
	
}
