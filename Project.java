public class Project {

    // Field. Attributes are defined in the field
    String projNum;
    String projName;
    String buildingType;
    String address;
    String erfNum;
    double fee;
    double amountPaid;
    String deadline;

    Person contractor;
    Person architect;
    Person customer;

    // Complete the constructor
    public Project(String projNum, String projName, String buildingType,String address,String erfNum,double fee, double amountPaid,String deadline,Person contractor,Person architect,Person customer
){
        this.projNum = projNum;
        this.projName = projName;
        this.buildingType = buildingType;
        this.address = address;
        this.erfNum = erfNum;
        this.fee = fee;
        this.amountPaid = amountPaid;
        this.deadline = deadline;
        this.architect = architect;
        this.contractor = contractor;
        this.customer = customer;
    }

    // define getters and setters

    public String getProjName() {
        return projName;
    }

    public String getProjNum() {
        return projNum;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public String getAddress() {
        return address;
    }

    public String getErfNum() {
        return erfNum;
    }

    public double getFee() {
        return fee;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public void setProjNum(String projNum) {
        this.projNum = projNum;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setErfNum(String erfNum) {
        this.erfNum = erfNum;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    // define toString
    @Override
    public String toString() {
        return "\nProject:" + '\n' +
                "Project Number = " + projNum + '\n' +
                "Project Name = " + projName + '\n' +
                "Building Type = " + buildingType + '\n' +
                "Address = " + address + '\n' +
                "Erf Num = " + erfNum + '\n' +
                "Fee = " + fee + '\n' +
                "Amount Paid = " + amountPaid + '\n' +
                "Deadline = " + deadline + '\n' +
                "Architect: " + architect + '\n' +
                "Contractor: " + contractor + '\n' +
                "Customer: " + customer + '\n' +
                "";
    }
}
