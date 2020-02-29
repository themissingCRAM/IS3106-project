/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author root
 */
@Entity
public class BankAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BankAccountID;
    @NotNull
    @Size(min = 1, max = 50)
    private String accountNumber;
    @Future
    @NotNull
    private String expiryDate;
    @NotNull
    @Size(min = 1, max = 100)
    private String nameOnCard;
    @NotNull
    @Digits(integer = 3, fraction = 0)
    private int backCode;
    //TODO: Add relational mapping

    public Long getBankAccountID() {
        return BankAccountID;
    }

    public void setBankAccountID(Long BankAccountID) {
        this.BankAccountID = BankAccountID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (BankAccountID != null ? BankAccountID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the BankAccountID fields are not set
        if (!(object instanceof BankAccount)) {
            return false;
        }
        BankAccount other = (BankAccount) object;
        if ((this.BankAccountID == null && other.BankAccountID != null) || (this.BankAccountID != null && !this.BankAccountID.equals(other.BankAccountID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.entity.BankAccount[ id=" + BankAccountID + " ]";
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the expiryDate to set
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return the nameOnCard
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * @param nameOnCard the nameOnCard to set
     */
    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    /**
     * @return the backCode
     */
    public int getBackCode() {
        return backCode;
    }

    /**
     * @param backCode the backCode to set
     */
    public void setBackCode(int backCode) {
        this.backCode = backCode;
    }

}