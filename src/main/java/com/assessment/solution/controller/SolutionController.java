package com.assessment.solution.controller;

import com.assessment.solution.service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.lang.reflect.Parameter;

@RestController
public class SolutionController {

    @Autowired
    private SolutionService solutionService;

//    @GetMapping("")
//    public String getIndexPage(){
//        return "Server is working";
//    }


    @GetMapping("/")
    public String calculate(@RequestParam("latitude1") Double latitude1, @RequestParam("longitude1") Double longitude1,
                            @RequestParam("latitude2") Double latitude2, @RequestParam("longitude2") Double longitude2) {
        String result = solutionService.calculateDistance(latitude1, longitude1, latitude2, longitude2);
        return result;
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public String handleException(MethodArgumentTypeMismatchException exception){
       Parameter parameter = exception.getParameter().getParameter();
       return String.format("Invalid value for %s", parameter.getName());
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public String handleException2(MissingServletRequestParameterException exception){
        String parameter = exception.getParameterName();
        return String.format("%s is missing", parameter);
    }
}
