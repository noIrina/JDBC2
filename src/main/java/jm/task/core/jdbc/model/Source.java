package jm.task.core.jdbc.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Timestamp;

@Table
@Getter
@Setter

@NoArgsConstructor
public class Source {
    @Id
    private Long id;

    private String name;

    private String  provider; //    referens?
    private String product; //            referens?
    private String application ; //         referens?


   private Timestamp createdAt;


    public Source(String name, String provider, String product, String application) {
        this.name = name;
        this.provider = provider;
        this.product = product;
        this.application = application;
    }

}
