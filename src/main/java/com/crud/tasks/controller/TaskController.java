package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/task")//generowanie adresu dla api pod którym dany Controller będzie przyjmował żądania
public class TaskController {
    @RequestMapping(method = RequestMethod.GET, value = "getTasks")//nadanie ścieżek dla metod Controllera,
    // aby Controller wiedział, z której z metod chcemy skorzystać,(method) -poinformowanie Springa,
    // jakiego rodzaju żądania ma oczekiwać pod podanym adresem, aby wszystkie inne żądania były odrzucane.
    // Kolejnym parametrem jest value i jest to nazwa mapowania, czyli to, co znajdzie się w adresie URL.
    //http://localhost:8080/v1/task/getTasks  -URL do pobrania żądań

    public List<TaskDto> getTasks() {
        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTask")
    public TaskDto getTask(Long taskId) {
        return new TaskDto(1L,"","");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteTask")
    public void deleteTask(Long taskId) {

    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateTask")
    public TaskDto updateTask(TaskDto taskDto) {
        return new TaskDto(1L,"","");
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTask")
    public void createTask(TaskDto taskDto) {

    }
}
