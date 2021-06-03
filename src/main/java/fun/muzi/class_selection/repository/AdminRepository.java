package fun.muzi.class_selection.repository;

import fun.muzi.class_selection.entity.Course;
import fun.muzi.class_selection.entity.Curriculum;
import fun.muzi.class_selection.entity.Lecturer;
import fun.muzi.class_selection.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Currency;
import java.util.List;

@Repository
@Mapper
public interface AdminRepository {

    Integer addCourse(Course course);

    Integer dropCourse(String cour_id);

    Integer addCurriculum(Curriculum curriculum);

    Integer dropCurriculum(Curriculum curriculum);

    Integer updateCourse(Course course);

    Integer addLecturer(Lecturer lecturer);

    Integer dropLecturer(String lect_id);

    Integer addStudent(Student student);

    Integer dropStudent(String stud_id);

//    List<Student> getStudentListOfSpecificMajor(String depa_name, String major);

}
