package Models;

import Enums.*;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data//generate hash code and equals
@Builder

public class Lead {
    private  String firstName;
    private  String lastName;
    private  String company;
    private  Salutation salutation;
    private  Rating rating;
    private  String email;
    private  String phone;
    private  String title;
    private  String leadStatus;
    private  String website;
    private  String city;
    private  String stateProvince;
    private  String zipPostalCode;
    private  String country;
    private  String noOfEmployees;
    private  String annualRevenue;
    private  LeadSource leadSource;
    private Industry industry;
    private String street;
    private String description;
    private  String fullName;

        public String getFullName () {
            if (this.fullName != null) {
                return this.fullName;
            } else {
                return (this.salutation.getName() + " " + this.firstName + " " + this.lastName).trim();
            }
        }
        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Lead lead = (Lead) o;
            return Objects.equals(getFullName(), lead.getFullName()) && Objects.equals(company, lead.company) && rating == lead.rating && Objects.equals(email, lead.email) && Objects.equals(phone, lead.phone) && Objects.equals(leadStatus, lead.leadStatus);
        }

}

