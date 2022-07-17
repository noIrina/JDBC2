package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.SourceRepository;
import jm.task.core.jdbc.model.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SourceServiceImpl implements SourceService {
    @Autowired
    SourceRepository sourceRepository;

    @Transactional()
    @Override
    public void saveSource(Source source) {
        sourceRepository.saveSource(source);
    }

    @Override
    public void update(Source source) {

    }

    @Transactional(readOnly = true)
    @Override
    public Source findByNameSource(String name) {
        return sourceRepository.findByNameSource(name);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Source> findAll() {
        return null;
    }
}
