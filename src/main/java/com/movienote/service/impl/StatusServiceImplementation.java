
package com.movienote.service.impl;

import com.movienote.model.Status;
import com.movienote.service.StatusService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;


@Transactional
@Service
public class StatusServiceImplementation implements StatusService {

    @Override
    public List<Status> getAll() {
        return Arrays.asList(Status.values());
    }

}
