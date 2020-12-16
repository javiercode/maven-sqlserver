package de.cosh.azure.rest;

import de.cosh.azure.model.Person;
import de.cosh.azure.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by cosh on 06.12.2016.
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/version")
    ResponseEntity<String> version(@RequestBody Person input) {
        return new ResponseEntity<String>("v1", HttpStatus.OK);
    }

    @GetMapping("/test")
    ResponseEntity<Integer> test(@RequestBody Person input) {
        return new ResponseEntity<Integer>(personService.test(), HttpStatus.OK);
    }
}
