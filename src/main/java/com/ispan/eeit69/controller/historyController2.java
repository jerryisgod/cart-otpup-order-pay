package com.ispan.eeit69.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ispan.eeit69.model.Cart;
import com.ispan.eeit69.service.accountBalanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Controller
public class historyController2 {
	
	 @GetMapping("/viewpurchasehistory")  
	  public String showtopup() {
	   
	      return "account-details/viewpurchasehistory";  
	  }
	 
	
	  

}
