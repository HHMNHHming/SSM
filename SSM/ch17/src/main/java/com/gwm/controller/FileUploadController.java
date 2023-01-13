package com.gwm.controller;

import com.gwm.pojo.FileDomain;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class FileUploadController {
    private static final Log logger = LogFactory.getLog(FileUploadController.class);
    @RequestMapping("/onefile")
    public String oneFileUpload(@ModelAttribute FileDomain fileDomain, HttpServletRequest request){
        System.out.println("进入了onefile的程序··");
        String realPath = request.getServletContext().getRealPath("uploadFiles");
        String fileName = fileDomain.getFile().getOriginalFilename();

        assert fileName != null;
        File targetFile = new File(realPath,fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        try{
            fileDomain.getFile().transferTo(targetFile);
            logger.info("上传成功");
        }catch(Exception e){
            e.printStackTrace();

        }

        return "showOne";
    }
}
