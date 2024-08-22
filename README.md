#  Basic ViewModel App

This is a sample Android application that demonstrates how to use the view model and the livedata.

## Getting Started

View model is helpful in persisting the configuration changes that are made to the app .
Live data is the container that holds the data and whenever tha changes where made the UI changes the data and update the UI as per the changes made to the UI .
step 1 First we need to have the mutablelivedata and mention the type 
step 2  We need to have the init block 
step 3  We need to have the livedata for holding of the updates 
step 4  Observing the live data we need to declare that in the main activity 
### Prerequisites

We need to mention the
buildFeatures {
dataBinding=true
viewBinding=true
}
// this lines we have to mention in the build gradle file (applevel)
```bash
Example: Android Studio, Java JDK 8, etc.
