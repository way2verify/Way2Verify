# Way2Verify


# Installation :

# Android Studio (or Gradle)

No need to clone the repository or download any files -- just add this line to your app's build.gradle inside the dependencies section:

# compile 'sun.way2online.way2verify:way2verify:0.0.2'

Note: We recommend that you don't use compile 'sun.way2online.way2verify:way2verify:+, as future versions of the SDK may not maintain full backwards compatibility. When such a change occurs, a major version number change will accompany it.

Call library's initialize(Context,token, packageName) in your appliction (i.e, where you want to validate through Way2Verify)
with context ,token and package name as parameters

here Token is YOUR_TOKEN which you will get once you registered with us.





Call library's logout(Context context) in your appliction (i.e, where you want to logout )

# Provide
Read_Phone_State and Contacts Permission to use the Library




# Usage :

By using Way2Verify library you can validate the user with single click
