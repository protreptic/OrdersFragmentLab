package name.peterbukhal.android.ordersfragmentlab.server.api.json.request;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by
 * petronic on 10.05.16.
 */
public class RegisterDeviceRequestDeserializer implements JsonDeserializer<RegisterDeviceRequest> {

    @Override
    public RegisterDeviceRequest deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return null;
    }

}
