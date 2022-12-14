import java.io.Serializable;
import java.util.ArrayList;

public class Department implements Serializable {
    private static final long serialVersionUID = 1001L;//to save file
    private String departmentName;
    private ArrayList<Designation> designationsList=new ArrayList<>();//designations in the department
    
    public Department(String departmentName) {
        this.departmentName=departmentName;
    }
    
    //getter setter start
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public ArrayList<Designation> getDesignations() {
        return designationsList;
    }

    public void setDesignations(ArrayList<Designation> designations) {
        this.designationsList = designations;
    }
    //getters setters end

    public void addDesignation(Designation designation){
        //adding a designation for a department
        designationsList.add(designation);
    }
}
