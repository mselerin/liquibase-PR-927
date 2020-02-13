package be.mselerin.test.liquibasesample.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FooEntity {
    @Id
    private Long id;

    private String bar;
    private String buz;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getBuz() {
        return buz;
    }

    public void setBuz(String buz) {
        this.buz = buz;
    }
}
