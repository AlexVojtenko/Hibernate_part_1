package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "statuses")

public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long Id;
    @Column(name = "alias", unique = true, nullable = false)
    private String alias;
    @Column(name = "description", nullable = false)
    private String description;

    public Status(){

    }

    public Status(String alias, String description) {
        this.alias = alias;
        this.description = description;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Status{" +
                "Id=" + Id +
                ", alias='" + alias + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
