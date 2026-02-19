package com.example.stackexchange.data.repository;

import com.example.stackexchange.data.api.StackExchangeApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<StackExchangeApiService> apiServiceProvider;

  public UserRepository_Factory(Provider<StackExchangeApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public UserRepository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static UserRepository_Factory create(
      Provider<StackExchangeApiService> apiServiceProvider) {
    return new UserRepository_Factory(apiServiceProvider);
  }

  public static UserRepository newInstance(StackExchangeApiService apiService) {
    return new UserRepository(apiService);
  }
}
