/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.felipe.spring.controllers;

import com.felipe.spring.LoginUser;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author Felipe
 */
public class LoginController extends SimpleFormController{

    @Override
    protected ModelAndView showForm(HttpServletRequest request, HttpServletResponse response, BindException errors) throws Exception {
        ModelAndView mv = super.showForm(request, response, errors);
        mv.addObject("ola", "OI como vc esta");
        return mv;
    }
    
    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        LoginUser user = (LoginUser) command;
        ModelAndView mav;
        if (user.getUserName().equals("test") && user.getPassword().equals("test")) {
            return mav = new ModelAndView("main","user",user);
        }
        return mav = new ModelAndView("login","user",user);
    }
    
}
