package com.example.stackexchange.presentation.detail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/example/stackexchange/presentation/detail/DetailViewModel;", "Lcom/example/stackexchange/presentation/base/BaseViewModel;", "Lcom/example/stackexchange/presentation/detail/DetailIntent;", "Lcom/example/stackexchange/presentation/detail/DetailState;", "Lcom/example/stackexchange/presentation/detail/DetailEffect;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Landroidx/lifecycle/SavedStateHandle;Lcom/squareup/moshi/Moshi;)V", "createInitialState", "handleIntent", "", "intent", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class DetailViewModel extends com.example.stackexchange.presentation.base.BaseViewModel<com.example.stackexchange.presentation.detail.DetailIntent, com.example.stackexchange.presentation.detail.DetailState, com.example.stackexchange.presentation.detail.DetailEffect> {
    
    @javax.inject.Inject()
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.stackexchange.presentation.detail.DetailState createInitialState() {
        return null;
    }
    
    @java.lang.Override()
    public void handleIntent(@org.jetbrains.annotations.NotNull()
    com.example.stackexchange.presentation.detail.DetailIntent intent) {
    }
}