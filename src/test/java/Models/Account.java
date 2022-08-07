package Models;

import Enums.*;

import java.util.Objects;

public class Account {
    private final String accountName;
    private final String phone;
    private final String parentAccount ;
    private final String website;
    private final String fax;
    private final Type type;
    private final Industry industry;
    private final String employees;
    private final String annualRevenue;
    private final String description;
    private final String billingStreet;
    private final String shippingStreet;


    private Account(Account.AccountBuilder accountBuilder) {
        this.accountName = accountBuilder.accountName;
        this.phone = accountBuilder.phone;
        this.parentAccount = accountBuilder.parentAccount;
        this.website = accountBuilder.website;
        this.fax = accountBuilder.fax;
        this.type = accountBuilder.type;
        this.industry = accountBuilder.industry;
        this.employees = accountBuilder.employees;
        this.annualRevenue = accountBuilder.annualRevenue;
        this.description = accountBuilder.description;
        this.billingStreet = accountBuilder.billingStreet;
        this.shippingStreet = accountBuilder.shippingStreet;
    }
    public static class AccountBuilder {
        private final String accountName;
        private String phone;
        private String parentAccount;
        private String website;
        private String fax;
        private Type type;
        private Industry industry;
        private String employees;
        private String annualRevenue;
        private String description;
        private String billingStreet;
        private String shippingStreet;

        public AccountBuilder(String accountName) {
            this.accountName = accountName;
        }

        public Account build() {
            return new Account(this);
        }


        public Account.AccountBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Account.AccountBuilder parentAccount(String parentAccount) {
            this.parentAccount = parentAccount;
            return this;
        }
        public Account.AccountBuilder website(String website) {
            this.website = website;
            return this;
        }
        public Account.AccountBuilder fax(String fax) {
            this.fax = fax;
            return this;
        }
        public Account.AccountBuilder type(Type type) {
            this.type = type;
            return this;
        }
        public Account.AccountBuilder industry(Industry industry) {
            this.industry = industry;
            return this;
        }

        public Account.AccountBuilder employees(String employees) {
            this.employees = employees;
            return this;
        }

        public Account.AccountBuilder annualRevenue(String annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }
        public Account.AccountBuilder description(String description) {
            this.description = description;
            return this;
        }
        public Account.AccountBuilder billingStreet(String billingStreet) {
            this.billingStreet = billingStreet;
            return this;
        }
        public Account.AccountBuilder shippingStreet(String shippingStreet) {
            this.shippingStreet = shippingStreet;
            return this;
        }
    }

        public String getAccountName() {
            return accountName;
        }

        public String getPhone() {
            return phone;
        }

        public String getParentAccount() {
            return parentAccount;
        }

        public String getWebsite() {
            return website;
        }

        public String getFax() {
            return fax;
        }

        public Type getType() {
            return type;
        }

        public Industry getIndustry() {
            return industry;
        }

        public String getEmployees() {
            return employees;
        }

        public String getAnnualRevenue() {
            return annualRevenue;
        }

        public String getDescription() {
            return description;
        }

        public String getBillingStreet() {
            return billingStreet;
        }

        public String getShippingStreet() {
            return shippingStreet;
        }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountName, account.accountName)&& Objects.equals(phone, account.phone) && Objects.equals(parentAccount, account.parentAccount)   && Objects.equals(website, account.website)&& Objects.equals(fax, account.fax) && type == account.type &&Objects.equals(industry,account.industry)&&  Objects.equals(employees,account.employees)&& Objects.equals(annualRevenue,account.annualRevenue)&& Objects.equals(description,account.description)&& Objects.equals(billingStreet,account.billingStreet)&& Objects.equals(shippingStreet,account.shippingStreet);
    }

    @Override
    public int hashCode () {
        return Objects.hash(accountName, phone, parentAccount,website,fax,type,industry,employees,annualRevenue,description,billingStreet,shippingStreet);
    }

    @Override
    public String toString () {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", phone='" + phone + '\'' +
                ", parentAccount='" + parentAccount + '\'' +
                ", website='" + website + '\'' +
                ", fax='" + fax + '\'' +
                ", type=" + type +
                ", industry=" + industry +
                ", employees='" + employees + '\'' +
                ", annualRevenue='" + annualRevenue + '\'' +
                ", description='" + description + '\'' +
                ", billingStreet='" + billingStreet + '\'' +
                ", shippingStreet='" + shippingStreet + '\'' +
                '}';
    }
}



