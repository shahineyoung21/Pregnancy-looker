# superG Agent

An Android medical application with AI agent support for MyBrotherMedical.

## Project Structure
```
superG_Agent/
├── agent/              # Agent definitions
├── medical/            # Medical domain logic
├── android/            # Android app implementation
│   ├── app/           # Main app module
│   ├── build.gradle   # Root build configuration
│   └── settings.gradle # Project settings
└── .github/workflows/  # CI/CD workflows
```

## Building
```bash
cd android
./gradlew assembleDebug
```
