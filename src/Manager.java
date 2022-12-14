import java.io.*;
import java.util.ArrayList;

public class Manager extends Manage{
    public static ArrayList<Department> departmentList=new ArrayList<>();//department list
    public static ArrayList<User> userList=new ArrayList<>();//users list

    
    @Override
    public boolean addDepartment(String departmentName){
        //method to add department to the list
        for (Department department:departmentList) {
            if(department.getDepartmentName().equals(departmentName)){
                return false;//the department already in
            }
        }
        Department department=new Department(departmentName);
        departmentList.add(department);
        return true;//successfully added department
    }

    @Override
    public void addDesignation(String departmentName,String designationName){
        //method to add a designation to the department
        for (Department department:departmentList) {
            if(department.getDepartmentName().equals(departmentName)){
               Designation designation=new Designation(designationName);
               department.addDesignation(designation);
            }
        }
    }

    @Override
    public void addEmployee(String departmentName,String designationName,String name,int epfNum){
        //method to add employee for a designation
        for (Department department:departmentList) {
            if(department.getDepartmentName().equals(departmentName)){
                for(Designation designation:department.getDesignations()){
                    if (designation.getDesignationName().equals(designationName)){
                        Employee employee=new Employee(name,epfNum);
                        designation.addEmployee(employee);
                    }
                }
            }
        }
    }

    public static void saveDepartments(){
        //method to save data in the file
        File file = new File("Departments.txt");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(departmentList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }

    public static void loadDepartments() {
        //method to load data from the file
        try {
            FileInputStream fileInputStream = new FileInputStream("Departments.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            departmentList = (ArrayList<Department>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }  catch (IOException | ClassNotFoundException e) {
            System.out.println("Error!");
        }
    }

    public static Boolean departmentIsIn(String name){
        //method to check the department is in the list 
        for (Department department:departmentList) {
            if(department.getDepartmentName().equals(name)){
                return true;
            }
        }
        return false;
    }
    public static Boolean designationIsIn(String departmentName,String designationName){
        //method to check the designation is in the given department
        for (Department department:Manager.departmentList) {
            if(department.getDepartmentName().equals(departmentName)){
                for (Designation designation:department.getDesignations()) {
                    if(designation.getDesignationName().equals(designationName)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void saveUsers(){
        //method to save dataof users to the file
        File file = new File("Users.txt");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(userList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static void loadUsers() {
        //load user data from the file
        try {
            FileInputStream fileInputStream = new FileInputStream("Users.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            userList = (ArrayList<User>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error!");
        }
    }
}
