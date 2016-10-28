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
 * AimEntity.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Entity
@Table(name = "aim")
public class AimEntity extends AbstractEntity implements Serializable
{
	private static final int DESCRIPTION_LENGTH = 1024;

	@Column(name = "aim_name")
	private String aimName;

	@Column(name = "short_descr")
	private String shortDescription;

	@Column(name = "long_descr", length = DESCRIPTION_LENGTH)
	private String longDescription;

	@Column(name = "plane_date")
	private Date planeDate;

	@Column(name = "red_line")
	private Date redLine;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_user_id", nullable = false)
	private UserEntity userEntity;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_aim_category_id", nullable = false)
	private AimCategoryEntity aimCategoryEntity;

	/**
	 * Sets new aimName.
	 *
	 * @param aimName New value of aimName.
	 */
	public void setAimName(final String aimName)
	{
		this.aimName = aimName;
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
	 * Gets redLine.
	 *
	 * @return Value of redLine.
	 */
	public Date getRedLine()
	{
		return redLine;
	}

	/**
	 * Sets new shortDescription.
	 *
	 * @param shortDescription New value of shortDescription.
	 */
	public void setShortDescription(final String shortDescription)
	{
		this.shortDescription = shortDescription;
	}

	/**
	 * Gets longDescription.
	 *
	 * @return Value of longDescription.
	 */
	public String getLongDescription()
	{
		return longDescription;
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
	 * Sets new longDescription.
	 *
	 * @param longDescription New value of longDescription.
	 */
	public void setLongDescription(final String longDescription)
	{
		this.longDescription = longDescription;
	}

	/**
	 * Gets shortDescription.
	 *
	 * @return Value of shortDescription.
	 */
	public String getShortDescription()
	{
		return shortDescription;
	}

	/**
	 * Sets new aimCategoryEntity.
	 *
	 * @param aimCategoryEntity New value of aimCategoryEntity.
	 */
	public void setAimCategoryEntity(final AimCategoryEntity aimCategoryEntity)
	{
		this.aimCategoryEntity = aimCategoryEntity;
	}

	/**
	 * Gets planeDate.
	 *
	 * @return Value of planeDate.
	 */
	public Date getPlaneDate()
	{
		return planeDate;
	}

	/**
	 * Gets aimCategoryEntity.
	 *
	 * @return Value of aimCategoryEntity.
	 */
	public AimCategoryEntity getAimCategoryEntity()
	{
		return aimCategoryEntity;
	}

	/**
	 * Gets aimName.
	 *
	 * @return Value of aimName.
	 */
	public String getAimName()
	{
		return aimName;
	}

	/**
	 * Sets new planeDate.
	 *
	 * @param planeDate New value of planeDate.
	 */
	public void setPlaneDate(final Date planeDate)
	{
		this.planeDate = planeDate;
	}

	/**
	 * Sets new redLine.
	 *
	 * @param redLine New value of redLine.
	 */
	public void setRedLine(final Date redLine)
	{
		this.redLine = redLine;
	}
}
