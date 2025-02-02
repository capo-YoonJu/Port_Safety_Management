package com.example.tmap_ex;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class StateUpdateRequest extends StringRequest {
    final static private String URL = " ** php **";
    private Map<String, String> parameters;

    public StateUpdateRequest(String latitude, String longitude, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.POST, URL, listener, errorListener);
        parameters = new HashMap<>();
        parameters.put("latitude", latitude);
        parameters.put("longitude", longitude);
    }

    @Override
    public Map<String, String> getParams() {
        return parameters;
    }
}
