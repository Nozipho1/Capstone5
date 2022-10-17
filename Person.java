public class Person {

    // Field. Define attributes
    String name;
    String telephone;
    String email;
    String Address;

    // Complete the constructor
    public Person(String name, String telephone, String email, String archAddress){
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.Address = archAddress;
    }

    // define getters and setters
    public String getAddress() {
        return Address;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getTelephone() {
        return telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    // Define toString
    @Override
    public String toString() {
        return "\nName = " + name + '\n' +
                "Telephone = " + telephone + '\n' +
                "Email = " + email + '\n' +
                "Address = " + Address + '\n' +
                "";
    }
}
