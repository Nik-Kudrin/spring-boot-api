package com.neon.api.data.repository;

import com.neon.api.data.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomRepository extends MongoRepository<Room, Long> {
}
