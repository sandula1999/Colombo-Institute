import java.io.Serializable;
import java.util.ArrayList;

public class Designation implements Serializable {
    private String designationName="empty";
    private ArrayList<Employee> employeesList=new ArrayList<>();//employees contains in the designations


    public Designation() {
    }

    public Designation(String designationName) {
        this.designationName = designationName;
    }

    public Designation(String designationName, ArrayList<Employee> employees) {
        this.designationName = designationName;
        this.employeesList = employees;
    }
    
    public String getDesignationName() {
        return designationName;
    }

    public void setDesignationName(String designationName) {
        this.designationName = designationName;
    }

    public void addEmployee(Employee employee){
        //method to add a employee for the designation
        employeesList.add(employee);
    }

    public ArrayList<Employee> getEmployees() {
        return employeesList;
    }
}
