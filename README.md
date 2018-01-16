# android-kotlin-viewmodel-livedata

Simple score counter kotlin application.
Scores are stored with LiveData in ViewModel (from android architecture), so the current state won't loss at orientation change.

v1:
ViewModel is not injected with dagger.

v2:
Same as before but ViewModel is injected with dagger, and the ViewModel it has dependecy also.