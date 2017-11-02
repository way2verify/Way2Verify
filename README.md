# Way2Verify


# Installation :

# Android Studio (or Gradle)

No need to clone the repository or download any files -- just add this line to your app's build.gradle inside the dependencies section:

    ```
        compile 'sun.way2online.way2verify:way2verify:0.0.2'
    ```
Note: We recommend that you don't use
    ```
        compile 'sun.way2online.way2verify:way2verify:+'
    ```
  as future versions of the SDK may not maintain full backwards compatibility. When such a change occurs, a major version number change will accompany it.

# Usage :


Call library's initialize(Context,token) in your appliction (i.e, where you want to validate through Way2Verify)
with context ,token and package name as parameters

    ```
        Way2VerifyLib.initialize(MainActivity.this,token);
    ```
here Token is YOUR_TOKEN which you will get once you registered with us.


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
    ```
Call library's logout(Context context) in your appliction (i.e, where you want to logout )

 ```
         Way2VerifyLib.logout(SuccessScreenActivity.this);

         ... redirect accordingly
    ```

By using Way2Verify library you can validate the user with single click
