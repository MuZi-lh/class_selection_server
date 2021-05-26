package fun.muzi.class_selection.service;

import fun.muzi.class_selection.entity.Student;
import fun.muzi.class_selection.repository.StudentRepository;
import fun.muzi.class_selection.util.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Boolean check(String stud_id, String passwd){
        Student student = studentRepository.getById(stud_id);
        if (student == null) {
            return false;
        }
        return student.getPasswd().equals(Encryption.getSHA256(passwd));
    }

    public Object getClassList(String stud_id, Integer year, String semester){
        return studentRepository.getClassList(stud_id, year, semester);
    }

    public Object addTake(String stud_id, String cour_id, String curr_id, Integer year, String semester) {
        return studentRepository.addTake(stud_id, cour_id, curr_id, year, semester);
    }

    public Object dropTake(String stud_id, String cour_id, String curr_id, Integer year, String semester) {
        return studentRepository.dropTake(stud_id, cour_id, curr_id, year, semester);
    }

    public Object changePasswd(String stud_id, String old_passwd, String new_passwd){
        if (!check(stud_id,old_passwd)){
            return "FAILURE: old password is fault!";
        }else{
            Student student = studentRepository.getById(stud_id);
            student.setPasswd(Encryption.getSHA256(new_passwd));
            return studentRepository.update(student);
        }
    }
}
