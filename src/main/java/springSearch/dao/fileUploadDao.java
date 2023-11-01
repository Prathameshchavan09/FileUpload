package springSearch.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import springSearch.model.UserFiles;

@Repository
public interface fileUploadDao extends CrudRepository<UserFiles, Long> {
    // Additional methods for specific operations if needed
}
