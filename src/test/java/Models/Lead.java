package Models;

import Enums.*;

import java.util.Objects;

public class Lead {
    private final String firstName;
    private final String lastName;
    private final String company;
    private final Salutation salutation;
    private final Rating rating;
    private final String email;
    private final String phone;
    private final String title;
    private final String leadStatus;
    private final String website;
    private final String city;
    private final String stateProvince;
    private final String zipPostalCode;
    private final String country;
    private final String noOfEmployees;
    private final String annualRevenue;
    private final LeadSource leadSource;
    private final String fullName;

    private Lead(LeadBuilder leadBuilder) {
        this.firstName = leadBuilder.firstName;
        this.lastName = leadBuilder.lastName;
        this.company = leadBuilder.company;
        this.salutation = leadBuilder.salutation;
        this.rating = leadBuilder.rating;
        this.phone = leadBuilder.phone;
        this.email = leadBuilder.email;
        this.title = leadBuilder.title;
        this.leadStatus = leadBuilder.leadStatus;
        this.website = leadBuilder.website;
        this.city = leadBuilder.city;
        this.stateProvince = leadBuilder.stateProvince;
        this.zipPostalCode = leadBuilder.zipPostalCode;
        this.country = leadBuilder.country;
        this.noOfEmployees = leadBuilder.noOfEmployees;
        this.annualRevenue = leadBuilder.annualRevenue;
        this.leadSource = leadBuilder.leadSource;
        this.fullName = leadBuilder.fullName;
    }

        public static class LeadBuilder {
            private final String lastName;
            private final String company;
            private final String leadStatus;
            private String firstName;
            private Salutation salutation;
            private Rating rating;
            private String email;
            private String phone;
            private String fullName;
            private String title;
            private String website;
            private String city;
            private String stateProvince;
            private String zipPostalCode;
            private String country;
            private String noOfEmployees;
            private String annualRevenue;
            private LeadSource leadSource;


            public LeadBuilder(String company, String leadStatus, String lastName) {
                this.company = company;
                this.leadStatus = leadStatus;
                this.lastName = lastName;
            }

            public Lead build() {
                return new Lead(this);
            }

            public LeadBuilder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            public LeadBuilder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            public LeadBuilder salutation(Salutation salutation) {
                this.salutation = salutation;
                return this;
            }

            public LeadBuilder leadSource(LeadSource leadSource) {
                this.leadSource = leadSource;
                return this;
            }

            public LeadBuilder rating(Rating rating) {
                this.rating = rating;
                return this;
            }

            public LeadBuilder email(String email) {
                this.email = email;
                return this;
            }

            public LeadBuilder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public LeadBuilder title(String title) {
                this.title = title;
                return this;
            }

            public LeadBuilder website(String website) {
                this.website = website;
                return this;
            }

            public LeadBuilder city(String city) {
                this.city = city;
                return this;
            }

            public LeadBuilder stateProvince(String stateProvince) {
                this.stateProvince = stateProvince;
                return this;
            }

            public LeadBuilder zipPostalCode(String zipPostalCode) {
                this.zipPostalCode = zipPostalCode;
                return this;
            }

            public LeadBuilder country(String country) {
                this.country = country;
                return this;
            }

            public LeadBuilder noOfEmployees(String noOfEmployees) {
                this.noOfEmployees = noOfEmployees;
                return this;
            }

            public LeadBuilder annualRevenue(String annualRevenue) {
                this.annualRevenue = annualRevenue;
                return this;
            }
        }
        public String getCompany () {
             return company;
        }
        public Salutation getSalutation() {
             return salutation;
        }
        public Rating getRating() {
             return rating;
        }
        public String getTitle() {
              return title;
        }
        public String getWebsite() {
             return website;
        }
        public String getCity() {
             return city;
        }
        public String getStateProvince() {
            return stateProvince;
        }
        public String getZipPostalCode() {
            return zipPostalCode;
        }
        public String getCountry() {
            return country;
        }
        public String getNoOfEmployees() {
            return noOfEmployees;
        }
        public String getAnnualRevenue() {
            return annualRevenue;
        }
        public LeadSource getLeadSource() {
            return leadSource;
        }
        public String getLeadStatus () {return leadStatus; }
        public String getEmail () {
            return email;
        }
        public String getPhone () {
            return phone;
        }
        public String getFirstName () {
            return firstName;
        }
        public String getLastName () {
            return lastName;
        }
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

        @Override
        public int hashCode () {
            return Objects.hash(firstName, lastName, company, salutation, rating, email, phone, leadStatus,title,website,city,zipPostalCode,noOfEmployees,leadSource,annualRevenue);
        }

        @Override
        public String toString () {
            return "Lead{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", company='" + company + '\'' +
                    ", salutation=" + salutation +
                    ", rating=" + rating +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", status='" + leadStatus + '\'' +
                    ", title='" + title + '\'' +
                    ", website='" + website + '\'' +
                    ", city='" + city + '\'' +
                    ", zipPostalCode='" + zipPostalCode + '\'' +
                    ", noOfEmployees='" + noOfEmployees + '\'' +
                    ", leadSource='" + leadSource + '\'' +
                    ", annualRevenue='" + annualRevenue + '\'' +
                    '}';
        }
    }
