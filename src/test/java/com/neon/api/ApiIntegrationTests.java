package com.neon.api;

import com.neon.api.data.repository.RoomRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// TODO: room creation
// TODO: concurrent room creation
// TODO: room removing
// TODO: security: error while accessing room with wrong PIN
// TODO: Test containers for E2E tests ?

@SpringBootTest
@AutoConfigureMockMvc
class ApiIntegrationTests {
    private static final Logger log = LoggerFactory.getLogger(ApiIntegrationTests.class);

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private RoomRepository roomRepository;

    @Test
    public void createRoom_room() throws Exception {
        this.mockMvc.perform(post("/room"))
                .andDo(print())
                .andExpect(status().isOk());
//                .andExpect(jsonPath("$.content").value("Hello, World!"));
    }

    @Test
    public void accessRoom_room() throws Exception {

        this.mockMvc.perform(get("/room")
                .param("name", "Spring Community"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("Hello, Spring Community!"));
    }
}
