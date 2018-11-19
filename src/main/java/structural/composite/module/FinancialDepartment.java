package structural.composite.module;

public class FinancialDepartment implements Department {

    private Integer id;
    private String name;


    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    public FinancialDepartment() {
    }

    public FinancialDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public FinancialDepartment setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public FinancialDepartment setName(String name) {
        this.name = name;
        return this;
    }
}
