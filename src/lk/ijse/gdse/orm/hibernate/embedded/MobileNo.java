package lk.ijse.gdse.orm.hibernate.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MobileNo {
    @Column(name="mobile_no_type")
    private String type;
    @Column(name = "mobile_no")
    private String mobileNo;

    public MobileNo(){}

    public MobileNo(String type, String mobileNo) {
        this.type = type;
        this.mobileNo = mobileNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "MobileNo{" +
                "type='" + type + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }


}
