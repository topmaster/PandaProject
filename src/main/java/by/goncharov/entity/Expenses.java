package by.goncharov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Description of Expenses class
 *
 * @author Mikita Hancharou
 * @created 23.05.13 16:07
 */
@Entity
@Table(name = "expenses")
public class Expenses extends AbstractEntity implements Serializable {

    @Column(name = "charges_article")
    private String chargesArticle;

    @Temporal(TemporalType.TIMESTAMP)
    private Date paymentDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_goods_category_id", nullable = false)
    private GoodsCategory goodsCategory;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_user_id", nullable = false)
    private User user;

    @PrePersist
    protected void onCreate() {
        paymentDate = new Date();
    }

    public String getChargesArticle() {
        return chargesArticle;
    }

    public void setChargesArticle(String chargesArticle) {
        this.chargesArticle = chargesArticle;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public GoodsCategory getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(GoodsCategory goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
