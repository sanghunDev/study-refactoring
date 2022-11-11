package me.whiteship.refactoring._08_shotgun_surgery._29_inline_class;

public class Shipment {

    /**
     * 인라인 클래스 리팩토링 사용
     * TrackingInformation 클래스에서 사용하던 부분을 제거, TrackingInformation 클래스는 불필요하게 됨
     */


    private String shippingCompany;

    private String trackingNumber;

    public Shipment(String shippingCompany, String trackingNumber) {
        this.shippingCompany = shippingCompany;
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingInfo() {
        return this.shippingCompany + ": " + this.trackingNumber;
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

}
