package Hibernate;

public class Member {
   private int id;
   private String firstName; 
   private String lastName;   
   private int membershipType;  

   public Member() {}
   public Member(String fname, String lname, int salary) {
      this.firstName = fname;
      this.lastName = lname;
      this.membershipType = mtype;
   }
   
   public int getId() {
      return id;
   }
   
   public void setId( int id ) {
      this.id = id;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public void setFirstName( String first_name ) {
      this.firstName = first_name;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public void setLastName( String last_name ) {
      this.lastName = last_name;
   }
   
   public int getSalary() {
      return membershipType;
   }
   
   public void setSalary( int salary ) {
      this.membershipType = membershipType;
   }
}