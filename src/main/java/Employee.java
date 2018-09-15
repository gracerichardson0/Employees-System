public abstract class Employee {
   private double salary;
   
   public Employee() {
      this(0);
   }
   
   public Employee(double salary) {
      this.salary = salary;
   }
   
   public double getSalary() { return this.salary; };
   
   public boolean setSalary(double salary) {
      if (salary >= 0 && salary <= 1000000) {
         this.salary = salary;
         return true;
      }
      else {
         return false;
      }
   }
      
   public abstract String cut();
}

