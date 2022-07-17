package jm.task.core.jdbc.dao;


import jm.task.core.jdbc.model.Source;

import java.util.List;

public interface SourceRepository{
    void saveSource(Source source);
    void update(Source source);
    Source findByNameSource(String name);
    void deleteById(Long id);
    List<Source> findAll();
}
