package com.cybage;



import javax.persistence.*;
import javax.persistence.Persistence;

import com.cybage.Student;

public class StudentImpl {
	
	static EntityTransaction et;
	static EntityManager entitymanager;
	  
	public static void main(String[] args) {
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaDemo");
 	System.out.println("Is opened connection :: "+ emf.createEntityManager().isOpen());
 	entitymanager= emf.createEntityManager();
        //insert(new Student(10,"John","Fifth"));
        //update(new Student(11,"Riya","Sixth"),new Student(11,"Shyam","Sixth"));
        delete(new Student(10,"John","Fifth"));
 	
  
        entitymanager.close( );
        emf.close( );
    }catch(Exception e){
    	System.out.println(e);
    }
	}

	static public void insert(Student s){
		et = entitymanager.getTransaction();
	     	et.begin();//Transaction Begin

	       
	                
	        entitymanager.persist( s );//save
	               et.commit( );

	}
	
static public void update(Student oldstud,Student newstud){
	et = entitymanager.getTransaction();	
	et.begin();
		Student s=entitymanager.find(Student.class,oldstud);
		s.setName(newstud.getName());
		entitymanager.persist(s);
		et.commit();
		
	
	}
static public void delete(Student s){
	et = entitymanager.getTransaction();
	et.begin();
	entitymanager.remove(s);
	et.commit();
}

}
