package tn.esprit.devops_project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
public class CustomErrorController implements ErrorController {
    @GetMapping("/error")
    public String handleError() {
        // Handle the error here, e.g., return a custom error page or redirect to a specific URL
        return "error-page";
    }
}
