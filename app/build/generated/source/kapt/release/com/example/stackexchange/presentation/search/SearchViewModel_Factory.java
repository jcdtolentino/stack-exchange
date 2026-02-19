package com.example.stackexchange.presentation.search;

import com.example.stackexchange.data.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public SearchViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static SearchViewModel_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new SearchViewModel_Factory(userRepositoryProvider);
  }

  public static SearchViewModel newInstance(UserRepository userRepository) {
    return new SearchViewModel(userRepository);
  }
}
