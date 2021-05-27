package fun.muzi.class_selection.repository;

import com.github.pagehelper.Page;
import fun.muzi.class_selection.entity.Curriculum;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface ClassRepository {

    Page<Curriculum> search(Curriculum curriculum);

    Page<Curriculum> redundantSearch(Curriculum curriculum);
}
