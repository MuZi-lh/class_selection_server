package fun.muzi.class_selection.repository;

import fun.muzi.class_selection.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AdminRepository {

    Admin getById(String admi_id);

    List<Course> getCourseList(Course course);

    Integer addCourse(Course course);

    Integer dropCourse(String cour_id);

    Integer addCurriculum(Curriculum curriculum);

    Integer dropCurriculum(Curriculum curriculum);

    Integer updateCourse(Course course);

    List<Lecturer> getLecturerList(Lecturer lecturer);

    Integer addLecturer(Lecturer lecturer);

    Integer dropLecturer(String lect_id);

    List<Student> getStudentList(String depa_name, String major, String year);

    Integer addStudent(Student student);

    Integer dropStudent(String stud_id);

//    List<Student> getStudentListOfSpecificMajor(String depa_name, String major);

}
