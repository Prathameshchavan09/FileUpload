package springSearch;


import java.io.IOException;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.view.RedirectView;
import springSearch.service.FileService;


@Controller
public class searchController {

	@Autowired
	private FileService fileService;
	
	
	@RequestMapping("/home")
	public String home() {
		
		return "search";
		
	}
	
	
	@RequestMapping("/searchBar")
	public RedirectView view(@RequestParam("searchUserData") String searched ) {
		
		
		
		String url = "https://www.google.com/search?q="+searched;
		
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		
		if(searched.isEmpty()) {
			redirectView.setUrl("home");
			}
			
		
		return redirectView;
		
		
		
	}
	
	
	
	
	
	@RequestMapping(path="/fileUploadprocess" , method=RequestMethod.POST)
	public String fileUpload() {
		
		return "fileUpload";
	}
	
	
	
	
	
	@RequestMapping(path = "/uploadFile", method = RequestMethod.POST)
    public String browseFile(@RequestParam("fileData") CommonsMultipartFile userDropFile, Model model) {

		 if (!userDropFile.isEmpty()) {
	            try {
	                fileService.UserFile(userDropFile);
	                model.addAttribute("message", "File uploaded");
	            } catch (IOException e) {
	                model.addAttribute("message", "File failed: " + e.getMessage());
	            }
	        } else {
	            model.addAttribute("message", "Please select a file to upload");
	        }
		return "fileUploadedSucc";
    }
	
	
	
}



