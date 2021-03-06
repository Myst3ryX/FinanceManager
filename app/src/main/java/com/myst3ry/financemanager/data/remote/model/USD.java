package com.myst3ry.financemanager.data.remote.model;

import com.google.gson.annotations.SerializedName;

public final class USD {

    @SerializedName("Value")
    private Float mValue;

    @SerializedName("Previous")
    private Float mPreviousValue;

    @SerializedName("Nominal")
    private int mNominal;

    @SerializedName("CharCode")
    private String mCurrencyCode;

    public Float getValue() {
        return mValue;
    }

    public Float getPreviousValue() {
        return mPreviousValue;
    }

    public int getNominal() {
        return mNominal;
    }

    public String getCurrencyCode() {
        return mCurrencyCode;
    }
}