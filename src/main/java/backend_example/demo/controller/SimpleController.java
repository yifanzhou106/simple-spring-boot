package backend_example.demo.controller;

import backend_example.demo.service.SimpleService;
import backend_example.demo.dto.SimpleDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SimpleController {

    private SimpleService simpleService;

    public SimpleController(SimpleService simpleService) {
       this.simpleService = simpleService;
    }

    @PostMapping(value = "/",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void addValue(@RequestBody SimpleDto val ){
        simpleService.addList(val);
    }

    @GetMapping(value = "/")
    public List<SimpleDto> getValue(){
        return simpleService.getList();
    }

    @PutMapping(value = "/",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void modifyValue(@RequestBody SimpleDto val){
        simpleService.setList(val);
    }

    @DeleteMapping(value = "/")
    public void deleteValue(){
        simpleService.removeList();
    }
}
