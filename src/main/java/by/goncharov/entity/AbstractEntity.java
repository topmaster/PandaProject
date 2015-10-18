package by.goncharov.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Description of AbstractEntity class
 *
 * @author Mikita Hancharou
 * @created 19.10.2015 0:49
 */
public abstract class AbstractEntity implements Serializable {

    @Id
    @Column(name = "aim_category_id")
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}