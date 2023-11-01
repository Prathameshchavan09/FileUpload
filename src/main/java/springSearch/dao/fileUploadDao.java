package springSearch.dao;

import springSearch.model.UserFiles;
public interface fileUploadDao extends CrudRepository<UserFiles, Long> {
    // Additional methods for specific operations if needed
}
