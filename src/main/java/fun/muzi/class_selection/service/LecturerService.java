package fun.muzi.class_selection.service;

import fun.muzi.class_selection.entity.Lecturer;
import fun.muzi.class_selection.repository.LecturerRepository;
import fun.muzi.class_selection.util.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LecturerService {
    @Autowired
    private LecturerRepository lecturerRepository;

    public Boolean check(String lect_id, String passwd){
        Lecturer lecturer = lecturerRepository.getById(lect_id);
        if (lecturer == null) {
            return false;
        }
        return lecturer.getPasswd().equals(Encryption.getSHA256(passwd));
    }

    public Object getClassList(String lect_id, Integer year, String semester){
        return lecturerRepository.getClassList(lect_id, year, semester);
    }

    public Object getById(String lect_id) {
        Lecturer lecturer = lecturerRepository.getById(lect_id);
        lecturer.setPasswd("就不告诉你");
        return lecturer;
    }

    public Object getStudentList(String cour_id, String curr_id,
                                 Integer year, String semester) {
        return lecturerRepository.getStudentList(cour_id, curr_id, year, semester);
    }

    public Object changePasswd(String lect_id, String old_passwd, String new_passwd){
        if (!check(lect_id,old_passwd)){
            return "FAILURE: old password is fault!";
        }else{
            String p = Encryption.getSHA256(new_passwd);
            return lecturerRepository.changePasswd(lect_id, p);
        }
    }

    public Object changeInfo(Lecturer lecturer){
        return lecturerRepository.changeInfo(lecturer);
    }
}
