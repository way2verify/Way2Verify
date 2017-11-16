# Way2Verify


# Installation :

# Android Studio (or Gradle)

No need to clone the repository or download any files -- just add this line to your app's build.gradle inside the dependencies section:


        compile 'sun.way2online.way2verify:way2verify:1.0.1'

Note: We recommend  you to use


        compile 'sun.way2online.way2verify:way2verify:1.+'


Firstly to use this library you need to generete your application token from http://way2verify.com

# Creating Token
To generate your token please do follow the below steps:

        1.logon to http://way2verify.com

        2.register with your details

        3.login with your credentials

        4.create an android application with following feilds

        . Application name

        . Your_PackageName

        . PlayStore URL





# Usage :

By calling library's method "Way2VerifyLib.initialize(Context context, String token,int YOUR_LOGO,String "YOUR_THEME_COLOR", String "YOUR_TEXT_COLOR");"
in your appliction where you want to verify the user mobile number with OTP.

     Way2VerifyLib.initialize(YOUR_CONTEXT,"YOUR_TOKEN","YOUR_LOGO","YOUR_THEME_COLOR","YOUR_TEXT_COLOR");


     here YOUR_CONTEXT is your application context

     here YOUR_TOKEN is your registered application token from http://way2verify.com

     here YOUR_LOGO is the Image resource id, you want to display in login screen(Ex: R.mipmap.ic_launcher).

     here YOUR_THEME_COLOR is your application theme color(Ex: "#e35657").

     here YOUR_TEXT_COLOR is the text color you need to display on button text(Ex: "#ffffff").





implement Way2LoginCallbacks in the same Activity where you are calling above initialize method, so that Callback methods will be overriden and you can redirect the user accourdingly with success, failure and close functions accordingly.


MainActivity extends AppCompatActivity implements Way2LoginCallbacks

    @Override
         public void onLoginSuccess(String iso, String number) {
           //TODO for successfully login with mobile number and here iso(country code) and number(mobile number registered) are the values provided.
		...Redirect Accordingly

        }

        @Override
        public void onLoginFailure(String message) {
            //TODO for login failure with message.
		...Redirect Accordingly

        }

        @Override
            public void onCloseClicked(String message) {
            //TODO for close action.
                ...Redirect Accordingly
            }

# Screenshots

[![login ](https://github.com/way2verify/Way2Verify/blob/master/screens/login_screen.png)](https://github.com/way2verify/Way2Verify/blob/master/screens/login_screen.png)
[![otp](https://github.com/way2verify/Way2Verify/blob/master/screens/otp_screen.png)](https://github.com/way2verify/Way2Verify/blob/master/screens/otp_screen.png)

# Note

    It is mandatory to use google play serveices minimum 11.0.1 or higher version in your application.


       compile 'com.google.android.gms:play-services:11.0.1'



By using Way2Verify library you can verify the user mobile number with OTP.
