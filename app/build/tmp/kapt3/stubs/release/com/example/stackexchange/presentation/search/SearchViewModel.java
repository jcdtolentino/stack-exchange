package com.example.stackexchange.presentation.search;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/stackexchange/presentation/search/SearchViewModel;", "Lcom/example/stackexchange/presentation/base/BaseViewModel;", "Lcom/example/stackexchange/presentation/search/SearchIntent;", "Lcom/example/stackexchange/presentation/search/SearchState;", "Lcom/example/stackexchange/presentation/search/SearchEffect;", "userRepository", "Lcom/example/stackexchange/data/repository/UserRepository;", "(Lcom/example/stackexchange/data/repository/UserRepository;)V", "createInitialState", "handleIntent", "", "intent", "loadUsers", "name", "", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SearchViewModel extends com.example.stackexchange.presentation.base.BaseViewModel<com.example.stackexchange.presentation.search.SearchIntent, com.example.stackexchange.presentation.search.SearchState, com.example.stackexchange.presentation.search.SearchEffect> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.stackexchange.data.repository.UserRepository userRepository = null;
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.example.stackexchange.data.repository.UserRepository userRepository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.stackexchange.presentation.search.SearchState createInitialState() {
        return null;
    }
    
    @java.lang.Override()
    public void handleIntent(@org.jetbrains.annotations.NotNull()
    com.example.stackexchange.presentation.search.SearchIntent intent) {
    }
    
    private final void loadUsers(java.lang.String name) {
    }
}