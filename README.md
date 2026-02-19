# StackExchange

An Android app for searching and viewing StackExchange user profiles, built with Kotlin and Jetpack Compose.

## Tech Stack

- **Language:** Kotlin
- **UI:** Jetpack Compose + Material 3
- **Architecture:** MVI (Model-View-Intent)
- **DI:** Hilt
- **Networking:** Retrofit + Moshi + OkHttp
- **Image Loading:** Coil
- **Navigation:** Navigation Compose

## Project Structure

```
app/src/main/java/com/example/stackexchange/
├── data/
│   ├── api/            # StackExchange API service
│   ├── model/          # Data models
│   └── repository/     # Data repositories
├── di/                 # Hilt dependency injection modules
├── navigation/         # Navigation graph and screen routes
├── presentation/
│   ├── base/           # Base ViewModel
│   ├── components/
│   │   ├── atoms/      # Basic UI components (Button, Card, TextField, TopBar)
│   │   └── molecules/  # Composite UI components (UserListItem, ErrorState, etc.)
│   ├── search/         # User search screen
│   └── detail/         # User detail screen
└── ui/theme/           # Theme, colors, typography, spacing
```

## Requirements

- Android Studio
- Min SDK 24 (Android 7.0)
- JDK 17

## Build & Run

```bash
./gradlew assembleDebug
```
# stack-exchange
