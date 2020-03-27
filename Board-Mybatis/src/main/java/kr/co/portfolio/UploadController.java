package kr.co.portfolio;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping(value="/upload")
public class UploadController {
	
	/** Upload FIle Path */
	private String RootPath = "";

	@GetMapping(value="/upload")
	public String UploadForm(MultipartFile[] uploadFile) {
		
		return "";
	}
	
	@PostMapping(value="/upload")
	public String UploadDo(MultipartFile uploadFile) {
		/** Folder if not exist Make Folder */
		File folder = makeFolder(RootPath);		
		/** not have folder make Folders */
		if(folder.exists() == false) {
			folder.mkdirs();
		}
		String uploadNames = makeSaveFileName(uploadFile.getOriginalFilename());
		try {
			File saveFiles = new File(folder, uploadNames);
			uploadFile.transferTo(saveFiles);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "";
	}
	
	@GetMapping(value="/download", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
	@ResponseBody
	public ResponseEntity<Resource> download(String fileName){
		Resource resource = new FileSystemResource("");
		/** Get File Name */
		String resourceName = resource.getFilename();
		HttpHeaders header = new HttpHeaders();
		try {
			header.add("Content-Disposition", "attachment; filename="+new String(resourceName.getBytes("UTF-8"), "ISO-8859-1"));
		}catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//return null;
		return new ResponseEntity<Resource>(resource, header, HttpStatus.OK);
	}
	
	/** Make File Name */
	private String makeSaveFileName(String fileName) {
		String saveFileName = "";
		UUID saveName = UUID.randomUUID();
		saveFileName = saveName + "_" + fileName;
		return saveFileName;
	}
	
	/** Make Save Folder */
	private File makeFolder(String path) {
		File folder = new File(RootPath + File.separator + path, getFolder());
		return folder;
	}
	
	/** Make Save Folder path */
	private String getFolder() {
		SimpleDateFormat dateFolder = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String returnFolder = dateFolder.format(date);
		
		return returnFolder.replace("-", File.separator);
	}
}
