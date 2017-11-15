# Way2Verify


# Installation :

# Android Studio (or Gradle)

No need to clone the repository or download any files -- just add this line to your app's build.gradle inside the dependencies section:

    ```
        compile 'sun.way2online.way2verify:way2verify:0.0.44'
    ```
Note: We recommend that you don't use
    ```
        compile 'sun.way2online.way2verify:way2verify:+'
    ```
  as future versions of the SDK may not maintain full backwards compatibility. When such a change occurs, a major version number change will accompany it.

# Usage :


Call library's initialize(Context,token) in your appliction (i.e, where you want to validate through Way2Verify)
with context and token  as parameters, if you want to use Library's THEME and COLORs



    ```
        Way2VerifyLib.initialize(MainActivity.this,token);
    ```
here Token is YOUR_TOKEN which you will get once you registered with http://way2verify.com site with your app.


Call library's initialize(Context,token,YOUR_LOGO,"YOUR_THEME_COLOR","YOUR_TEXT_COLOR"); in your appliction (i.e, where you want to validate through Way2Verify)
with context and token  as parameters, if you want to use Custom THEME and COLORs



    ```
        Way2VerifyLib.initialize(MainActivity.this,token,R.mipmap.ic_launcher,"YOUR_THEME_COLOR","YOUR_TEXT_COLOR");
    ```

implement  Way2LoginCallbacks so that Callback methods will be overriden and can redirect to succes and failure activity accordingly

    ```
        MainActivity extends AppCompatActivity implements Way2LoginCallbacks

        @Override
            public void onLoginSuccess() {
                Toast.makeText(this, "onLoginSuccess", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(this,SuccessScreenActivity.class));
            }

            @Override
            public void onLoginFailure() {
                Toast.makeText(this, "onLoginFailure", Toast.LENGTH_SHORT).show();

            }

            @Override
                public void onCloseClicked(String message) {
                    ...Redirect Accordingly
                }
    ```

# Note

    We recommand you to use google play serveices to version equivalent or greater than 11.0.1

    ```
       compile 'com.google.android.gms:play-services-auth:11.0.1'

    ```

By using Way2Verify library you can validate the user with single click
