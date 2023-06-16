public class Main {
    public static void main(String[] args) {
        Department Finance = new Department();
        Finance.ID = 1;
        Finance.name = "Finance";
        Finance.Budget= 5000000;
        Finance.No_ofEmployees = 50;
        Finance.Starting_year = 1996;
        Finance.Company_name = "GDHG";
        Finance.CEO = "MR.X";

        Department HR = new Department(2,"HR",5000000,50,
                1996,"GDHG","MR.X")
    }
}