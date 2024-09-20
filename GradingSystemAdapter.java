public class GradingSystemAdapter implements SchoolManagementApp{

    private GradingSystem GRADINGSYSTEM;

    public GradingSystemAdapter(GradingSystem GRADINGSYSTEM){
        this.GRADINGSYSTEM = GRADINGSYSTEM;
    }


    @java.lang.Override
    public String integrateSystem() {
        return GRADINGSYSTEM.recordGrades();
    }
}