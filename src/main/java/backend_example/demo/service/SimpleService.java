package backend_example.demo.service;

import backend_example.demo.dto.SimpleDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimpleService {

    private List<SimpleDto> list = new ArrayList<>();

    public List<SimpleDto> getList() {
        return list;
    }
    public void addList(SimpleDto value) {
        this.list.add(value);
    }

    public void setList(SimpleDto value) {
        this.list.set(0,value);
    }
    public void removeList() {
        this.list.clear();
    }
}
