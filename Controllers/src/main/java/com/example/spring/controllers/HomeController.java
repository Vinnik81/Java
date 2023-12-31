package com.example.spring.controllers;

import com.example.spring.models.Person;
import com.example.spring.repository.BranchesRepository;
import com.example.spring.utils.CommonUtil;
import com.example.spring.utils.RestUtil;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(HomeController.class);

    List<String> arr = new ArrayList<>();

    @Autowired
    BranchesRepository branchesRepository;

   /* @Autowired
    private RestTemplate restTemplate;*/

    public HomeController() {
        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");
        arr.add("Five");

    }

    //RequestParam - запрос с параметром
    //RequestBody - запрос с телом
    //PathVariable - запрос с параметром пути
   /* @GetMapping("/test")
public String test(@RequestParam(name = "id", defaultValue = "0" ) Integer index) {
return arr.get(index);
}*/

    /*@GetMapping("/test/{id}/{name}")
    public String test(@PathVariable(name = "id") Integer index, @PathVariable(name = "name") String name) {
        System.out.println(name);
        return arr.get(index);
    }*/

    /*@PostMapping("/test")
    public boolean test(@RequestBody Person person) {
        System.out.println(person);
        return true;
    }*/

    /*@PostMapping("/test")
    public Person test(HttpServletRequest request, @Valid @RequestBody Person person) {
        logger.info("Good request " + " " + CommonUtil.getIp(request));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println(person);
        return person;
    }*/

    /*@Autowired
    private RestUtil restUtil;

    @GetMapping("/test/{title}")
    public Map test(HttpServletRequest request, @PathVariable String title) {
        logger.info("Good request " + " " + CommonUtil.getIp(request));
       return restUtil.getMovieByName(title);
    }*/
}
