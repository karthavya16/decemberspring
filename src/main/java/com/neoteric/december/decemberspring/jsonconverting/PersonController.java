package com.neoteric.december.decemberspring.jsonconverting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    @GetMapping(value = "/person",
            consumes = {"application/json",
            },produces = {"application/json"}
    )
    public Person getPerson() {
        return new Person("kk", 25, List.of("Teacher", "Musician"));
    }

}

