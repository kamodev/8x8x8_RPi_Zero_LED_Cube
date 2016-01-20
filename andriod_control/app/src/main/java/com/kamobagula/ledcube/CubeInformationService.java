package com.kamobagula.ledcube;

import android.app.IntentService;
import android.content.Intent;

public class CubeInformationService extends IntentService {

    // Constructor
    public CubeInformationService() {
        super("CubeInformationService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String cubeData = intent.getDataString();

    }
}
