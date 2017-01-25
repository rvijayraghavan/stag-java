package com.vimeo.sample.model;


import com.google.gson.annotations.SerializedName;
import com.vimeo.stag.UseStag;

/**
 * Model class to demonstrate the usage of FIELD_OPTION_SERIALIZED_NAME with SerializedName
 */
@UseStag(UseStag.FIELD_OPTION_SERIALIZED_NAME)
public class FieldOptionsSerializedName {

    public int simpleInt;

    @SerializedName("simpleFloat")
    public float simpleFloat;

    @SerializedName("simpleShort")
    public short simpleShort;

    @SerializedName("simpleLong")
    public long simpleLong;

    @SerializedName("simpleDouble")
    public double simpleDouble;
}