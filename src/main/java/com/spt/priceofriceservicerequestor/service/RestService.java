package com.spt.priceofriceservicerequestor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * Created by korrakote on 2/2/2559.
 */
@Service
public class RestService extends AbstractCurrencyExchangeService {

    static Logger logger = LoggerFactory.getLogger(RestService.class);
   
    public ResponseEntity<String> findExchangeCurrencyByDate(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://" + this.HRMSServer + "/seedrices/findAllSeedRice";
        return getResultStringByTypeHttpMethodAndBodyContent("", HttpMethod.GET,url,restTemplate);
    }

    public ResponseEntity<String> findPricePerDayByDate(String day){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://" + this.HRMSServer + "/priceperdays/findPricePerDayByDay?day"+day;
        return getResultStringByTypeHttpMethodAndBodyContent("", HttpMethod.GET,url,restTemplate);
    }

}
