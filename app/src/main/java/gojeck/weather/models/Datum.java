
package gojeck.weather.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Datum {

    @SerializedName("List")
    private java.util.List<gojeck.weather.models.List> mList;
    @SerializedName("RowCount")
    private Double mRowCount;
    @SerializedName("SaloonType")
    private String mSaloonType;

    public java.util.List<gojeck.weather.models.List> getList() {
        return mList;
    }

    public void setList(java.util.List<gojeck.weather.models.List> list) {
        mList = list;
    }

    public Double getRowCount() {
        return mRowCount;
    }

    public void setRowCount(Double rowCount) {
        mRowCount = rowCount;
    }

    public String getSaloonType() {
        return mSaloonType;
    }

    public void setSaloonType(String saloonType) {
        mSaloonType = saloonType;
    }

}
