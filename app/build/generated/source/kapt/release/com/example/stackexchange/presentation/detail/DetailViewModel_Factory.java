package com.example.stackexchange.presentation.detail;

import androidx.lifecycle.SavedStateHandle;
import com.squareup.moshi.Moshi;
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
public final class DetailViewModel_Factory implements Factory<DetailViewModel> {
  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<Moshi> moshiProvider;

  public DetailViewModel_Factory(Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<Moshi> moshiProvider) {
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.moshiProvider = moshiProvider;
  }

  @Override
  public DetailViewModel get() {
    return newInstance(savedStateHandleProvider.get(), moshiProvider.get());
  }

  public static DetailViewModel_Factory create(Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<Moshi> moshiProvider) {
    return new DetailViewModel_Factory(savedStateHandleProvider, moshiProvider);
  }

  public static DetailViewModel newInstance(SavedStateHandle savedStateHandle, Moshi moshi) {
    return new DetailViewModel(savedStateHandle, moshi);
  }
}
