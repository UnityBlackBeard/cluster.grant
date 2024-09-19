package ru.unity.cluster.grant.services;

import org.springframework.stereotype.Service;
import ru.unity.cluster.grant.model.LecturerEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class LecturerServiceImpl  implements  ILecturerService{
    private static final Map<Integer, LecturerEntity> LECTURERS_REPOSITORY_MAP = new HashMap<>();

    private static final AtomicInteger LECTURERS_ID_HOLDER = new AtomicInteger();


    @Override
    public void create(LecturerEntity lecturer) {
        final int lecturerId = LECTURERS_ID_HOLDER.incrementAndGet();
        lecturer.setId(lecturerId);
        LECTURERS_REPOSITORY_MAP.put(lecturerId, lecturer);
    }

    @Override
    public List<LecturerEntity> readAll() {
        return new ArrayList<>(LECTURERS_REPOSITORY_MAP.values());
    }

    @Override
    public LecturerEntity read(int id) {
        return LECTURERS_REPOSITORY_MAP.get(id);
    }

    @Override
    public boolean update(LecturerEntity lecturer, int id) {
        if (LECTURERS_REPOSITORY_MAP.containsKey(id)) {
            lecturer.setId(id);
            LECTURERS_REPOSITORY_MAP.put(id, lecturer);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        return LECTURERS_REPOSITORY_MAP.remove(id) != null;
    }
}
