package by.asyncbtd.tl.objects;

public class ChatLocation {

    private Location location;
    private String address;

    public Location getLocation() {
        return location;
    }

    public String getAddress() {
        return address;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "ChatLocation(location=" + this.getLocation() +
                ", address=" + this.getAddress() + ")";
    }

    public ChatLocation(){
    }

    public ChatLocation(Location location, String address) {
        this.location = location;
        this.address = address;
    }
}
