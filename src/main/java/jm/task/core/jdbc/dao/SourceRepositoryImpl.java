package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.Source;
import jm.task.core.jdbc.model.SourceMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SourceRepositoryImpl implements SourceRepository{

    private final NamedParameterJdbcTemplate jdbc;

    public SourceRepositoryImpl(NamedParameterJdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    public void saveSource(Source source) {
//        Map<String, Object> params = new HashMap<>();
//        params.put("name", source.getName());
//        params.put("provider", source.getProvider());
//        params.put("product", source.getProduct());
//        params.put("application", source.getApplication());
//        jdbc.update("INSERT INTO source (provider=:provider,product=:product,application=:application,name=:name", params);

        Map<String, Object> params = new HashMap<>();
        params.put("name", source.getName());
        params.put("provider", source.getProvider());
        params.put("product", source.getProduct());
        params.put("application", source.getApplication());
//        SqlParameterSource paramSource = new MapSqlParameterSource(params);
//
//        GeneratedKeyHolder holder = new GeneratedKeyHolder();

        jdbc.update("insert into source (name,provider,product,application) values (:name, :provider, :product, :application)",
                params);

//        jdbc.update("insert into source (name) values (:name)", paramSource, holder);

//        jdbc.update("INSERT INTO source (name,provider,product,application) VALUES (?,?,?,?)", paramSource, holder);
//        source.setId(holder.getKey().longValue());


    }
    public void update(Source source) {

    }

    public Source findByNameSource(String name) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", name);
        return jdbc.queryForObject("select * from source where name=:name", params, new SourceMapper());
    }


    public void deleteById(Long id) {

    }


    public List<Source> findAll() {
        return null;
    }


}
