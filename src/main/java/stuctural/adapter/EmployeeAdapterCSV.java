package stuctural.adapter;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    public String getId() {
        return instance.getId() + "";
    }

    public String getFirstName() {
        return instance.getFirstName();
    }

    public String getEmail() {
        return instance.getLastName();
    }

    public String getLastName() {
        return instance.getEmailAddress();
    }
}
