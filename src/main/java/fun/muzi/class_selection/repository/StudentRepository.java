package fun.muzi.class_selection.repository;

import fun.muzi.class_selection.entity.Curriculum;
import fun.muzi.class_selection.entity.Student;
import fun.muzi.class_selection.entity.Take;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentRepository {
    Student getById(String stud_id);

    Integer existStudentId(String stud_id);

    List<Take> getClassList(String stud_id, Integer year, String semester);

    Integer addTake(String stud_id, String cour_id, String curr_id, Integer year, String semester);

    Integer dropTake(String stud_id, String cour_id, String curr_id, Integer year, String semester);

    Integer changeInfo(Student student);

    Integer changePasswd(String stud_id, String new_passwd);

    Double getScore(String stud_id);
}
