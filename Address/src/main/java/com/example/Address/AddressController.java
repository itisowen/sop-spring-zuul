package com.example.Address;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddressController {

    @RequestMapping("/actuator/info")
    String index() {
        return "Hi!";
    }

    @GetMapping("/v1/student/{id}")
    ResponseEntity<Students> getCustomerAddress(@PathVariable int id) {
        Students student = new Students();
        student.setStudentId(id);
        student.setName("Suthee Pilamart");
        return ResponseEntity.ok(student);
    }

//    @GetMapping("/v1/student/{id}")
//    ResponseEntity<Students> getStudents(@PathVariable int id) {
//        System.out.println(String.format("Requested with id : %d", id));
//        return ResponseEntity.ok(new Students(id));
//    }
}

