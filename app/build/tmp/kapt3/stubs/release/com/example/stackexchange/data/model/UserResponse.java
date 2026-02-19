package com.example.stackexchange.data.model;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/example/stackexchange/data/model/UserResponse;", "", "items", "", "Lcom/example/stackexchange/data/model/User;", "hasMore", "", "quotaMax", "", "quotaRemaining", "(Ljava/util/List;ZII)V", "getHasMore", "()Z", "getItems", "()Ljava/util/List;", "getQuotaMax", "()I", "getQuotaRemaining", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "app_release"})
public final class UserResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.stackexchange.data.model.User> items = null;
    private final boolean hasMore = false;
    private final int quotaMax = 0;
    private final int quotaRemaining = 0;
    
    public UserResponse(@com.squareup.moshi.Json(name = "items")
    @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.stackexchange.data.model.User> items, @com.squareup.moshi.Json(name = "has_more")
    boolean hasMore, @com.squareup.moshi.Json(name = "quota_max")
    int quotaMax, @com.squareup.moshi.Json(name = "quota_remaining")
    int quotaRemaining) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.stackexchange.data.model.User> getItems() {
        return null;
    }
    
    public final boolean getHasMore() {
        return false;
    }
    
    public final int getQuotaMax() {
        return 0;
    }
    
    public final int getQuotaRemaining() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.stackexchange.data.model.User> component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.stackexchange.data.model.UserResponse copy(@com.squareup.moshi.Json(name = "items")
    @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.stackexchange.data.model.User> items, @com.squareup.moshi.Json(name = "has_more")
    boolean hasMore, @com.squareup.moshi.Json(name = "quota_max")
    int quotaMax, @com.squareup.moshi.Json(name = "quota_remaining")
    int quotaRemaining) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}