-if class com.example.stackexchange.data.model.User
-keepnames class com.example.stackexchange.data.model.User
-if class com.example.stackexchange.data.model.User
-keep class com.example.stackexchange.data.model.UserJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.example.stackexchange.data.model.User
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.example.stackexchange.data.model.User
-keepclassmembers class com.example.stackexchange.data.model.User {
    public synthetic <init>(long,java.lang.String,int,java.lang.String,java.lang.String,long,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
