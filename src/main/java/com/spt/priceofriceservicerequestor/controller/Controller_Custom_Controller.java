package com.spt.priceofriceservicerequestor.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.spt.priceofriceservicerequestor.service.RestService;

/**
 * Created by korrakote on 2/2/2559.
 */
@Controller
@RequestMapping("/nick")
public aspect Controller_Custom_Controller {

	@Autowired 
    RestService restService;

    @RequestMapping(value = "/findExchangeCurrencyByDate",method = RequestMethod.GET,headers = "Accept=application/json")
    public ResponseEntity<String> findExchangeCurrencyByDate(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        return restService.findExchangeCurrencyByDate();
    }

    @RequestMapping(value = "/findPricePerDayByDate",method = RequestMethod.GET,headers = "Accept=application/json")
    public ResponseEntity<String> findPricePerDayByDate(String day){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json; charset=utf-8");
        return restService.findPricePerDayByDate(day);
    }
}