package com.example.tallercompumovil;

public class County {
    String Name;
    String Alpha2Code;
    String Alpha3Code;
    String NativeName;
    String Region;
    String SubRegion;
    String Latitude;
    String Longitude;
    int Area;
    int NumericCode;
    String NativeLanguage;
    String CurrencyCode;
    String CurrencyName;
    String CurrencySymbol;
    String Flag;
    String FlagPng;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAlpha2Code() {
        return Alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        Alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return Alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        Alpha3Code = alpha3Code;
    }

    public String getNativeName() {
        return NativeName;
    }

    public void setNativeName(String nativeName) {
        NativeName = nativeName;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getSubRegion() {
        return SubRegion;
    }

    public void setSubRegion(String subRegion) {
        SubRegion = subRegion;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int area) {
        Area = area;
    }

    public int getNumericCode() {
        return NumericCode;
    }

    public void setNumericCode(int numericCode) {
        NumericCode = numericCode;
    }

    public String getNativeLanguage() {
        return NativeLanguage;
    }

    public void setNativeLanguage(String nativeLanguage) {
        NativeLanguage = nativeLanguage;
    }

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        CurrencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return CurrencyName;
    }

    public void setCurrencyName(String currencyName) {
        CurrencyName = currencyName;
    }

    public String getCurrencySymbol() {
        return CurrencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        CurrencySymbol = currencySymbol;
    }

    public String getFlag() {
        return Flag;
    }

    public void setFlag(String flag) {
        Flag = flag;
    }

    public String getFlagPng() {
        return FlagPng;
    }

    public void setFlagPng(String flagPng) {
        FlagPng = flagPng;
    }

    @Override
    public String toString() {
        return "County{" +
                "Name='" + Name + '\'' +
                ", Alpha2Code='" + Alpha2Code + '\'' +
                ", Alpha3Code='" + Alpha3Code + '\'' +
                ", NativeName='" + NativeName + '\'' +
                ", Region='" + Region + '\'' +
                ", SubRegion='" + SubRegion + '\'' +
                ", Latitude='" + Latitude + '\'' +
                ", Longitude='" + Longitude + '\'' +
                ", Area=" + Area +
                ", NumericCode=" + NumericCode +
                ", NativeLanguage='" + NativeLanguage + '\'' +
                ", CurrencyCode='" + CurrencyCode + '\'' +
                ", CurrencyName='" + CurrencyName + '\'' +
                ", CurrencySymbol='" + CurrencySymbol + '\'' +
                ", Flag='" + Flag + '\'' +
                ", FlagPng='" + FlagPng + '\'' +
                '}';
    }
}
