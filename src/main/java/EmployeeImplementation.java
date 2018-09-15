import javax.swing.JOptionPane;
public class EmployeeImplementation {
   public static void main(String[] args) {
      Employee e1 = new Surgeon(250000.00);
      Employee e2 = new HairDresser();
      Employee e3 = new Actor();
      Employee e4 = new Tailor();
      
      JOptionPane.showMessageDialog(null, e1.cut());
      
      // Using an array of objects of Employees, different types of employees can be grouped together
      // using the same code since they all have a cut method. This is determined at RUNTIME!
      Employee[] roster = new Employee[4];
      roster[0] = new Surgeon();
      roster[1] = new HairDresser();
      roster[2] = new Actor();
      roster[3] = new Tailor();
      
      String output = "";
      for (int x = 0; x < roster.length; x++) {
         output += cutMessage(roster[x]) + "\n";
      }
      JOptionPane.showMessageDialog(null, output);
   }
   
   public static String cutMessage(Employee e) {
      return e.cut();
   }
}