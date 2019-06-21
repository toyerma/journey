package com.lisihocke.journey.service.mapper;

import com.lisihocke.journey.domain.*;
import com.lisihocke.journey.service.dto.JournalEntryDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link JournalEntry} and its DTO {@link JournalEntryDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface JournalEntryMapper extends EntityMapper<JournalEntryDTO, JournalEntry> {



    default JournalEntry fromId(Long id) {
        if (id == null) {
            return null;
        }
        JournalEntry journalEntry = new JournalEntry();
        journalEntry.setId(id);
        return journalEntry;
    }
}
