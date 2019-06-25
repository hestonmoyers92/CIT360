package Hibernate;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class manageMember {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      
      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      ManageMember ME = new ManageMember();

     
      Integer empID1 = ME.addMember("Kevin", "H", 1000);
      Integer empID2 = ME.addMember("David", "P", 5000);
      Integer empID3 = ME.addMember("Sean", "O", 10000);

      
      ME.listMembers();

     
      ME.updateMember(memID1, 5000);

     
      ME.deleteMember(memID2);

    
      ME.listMembers();
   }
   

   public Integer addMember(String fname, String lname, int salary){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer memberID = null;
      
      try {
         tx = session.beginTransaction();
         Member member = new Member(fname, lname, salary);
         memberID = (Integer) session.save(member); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return memberID;
   }
   

   public void listMembers( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List members = session.createQuery("FROM Member").list(); 
         for (Iterator iterator = members.iterator(); iterator.hasNext();){
            Member member = (Member) iterator.next(); 
            System.out.print("First Name: " + member.getFirstName()); 
            System.out.print("  Last Name: " + member.getLastName()); 
            System.out.println("  Salary: " + member.getMembershipType()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   public void updateMember(Integer MemberID, int salary ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Member member = (Member)session.get(Member.class, MemberID); 
         member.setSalary( salary );
		 session.update(member); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   
   public void deleteMember(Integer MemberID){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Member member = (Member)session.get(Member.class, MemberID); 
         session.delete(member); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
}