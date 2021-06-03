package fun.muzi.class_selection.repository;

import fun.muzi.class_selection.entity.Course;
import fun.muzi.class_selection.entity.Curriculum;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface ClassRepository {

    List<Map<String,Object>> search(Curriculum curriculum);

    List<Map<String,Object>> redundantSearch(Curriculum curriculum);

    List<Map<String, String>> getCourseList(Course course);
}
