package springSearch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import springSearch.dao.fileUploadDao;
import springSearch.model.UserFiles;

import java.io.IOException;

@Service
public class FileService{

    @Autowired
    private fileUploadDao fileuploadDao;

    public void UserFile(MultipartFile file) throws IOException {
        UserFiles userFiles = new UserFiles();
        userFiles.setFilename(file.getOriginalFilename());
        userFiles.setFiledata(file.getBytes());
        fileuploadDao.save(userFiles);
    }
}
