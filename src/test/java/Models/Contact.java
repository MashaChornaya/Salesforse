package Models;

import Enums.Rating;
import Enums.Salutation;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;
@Data
@Builder

public class Contact {
    private  String firstName;
    private  String lastName;
    private  Salutation salutation;
    private  String accountName;
    private  String title;
    private  String phone;
    private  String mobile;
    private  String email;
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
        Contact contact = (Contact) o;
        return Objects.equals(getFullName(), contact.getFullName()) && Objects.equals(accountName, contact.accountName) && Objects.equals(title,contact.title) && Objects.equals(email, contact.email) && Objects.equals(phone, contact.phone) && Objects.equals(mobile, contact.mobile);
    }

}
