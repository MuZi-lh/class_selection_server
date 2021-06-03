package fun.muzi.class_selection.service;

import fun.muzi.class_selection.entity.Course;
import fun.muzi.class_selection.entity.Curriculum;
import fun.muzi.class_selection.entity.Lecturer;
import fun.muzi.class_selection.entity.Student;
import fun.muzi.class_selection.repository.AdminRepository;
import fun.muzi.class_selection.util.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Map;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public Object addCourse(Course course) {
        return adminRepository.addCourse(course);
    }

    public Object dropCourse(String cour_id) {
        return adminRepository.dropCourse(cour_id);
    }

    public Object updateCourse(Course course) {
        return adminRepository.updateCourse(course);
    }

    public Object addLecturer(Lecturer lecturer) {
        lecturer.setPasswd(Encryption.getSHA256(lecturer.getPasswd()));
        return adminRepository.addLecturer(lecturer);
    }

    public Object dropLecturer(String lect_id) {
        return adminRepository.dropLecturer(lect_id);
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
