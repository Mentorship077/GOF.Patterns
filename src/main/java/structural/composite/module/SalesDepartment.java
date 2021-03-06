package structural.composite.module;

public class SalesDepartment implements Department {
    private Integer id;
    private String name;


    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public SalesDepartment() {
    }

    public Integer getId() {
        return id;
    }

    public SalesDepartment setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SalesDepartment setName(String name) {
        this.name = name;
        return this;
    }
}
