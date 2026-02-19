package com.example.stackexchange.presentation.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u00020\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\r\u0010\u001a\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0013J\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00028\u0002H\u0004\u00a2\u0006\u0002\u0010 J!\u0010!\u001a\u00020\u001c2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010#\u00a2\u0006\u0002\b$H\u0004R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00028\u00018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006%"}, d2 = {"Lcom/example/stackexchange/presentation/base/BaseViewModel;", "Intent", "Lcom/example/stackexchange/presentation/base/UiIntent;", "State", "Lcom/example/stackexchange/presentation/base/UiState;", "Effect", "Lcom/example/stackexchange/presentation/base/UiEffect;", "Landroidx/lifecycle/ViewModel;", "()V", "_effect", "Lkotlinx/coroutines/channels/Channel;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "effect", "Lkotlinx/coroutines/flow/Flow;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;", "initialState", "getInitialState", "()Lcom/example/stackexchange/presentation/base/UiState;", "initialState$delegate", "Lkotlin/Lazy;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "createInitialState", "handleIntent", "", "intent", "(Lcom/example/stackexchange/presentation/base/UiIntent;)V", "sendEffect", "(Lcom/example/stackexchange/presentation/base/UiEffect;)V", "setState", "reducer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "app_release"})
public abstract class BaseViewModel<Intent extends com.example.stackexchange.presentation.base.UiIntent, State extends com.example.stackexchange.presentation.base.UiState, Effect extends com.example.stackexchange.presentation.base.UiEffect> extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy initialState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<State> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<State> state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.channels.Channel<Effect> _effect = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<Effect> effect = null;
    
    public BaseViewModel() {
        super();
    }
    
    private final State getInitialState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract State createInitialState();
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<State> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<Effect> getEffect() {
        return null;
    }
    
    public abstract void handleIntent(@org.jetbrains.annotations.NotNull()
    Intent intent);
    
    protected final void setState(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super State, ? extends State> reducer) {
    }
    
    protected final void sendEffect(@org.jetbrains.annotations.NotNull()
    Effect effect) {
    }
}