package by.goncharov.entity;

import by.goncharov.utils.CommonConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * Description of ContactType class
 *
 * @author Mikita Hancharou
 * @created 28.05.13 13:07
 */
public enum ContactType {

    OWNER(CommonConstants.CONTACT_TYPE_OWNER, "contact.type.owner"),
    FAMILIAR(CommonConstants.CONTACT_TYPE_ACQUAINTANCE, "contact.type.acquaintance"),
    CANDIDATE(CommonConstants.CONTACT_TYPE_CANDIDATE, "contact.type.candidate"),
    CUSTOMER(CommonConstants.CONTACT_TYPE_CUSTOMER, "contact.type.customer"),
    DISTRIBUTOR(CommonConstants.CONTACT_TYPE_DISTRIBUTOR, "contact.type.distributor"),
    DROPPED_OUT(CommonConstants.CONTACT_TYPE_DROPPED_OUT, "contact.type.dropped_out");

    private static final Map<Integer, ContactType> MAP = new HashMap<Integer, ContactType>();

    static {
        for (ContactType contactType : ContactType.values()) {
            MAP.put(contactType.getType(), contactType);
        }
    }

    private final Integer type;
    private final String key;
    private String labelKey;

    ContactType(Integer type, String key) {
        this.type = type;
        this.key = key;
    }

    public static ContactType getEnum(Integer type) {
        return MAP.get(type);
    }

    public Integer getType() {
        return type;
    }

    public String getKey() {
        return key;
    }

    public String getLabelKey() {
        return labelKey;
    }

    public void setLabelKey(String labelKey) {
        this.labelKey = labelKey;
    }
}
