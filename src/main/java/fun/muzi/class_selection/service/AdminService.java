package fun.muzi.class_selection.service;

import fun.muzi.class_selection.entity.*;
import fun.muzi.class_selection.repository.AdminRepository;
import fun.muzi.class_selection.util.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Map;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public Boolean check(String admi_id, String passwd){
        Admin admin = adminRepository.getById(admi_id);
        if (admin == null) {
            return false;
        }
        return admin.getPasswd().equals(Encryption.getSHA256(passwd));
    }

    public Object getCourseList(Course course) {
        return adminRepository.getCourseList(course);
    }
    public Object addCourse(Course course) {
        return adminRepository.addCourse(course);
    }

    public Object dropCourse(String cour_id) {
        return adminRepository.dropCourse(cour_id);
    }

    public Object updateCourse(Course course) {
        return adminRepository.updateCourse(course);
    }

    public Object getLecturerList(Lecturer lecturer) {
        return adminRepository.getLecturerList(lecturer);
    }

    public Object addLecturer(Lecturer lecturer) {
        lecturer.setPasswd(Encryption.getSHA256(lecturer.getPasswd()));
        return adminRepository.addLecturer(lecturer);
    }

    public Object dropLecturer(String lect_id) {
        return adminRepository.dropLecturer(lect_id);
    }

    public Object getStudentList(Map<String, String> body) {
        return adminRepository.getStudentList(body.get("depa_name"),
                body.get("major"), body.get("year"));
    }

    public Object addStudent(Student student) {
        student.setPasswd(Encryption.getSHA256(student.getPasswd()));
        return adminRepository.addStudent(student);
    }

    public Object dropStudent(String stud_id) {
        return adminRepository.dropStudent(stud_id);
    }

    public Object addCurriculum(Curriculum curriculum) {
        return adminRepository.addCurriculum(curriculum);
    }

    public Object dropCurriculum(Curriculum curriculum) {
        return adminRepository.dropCurriculum(curriculum);
    }
}
