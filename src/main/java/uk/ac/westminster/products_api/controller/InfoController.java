package uk.ac.westminster.products_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String info() {
        return "products-api - Sprig boot REST API TUT OOP";
    }
}
