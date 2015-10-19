package by.goncharov.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

/**
 * Description of User class
 *
 * @author Mikita Hancharou
 * @created 23.05.13 12:47
 */
@Entity
@Table(name = "users")
public class User extends AbstractEntity implements Serializable {

    @Column(unique = true, name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_role_id", nullable = false)
    private Role role;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "charges_id", nullable = true)
    private Set<Expenses> expensesSet;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id", nullable = true)
    private Set<Contact> contactSet;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "aim_id", nullable = true)
    private Set<Aim> aimSet;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<Expenses> getExpensesSet() {
        return expensesSet;
    }

    public void setExpensesSet(Set<Expenses> expensesSet) {
        this.expensesSet = expensesSet;
    }

    public Set<Contact> getContactSet() {
        return contactSet;
    }

    public void setContactSet(Set<Contact> contactSet) {
        this.contactSet = contactSet;
    }

    public Set<Aim> getAimSet() {
        return aimSet;
    }

    public void setAimSet(Set<Aim> aimSet) {
        this.aimSet = aimSet;
    }
}
