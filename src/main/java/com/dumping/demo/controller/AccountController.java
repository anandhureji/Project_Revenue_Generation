package com.dumping.demo.controller;



import com.dumping.demo.entity.Account;
import com.dumping.demo.helper.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.dumping.demo.service.AccountService;
import com.dumping.demo.service.AssociateService;
import com.dumping.demo.service.ProjectService;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class AccountController {

    @Autowired
    private AccountService accountService;
    
    @Autowired
    private ProjectService projectService;
    
    @Autowired
    private AssociateService associateService;

    @PostMapping("/account/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) throws ParseException {
        if (Helper.checkExcelFormat(file)) {
            //true

            this.accountService.save(file);
            
            this.projectService.save(file);
            
            this.associateService.save(file);

            return ResponseEntity.ok(Map.of("message", "File is uploaded and data is saved to db"));


        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file ");
    }
    
    

    


    @GetMapping("/account")
    public List<Account> getAllProduct() {
        return this.accountService.getAllAccounts();
    }

}

