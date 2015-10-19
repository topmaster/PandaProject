package by.goncharov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Description of Aim class
 *
 * @author Mikita Hancharou
 * @created 28.05.13 15:23
 */
@Entity
@Table(name = "aim")
public class Aim extends AbstractEntity implements Serializable {

    @Column(name = "aim_name")
    private String aimName;

    @Column(name = "short_descr")
    private String shortDescription;

    @Column(name = "long_descr", length = 1024)
    private String longDescription;

    @Column(name = "plane_date")
    private Date planeDate;

    @Column(name = "red_line")
    private Date redLine;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_aim_category_id", nullable = false)
    private AimCategory aimCategory;

    public String getAimName() {
        return aimName;
    }

    public void setAimName(String aimName) {
        this.aimName = aimName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Date getPlaneDate() {
        return planeDate;
    }

    public void setPlaneDate(Date planeDate) {
        this.planeDate = planeDate;
    }

    public Date getRedLine() {
        return redLine;
    }

    public void setRedLine(Date redLine) {
        this.redLine = redLine;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AimCategory getAimCategory() {
        return aimCategory;
    }

    public void setAimCategory(AimCategory aimCategory) {
        this.aimCategory = aimCategory;
    }
}
