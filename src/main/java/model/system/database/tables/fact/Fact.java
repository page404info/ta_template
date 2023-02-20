package model.system.database.tables.fact;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Immutable
@Table(name = "name")
public class Fact {
    @Id
    @Column(name = "SRC_ID")
    private String id;
}
