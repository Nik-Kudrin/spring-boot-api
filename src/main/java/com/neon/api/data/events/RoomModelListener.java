package com.neon.api.data.events;

import com.neon.api.data.model.Room;
import com.neon.api.data.services.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@Component
public class RoomModelListener extends AbstractMongoEventListener<Room> {

    private SequenceGeneratorService sequenceGenerator;

    @Autowired
    public RoomModelListener(SequenceGeneratorService sequenceGenerator) {
        this.sequenceGenerator = sequenceGenerator;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Room> event) {
        if (event.getSource().getId() < 1) {
            event.getSource().setId(sequenceGenerator.getNextSequence(Room.SEQUENCE_NAME));
        }
    }
}
