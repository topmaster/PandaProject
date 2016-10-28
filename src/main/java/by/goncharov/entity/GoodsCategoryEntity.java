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
 * GoodsCategoryEntity.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Entity
@Table(name = "goods_category")
public class GoodsCategoryEntity extends AbstractEntity implements Serializable
{
	@Column(unique = true, name = "goods_category_name")
	private String goodsCategoryName;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "charges_id", nullable = true)
	private Set<ExpensesEntity> expensesEntitySet;

	/**
	 * Gets goodsCategoryName.
	 *
	 * @return Value of goodsCategoryName.
	 */
	public String getGoodsCategoryName()
	{
		return goodsCategoryName;
	}

	/**
	 * Sets new expensesEntitySet.
	 *
	 * @param expensesEntitySet New value of expensesEntitySet.
	 */
	public void setExpensesEntitySet(final Set<ExpensesEntity> expensesEntitySet)
	{
		this.expensesEntitySet = expensesEntitySet;
	}

	/**
	 * Gets expensesEntitySet.
	 *
	 * @return Value of expensesEntitySet.
	 */
	public Set<ExpensesEntity> getExpensesEntitySet()
	{
		return expensesEntitySet;
	}

	/**
	 * Sets new goodsCategoryName.
	 *
	 * @param goodsCategoryName New value of goodsCategoryName.
	 */
	public void setGoodsCategoryName(final String goodsCategoryName)
	{
		this.goodsCategoryName = goodsCategoryName;
	}
}
