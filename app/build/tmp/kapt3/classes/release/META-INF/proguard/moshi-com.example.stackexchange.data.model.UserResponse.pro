-if class com.example.stackexchange.data.model.UserResponse
-keepnames class com.example.stackexchange.data.model.UserResponse
-if class com.example.stackexchange.data.model.UserResponse
-keep class com.example.stackexchange.data.model.UserResponseJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
