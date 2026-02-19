package com.example.stackexchange;

import com.squareup.moshi.Moshi;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<Moshi> moshiProvider;

  public MainActivity_MembersInjector(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<Moshi> moshiProvider) {
    return new MainActivity_MembersInjector(moshiProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectMoshi(instance, moshiProvider.get());
  }

  @InjectedFieldSignature("com.example.stackexchange.MainActivity.moshi")
  public static void injectMoshi(MainActivity instance, Moshi moshi) {
    instance.moshi = moshi;
  }
}
