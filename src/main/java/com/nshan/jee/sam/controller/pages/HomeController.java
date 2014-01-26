/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nshan.jee.sam.controller.pages;

import com.nshan.jee.sam.config.WebConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author neela
 */
@Controller
public class HomeController {
    String msg = "Welcome to SAM!!";
    
    @RequestMapping(value = {WebConfig.DEFAULT_TEMPLATE})
    public ModelAndView showIndex(){
        return new ModelAndView("index");
    }
    
    @RequestMapping(value = {WebConfig.ADMIN_HOME_TEMPLATE})
    public ModelAndView showAdminHome(){
        return new ModelAndView("home","message",msg);
    }
}
