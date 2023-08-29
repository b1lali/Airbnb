package User;

public class Address {
private static int counter =1;
    private int id;
    private String province;
   private String region;
   private String address;

    public Address( String province, String region, String address) {
        this.id =counter++;
        this.province = province;
        this.region = region;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", region='" + region + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
