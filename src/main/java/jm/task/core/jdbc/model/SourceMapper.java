package jm.task.core.jdbc.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SourceMapper implements RowMapper<Source> {

    @Override
    public Source mapRow(ResultSet rs, int rowNum) throws SQLException {
//        final Long id = rs.getLong("id");
        final String name = rs.getString("name");
        final String provider = rs.getString("provider");
        final String product = rs.getString("product");
        final String application = rs.getString("application");
//        final String createdAt = rs.getString("createdAt");
        return new Source(name,provider,product,application);
    }
}

