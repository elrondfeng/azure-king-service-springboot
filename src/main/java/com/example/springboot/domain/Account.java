package com.example.springboot.domain;

import java.sql.Date;
import java.util.Objects;

public class Account {

    String premiseStateCd;
    Integer accountId;
    char testOrControlIndicator;
    Date partBeginDate;

    public String getPremiseStateCd() {
        return premiseStateCd;
    }

    public void setPremiseStateCd(String premiseStateCd) {
        this.premiseStateCd = premiseStateCd;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public char getTestOrControlIndicator() {
        return testOrControlIndicator;
    }

    public void setTestOrControlIndicator(char testOrControlIndicator) {
        this.testOrControlIndicator = testOrControlIndicator;
    }

    public Date getPartBeginDate() {
        return partBeginDate;
    }

    public void setPartBeginDate(Date partBeginDate) {
        this.partBeginDate = partBeginDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return getTestOrControlIndicator() == account.getTestOrControlIndicator() &&
                Objects.equals(getPremiseStateCd(), account.getPremiseStateCd()) &&
                Objects.equals(getAccountId(), account.getAccountId()) &&
                Objects.equals(getPartBeginDate(), account.getPartBeginDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPremiseStateCd(), getAccountId(), getTestOrControlIndicator(), getPartBeginDate());
    }

    @Override
    public String toString() {
        return "Account{" +
                "premiseStateCd='" + premiseStateCd + '\'' +
                ", accountId=" + accountId +
                ", testOrControlIndicator=" + testOrControlIndicator +
                ", partBeginDate=" + partBeginDate +
                '}';
    }
}
