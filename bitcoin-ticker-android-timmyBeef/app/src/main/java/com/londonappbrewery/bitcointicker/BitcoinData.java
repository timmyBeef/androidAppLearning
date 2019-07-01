package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinData {

    // TODO: Declare the member variables here
    String mLast;

    // TODO: Create a WeatherDataModel from a JSON:
    public static BitcoinData formJson(JSONObject json) {
        BitcoinData data = new BitcoinData();
        try {
            data.mLast = json.getString("last");

            return data;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }


    public String getLast() {
        return mLast;
    }

}
