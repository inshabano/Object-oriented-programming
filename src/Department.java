public class Department {
    int ID;
    String name;
    int Budget;
    int No_ofEmployees;
    int Starting_year;
    String Company_name;
    String CEO;

    //no argument constructor
    public Department(){

    }

    public Department(int Did,String Dname, int Dbudget,int DNo_ofEmployees,
                      int DStarting_year,String DcompanyName, String Dceo){
        ID = Did ;
        name = Dname;
        Budget = Dbudget;
        No_ofEmployees = DNo_ofEmployees;
        Starting_year = DStarting_year;
        Company_name = DcompanyName;
        CEO = Dceo;
    }
}
