public class EmployeManagement {
    String name;
    int salary;
    void get(String s1,int s2)
    {
        name=s1;
        salary=s2;
    }
    void show()
    {
        System.out.println(name);
        System.out.println(salary);
    }
    public static void main(String[] args) {
        EmployeManagement e=new EmployeManagement();
        e.get("Ramu", 101);
        e.show();
    }
}
