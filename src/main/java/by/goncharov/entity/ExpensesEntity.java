package by.goncharov.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ExpensesEntity.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Entity
@Table(name = "expenses")
public class ExpensesEntity extends AbstractEntity implements Serializable
{
	@Column(name = "charges_article")
	private String chargesArticle;

	@Temporal(TemporalType.TIMESTAMP)
	private Date paymentDate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_goods_category_id", nullable = false)
	private GoodsCategoryEntity goodsCategoryEntity;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_user_id", nullable = false)
	private UserEntity userEntity;

	/**
	 * Gets goodsCategoryEntity.
	 *
	 * @return Value of goodsCategoryEntity.
	 */
	public GoodsCategoryEntity getGoodsCategoryEntity()
	{
		return goodsCategoryEntity;
	}

	/**
	 * Sets new goodsCategoryEntity.
	 *
	 * @param goodsCategoryEntity New value of goodsCategoryEntity.
	 */
	public void setGoodsCategoryEntity(final GoodsCategoryEntity goodsCategoryEntity)
	{
		this.goodsCategoryEntity = goodsCategoryEntity;
	}

	/**
	 * Sets new paymentDate.
	 *
	 * @param paymentDate New value of paymentDate.
	 */
	public void setPaymentDate(final Date paymentDate)
	{
		this.paymentDate = paymentDate;
	}

	/**
	 * Sets new userEntity.
	 *
	 * @param userEntity New value of userEntity.
	 */
	public void setUserEntity(final UserEntity userEntity)
	{
		this.userEntity = userEntity;
	}

	/**
	 * Gets userEntity.
	 *
	 * @return Value of userEntity.
	 */
	public UserEntity getUserEntity()
	{
		return userEntity;
	}

	/**
	 * Gets paymentDate.
	 *
	 * @return Value of paymentDate.
	 */
	public Date getPaymentDate()
	{
		return paymentDate;
	}

	/**
	 * Gets chargesArticle.
	 *
	 * @return Value of chargesArticle.
	 */
	public String getChargesArticle()
	{
		return chargesArticle;
	}

	/**
	 * Sets new chargesArticle.
	 *
	 * @param chargesArticle New value of chargesArticle.
	 */
	public void setChargesArticle(final String chargesArticle)
	{
		this.chargesArticle = chargesArticle;
	}
}
