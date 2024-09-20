public class AttendanceSystemAdapter implements SchoolManagementApp {

    private AttendanceSystem ATTENDANCESYSTEM;

    public AttendanceSystemAdapter(AttendanceSystem ATTENDANCESYSTEM) {
        this.ATTENDANCESYSTEM = ATTENDANCESYSTEM;
    }

    @java.lang.Override
    public String integrateSystem() {
        return ATTENDANCESYSTEM.markAttendance();
    }

}
