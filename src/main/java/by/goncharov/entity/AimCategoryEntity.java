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
 * AimCategoryEntity.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Entity
@Table(name = "aim_category")
public class AimCategoryEntity extends AbstractEntity implements Serializable
{
	@Column(name = "isImportant")
	private Boolean isImportant;

	@Column(name = "isUrgently")
	private Boolean isUrgently;

	@Column(name = "long_term")
	private Boolean isLongTerm;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "aim_id", nullable = true)
	private Set<AimEntity> aimEntitySet;

	/**
	 * Gets IsImportant.
	 *
	 * @return the isImportant
	 */
	public Boolean getImportant()
	{
		return isImportant;
	}

	/**
	 * Sets IsImportant.
	 *
	 * @param isImportant the isImportant
	 */
	public void setImportant(final Boolean isImportant)
	{
		this.isImportant = isImportant;
	}

	/**
	 * Gets IsUrgently.
	 *
	 * @return the isUrgently
	 */
	public Boolean getIsUrgently()
	{
		return isUrgently;
	}

	/**
	 * Sets IsUrgently.
	 *
	 * @param isUrgently the isUrgently
	 */
	public void setIsUrgently(final Boolean isUrgently)
	{
		this.isUrgently = isUrgently;
	}

	/**
	 * Gets isLongTerm.
	 *
	 * @return the isLongTerm
	 */
	public Boolean getIsLongTerm()
	{
		return isLongTerm;
	}

	/**
	 * Sets isLongTerm.
	 *
	 * @param isLongTerm the isLongTerm
	 */
	public void setIsLongTerm(final Boolean isLongTerm)
	{
		this.isLongTerm = isLongTerm;
	}

	/**
	 * Gets AimEntity Set.
	 *
	 * @return the set of AimEntity
	 */
	public Set<AimEntity> getAimEntitySet()
	{
		return aimEntitySet;
	}

	/**
	 * Sets AimEntity Set.
	 *
	 * @param aimEntitySet the set of AimEntity
	 */
	public void setAimEntitySet(final Set<AimEntity> aimEntitySet)
	{
		this.aimEntitySet = aimEntitySet;
	}
}
