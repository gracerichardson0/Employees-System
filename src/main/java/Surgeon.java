public class Surgeon extends Employee {
   public Surgeon() {
      this(0);
   }

   public Surgeon(double salary) {
      super(salary);
   }

   public String cut() {
      return "I'm a surgeon. When I cut, I start the operation!";
   }
}

