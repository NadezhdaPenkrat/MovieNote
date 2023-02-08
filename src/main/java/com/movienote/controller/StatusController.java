package com.movienote.controller;

import com.movienote.model.Status;
import com.movienote.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/status")
public class StatusController {

    private final StatusService statusService;
    @Autowired
    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping()
    public List<Status> getAllStatuses() {

        return statusService.getAll();
    }

}



