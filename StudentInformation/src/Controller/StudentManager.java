package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.Student;
import Repository.IStudentRes;
import Repository.StudentRes;
import View.Menu;

public class StudentManager extends Menu<String> {

    private List<Student> stdList;
    private IStudentRes mn;
    private static String[] mc = {"Add student", "Show All", "Exit"};

    public StudentManager() {
        super("Collection Sort Program", mc);
        stdList = new ArrayList<>();
        mn = new StudentRes();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                mn.addStudent(stdList);
                break;
            case 2:
                mn.showAll(stdList);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
