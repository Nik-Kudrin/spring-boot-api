package com.neon.api;

import model.Room;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// TODO: spring session / auth  ... ?
// TODO: create room (thread safe) => room UID + PIN ?
// TODO: JOIN session (thread safe)

// TODO: Estimate

@RestController
public class ApiController {
    @GetMapping("/room")
    public Room getRoom(@RequestParam(value = "id", defaultValue = "") String id) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
