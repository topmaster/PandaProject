package by.goncharov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

/**
 * Description of GoodsCategory class
 *
 * @author Mikita Hancharou
 * @created 23.05.13 16:00
 */
@Entity
@Table(name = "goods_category")
public class GoodsCategory extends AbstractEntity implements Serializable {

    @Column(unique = true, name = "goods_category_name")
    private String goodsCategoryName;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "charges_id", nullable = true)
    private Set<Expenses> expensesSet;

    public String getGoodsCategoryName() {
        return goodsCategoryName;
    }

    public void setGoodsCategoryName(String gcName) {
        this.goodsCategoryName = gcName;
    }

    public Set<Expenses> getExpensesSet() {
        return expensesSet;
    }

    public void setExpensesSet(Set<Expenses> expensesSet) {
        this.expensesSet = expensesSet;
    }
}
