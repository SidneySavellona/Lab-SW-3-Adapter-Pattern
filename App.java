
public class App {
    public static void main(String[] args) {

        AttendanceSystem ATTENDANCESYSTEM = new AttendanceSystem();
        SchoolManagementApp AS = new AttendanceSystemAdapter(ATTENDANCESYSTEM);

        GradingSystem GRADINGSYSTEM = new GradingSystem();
        SchoolManagementApp GS = new GradingSystemAdapter(GRADINGSYSTEM);

        LibrarySystem LIBRARYSYSTEM = new LibrarySystem();
        SchoolManagementApp LS = new LibrarySystemAdapter(LIBRARYSYSTEM);

        System.out.println(AS.integrateSystem());

        System.out.println(GS.integrateSystem());

        System.out.println(LS.integrateSystem());

    }
}