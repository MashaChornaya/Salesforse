package Models;

import Enums.*;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;
@Data
@Builder

public class Account {
    private  String accountName;
    private  String phone;
    private  String parentAccount ;
    private  String website;
    private  String fax;
    private  Type type;
    private  Industry industry;
    private  String employees;
    private  String annualRevenue;
    private  String description;
    private  String billingStreet;
    private  String shippingStreet;


    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountName, account.accountName)&& Objects.equals(phone, account.phone) && Objects.equals(parentAccount, account.parentAccount)   && Objects.equals(website, account.website)&& Objects.equals(fax, account.fax) && type == account.type &&Objects.equals(industry,account.industry)&&  Objects.equals(employees,account.employees)&& Objects.equals(annualRevenue,account.annualRevenue)&& Objects.equals(description,account.description)&& Objects.equals(billingStreet,account.billingStreet)&& Objects.equals(shippingStreet,account.shippingStreet);
    }

}



