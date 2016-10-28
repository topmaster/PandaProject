package by.goncharov.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import java.io.Serializable;

/**
 * AbstractEntity.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable
{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;

	/**
	 * Gets id.
	 *
	 * @return the id
	 */
	public Long getId()
	{
		return id;
	}

	/**
	 * Sets id.
	 *
	 * @param id the id
	 */
	public void setId(final Long id)
	{
		this.id = id;
	}
}