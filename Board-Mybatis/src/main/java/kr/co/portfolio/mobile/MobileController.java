package kr.co.portfolio.mobile;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/mobile/*")
public class MobileController {
	
	@RequestMapping(value= {"","/"}, produces= {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<String> getMain(){
		return new ResponseEntity<>("not permission",HttpStatus.FORBIDDEN);
	}

}
