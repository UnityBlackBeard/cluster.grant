package ru.unity.cluster.grant.services;

import ru.unity.cluster.grant.model.LecturerEntity;

import java.util.List;

public interface ILecturerService {

    void create (LecturerEntity lecturer);


    List<LecturerEntity> readAll();

    LecturerEntity read(int id);

    boolean update(LecturerEntity lecturer, int id);

    boolean delete(int id);
}
