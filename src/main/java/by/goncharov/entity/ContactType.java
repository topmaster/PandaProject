package by.goncharov.entity;

import by.goncharov.utils.CommonConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * ContactType enum.
 *
 * @author Mikita Hancharou <m.hancharou@gmail.com>
 * @package by.goncharov.controller
 */
public enum ContactType
{
	OWNER(CommonConstants.CONTACT_TYPE_OWNER, "contact.type.owner"),
	FAMILIAR(CommonConstants.CONTACT_TYPE_ACQUAINTANCE, "contact.type.acquaintance"),
	CANDIDATE(CommonConstants.CONTACT_TYPE_CANDIDATE, "contact.type.candidate"),
	CUSTOMER(CommonConstants.CONTACT_TYPE_CUSTOMER, "contact.type.customer"),
	DISTRIBUTOR(CommonConstants.CONTACT_TYPE_DISTRIBUTOR, "contact.type.distributor"),
	DROPPED_OUT(CommonConstants.CONTACT_TYPE_DROPPED_OUT, "contact.type.dropped_out");

	private static final Map<Integer, ContactType> MAP = new HashMap<Integer, ContactType>();

	static
	{
		for (final ContactType contactType : ContactType.values())
		{
			MAP.put(contactType.getType(), contactType);
		}
	}

	private final Integer type;
	private final String  key;
	private       String  labelKey;

	/**
	 * Constructor.
	 *
	 * @param type the type
	 * @param key  the key
	 */
	ContactType(final Integer type, final String key)
	{
		this.type = type;
		this.key = key;
	}

	/**
	 * Gets Enum.
	 *
	 * @param type the type
	 *
	 * @return the ContactType
	 */
	public static ContactType getEnum(final Integer type)
	{
		return MAP.get(type);
	}

	/**
	 * Gets labelKey.
	 *
	 * @return Value of labelKey.
	 */
	public String getLabelKey()
	{
		return labelKey;
	}

	/**
	 * Sets new labelKey.
	 *
	 * @param labelKey New value of labelKey.
	 */
	public void setLabelKey(final String labelKey)
	{
		this.labelKey = labelKey;
	}

	/**
	 * Gets key.
	 *
	 * @return Value of key.
	 */
	public String getKey()
	{
		return key;
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
}
