package com.mycompany.hackathon.led;

import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author douglas.silva
 */
@RestController
@RequestMapping("/led")
public class LedController {
    
    private LedService ledService = new LedService();
    
    @PostConstruct
    public void inicializar(){
        ledService.initialize();
    }
    
    @RequestMapping(value = "/acender", method = RequestMethod.POST)
    @ResponseBody
    public void acenderLed(@RequestBody int porta){
        ledService.enviaDados(porta);
    }
    
    @RequestMapping(value = "/apagar", method = RequestMethod.POST)
    @ResponseBody
    public void apagarLed(@RequestBody int porta){
        ledService.enviaDados(porta);
    }
    
}
