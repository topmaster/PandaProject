package by.goncharov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;

/**
 * ContactEntity.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
@Entity
@Table(name = "contact")
public class ContactEntity extends AbstractEntity implements Serializable
{
	private static final int COMMENTS_LENGTH = 65536;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "middlename")
	private String middlename;

	@Column(name = "email")
	private String email;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "work_phone_number")
	private String workPhoneNumber;

	@Column(name = "birthdate")
	private String birthdate;

	@Column(name = "comments", length = COMMENTS_LENGTH)
	private String comments;

	@Column(name = "contact_type")
	private Integer type;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_user_id", nullable = false)
	private UserEntity userEntity;

	/**
	 * Sets new middlename.
	 *
	 * @param middlename New value of middlename.
	 */
	public void setMiddlename(final String middlename)
	{
		this.middlename = middlename;
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
	 * Gets type.
	 *
	 * @return Value of type.
	 */
	public Integer getType()
	{
		return type;
	}

	/**
	 * Sets new type.
	 *
	 * @param type New value of type.
	 */
	public void setType(final Integer type)
	{
		this.type = type;
	}

	/**
	 * Sets new birthdate.
	 *
	 * @param birthdate New value of birthdate.
	 */
	public void setBirthdate(final String birthdate)
	{
		this.birthdate = birthdate;
	}

	/**
	 * Gets middlename.
	 *
	 * @return Value of middlename.
	 */
	public String getMiddlename()
	{
		return middlename;
	}

	/**
	 * Sets new workPhoneNumber.
	 *
	 * @param workPhoneNumber New value of workPhoneNumber.
	 */
	public void setWorkPhoneNumber(final String workPhoneNumber)
	{
		this.workPhoneNumber = workPhoneNumber;
	}

	/**
	 * Gets firstname.
	 *
	 * @return Value of firstname.
	 */
	public String getFirstname()
	{
		return firstname;
	}

	/**
	 * Gets workPhoneNumber.
	 *
	 * @return Value of workPhoneNumber.
	 */
	public String getWorkPhoneNumber()
	{
		return workPhoneNumber;
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
	 * Gets birthdate.
	 *
	 * @return Value of birthdate.
	 */
	public String getBirthdate()
	{
		return birthdate;
	}

	/**
	 * Gets lastname.
	 *
	 * @return Value of lastname.
	 */
	public String getLastname()
	{
		return lastname;
	}

	/**
	 * Gets mobileNumber.
	 *
	 * @return Value of mobileNumber.
	 */
	public String getMobileNumber()
	{
		return mobileNumber;
	}

	/**
	 * Gets email.
	 *
	 * @return Value of email.
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * Sets new comments.
	 *
	 * @param comments New value of comments.
	 */
	public void setComments(final String comments)
	{
		this.comments = comments;
	}

	/**
	 * Gets comments.
	 *
	 * @return Value of comments.
	 */
	public String getComments()
	{
		return comments;
	}

	/**
	 * Sets new lastname.
	 *
	 * @param lastname New value of lastname.
	 */
	public void setLastname(final String lastname)
	{
		this.lastname = lastname;
	}

	/**
	 * Sets new email.
	 *
	 * @param email New value of email.
	 */
	public void setEmail(final String email)
	{
		this.email = email;
	}

	/**
	 * Sets new firstname.
	 *
	 * @param firstname New value of firstname.
	 */
	public void setFirstname(final String firstname)
	{
		this.firstname = firstname;
	}

	/**
	 * Sets new mobileNumber.
	 *
	 * @param mobileNumber New value of mobileNumber.
	 */
	public void setMobileNumber(final String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
}
