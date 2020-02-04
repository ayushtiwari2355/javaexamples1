public class Address{
    private String houseNo;
    private String street;
    private String city;
    private int zipcode;
    public Address(String houseNo, String street, String city, int zipcode ){
        this.houseNo= houseNo;
        this.street=street;
        this.city=city;
        this.zipcode=zipcode;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}