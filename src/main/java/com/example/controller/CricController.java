// package com.example.controller;

// import org.springframework.validation.annotation.Validated;
// import jakarta.validation.Valid;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;  
// import com.example.model.Cricket;
// import com.example.dto.CricDTO;
// import com.example.service.CricketService;

// @RestController
// @RequestMapping("/crickets")
// @Validated
// public class CricController {

//     private CricketService service;

//     public CricController( CricketService service){
//         this.service = service;
    // }

    // @PostMapping
    // public String save(@Valid @RequestBody CricDTO dto){
    //     service.save(dto);
    //     return "Cricket Saved";
    // }

    // @GetMapping
    // public List<Cricket> getCrickets(){
    //     return service.findAll();
    // }

//     @GetMapping("/{id}")
//     public Cricket getCricket(@PathVariable int id){
//         return service.findById(id);
//     }

//     @PutMapping
//     public String update(@Valid @RequestBody CricDTO dto){
//         service.update(dto);
//         return "Updated Successfully";
//     }
// }
