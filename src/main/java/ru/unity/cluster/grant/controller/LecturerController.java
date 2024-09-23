package ru.unity.cluster.grant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.unity.cluster.grant.model.LecturerEntity;
import ru.unity.cluster.grant.services.ILecturerService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lecturers")
public class LecturerController {

private final ILecturerService lecturerService;


    @Autowired
    public LecturerController(ILecturerService lecturerService) {
        this.lecturerService = lecturerService;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody LecturerEntity lecturer) {
        lecturerService.create(lecturer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<LecturerEntity>> read() {
        final List<LecturerEntity> lecturers = lecturerService.readAll();
        final ArrayList<LecturerEntity> emptyList = new ArrayList<>();
        return lecturers != null && !lecturers.isEmpty()
                ? new ResponseEntity<>(lecturers, HttpStatus.OK)

                :new ResponseEntity<>(emptyList, HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<LecturerEntity> read(@PathVariable(name = "id") int id) {
        final LecturerEntity lecturer = lecturerService.read(id);


        return lecturer != null
                ? new ResponseEntity<>(lecturer, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping (value = "/{id}")
    public ResponseEntity<?>update(@PathVariable (name = "id") int id, @RequestBody LecturerEntity lecturer){

        final boolean updated  = lecturerService.update(lecturer, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);

    }
    @DeleteMapping (value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable (name = "id") int id){
        final boolean deleted = lecturerService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
