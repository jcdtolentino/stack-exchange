package com.example.stackexchange.di;

import com.example.stackexchange.data.api.StackExchangeApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class NetworkModule_ProvideStackExchangeApiServiceFactory implements Factory<StackExchangeApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideStackExchangeApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public StackExchangeApiService get() {
    return provideStackExchangeApiService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideStackExchangeApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideStackExchangeApiServiceFactory(retrofitProvider);
  }

  public static StackExchangeApiService provideStackExchangeApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideStackExchangeApiService(retrofit));
  }
}
