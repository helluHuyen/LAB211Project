package Repository;

import DataAccess.StudentDao;
import Model.Student;
import java.util.List;

public class StudentRes extends IStudentRes {

    public StudentRes() {
    }

    @Override
    public void addStudent(List<Student> stdList) {
        StudentDao.Instance().addStudent(stdList);
    }

    @Override
    public void showAll(List<Student> stdList) {
        StudentDao.Instance().showAll(stdList);
    }

}
