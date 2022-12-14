import java.io.Serializable;

public class Employee implements Serializable {
    private String name="empty";
    private int epfNum=0;

    public Employee() {
    }

    public Employee(String name, int epfNum) {
        this.name = name;
        this.epfNum = epfNum;
    }
    //start getter setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpfNum() {
        return epfNum;
    }

    public void setEpfNum(int epfNum) {
        this.epfNum = epfNum;
    }
    //end getter setters
}
