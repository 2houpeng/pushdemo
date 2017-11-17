package com.qianfeng.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("upload")
public class UploadAction {
	@RequestMapping(value="fileUpload.do", method=RequestMethod.POST)
	public String fileUpload(MultipartFile upload) throws Exception{
		String path = "";
		if (upload != null) {
			path = System.currentTimeMillis() + upload.getOriginalFilename();
			File targetFile = new File("D:/temp", path);
			FileUtils.copyInputStreamToFile(upload.getInputStream(), targetFile);;
		}
		System.out.println(path + "========");
		return "redirect:/image.jsp?path=D:/temp/" + path;
	}
}
