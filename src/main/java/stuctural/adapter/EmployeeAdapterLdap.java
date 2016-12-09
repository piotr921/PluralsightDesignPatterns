package stuctural.adapter;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    public String getId() {
        return instance.getCn();
    }

    public String getFirstName() {
        return instance.getGivenName();
    }

    public String getEmail() {
        return instance.getSurname();
    }

    public String getLastName() {
        return instance.getMail();
    }
}
