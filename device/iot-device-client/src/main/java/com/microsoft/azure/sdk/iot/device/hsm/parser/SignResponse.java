/*
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.microsoft.azure.sdk.iot.device.hsm.parser;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SignResponse
{
    private static final String DIGEST_NAME = "digest";
    @Expose(serialize = false, deserialize = true)
    @SerializedName(DIGEST_NAME)
    private byte[] digest;

    public byte[] getDigest()
    {
        // Codes_SRS_HTTPHSMSIGNRESPONSE_34_001: [This function shall return the saved digest.]
        return digest;
    }

    //empty constructor for Gson to use
    public SignResponse() { }

    public static SignResponse fromJson(String json)
    {
        return new GsonBuilder().create().fromJson(json, SignResponse.class);
    }
}
