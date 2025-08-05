package lloyd.springdemo.mvc;


import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    //add validation for lastName
    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String lastName = "";

    //add a number range
    @NotNull(message = "is required")
    @Min(value = 0, message="must be greater than 0")
    @Max(value = 10, message="must be equal or less than 10")
    private Integer freePasses;

    //add a postal code field
    @Pattern(regexp = "^[a-zA-z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
