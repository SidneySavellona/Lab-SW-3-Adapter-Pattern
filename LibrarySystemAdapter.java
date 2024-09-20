public class LibrarySystemAdapter implements SchoolManagementApp{

    private LibrarySystem LIBRARYSYSTEM;

    public LibrarySystemAdapter(LibrarySystem LIBRARYSYSTEM){
        this.LIBRARYSYSTEM =LIBRARYSYSTEM;
    }


    @java.lang.Override
    public String integrateSystem() {
        return LIBRARYSYSTEM.manageBooks();
    }
}