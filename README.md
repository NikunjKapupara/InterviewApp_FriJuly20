# InterviewApp_FriJuly20
This is a repository for managing and sending the source code for the interview News App

Created on: Friday July 20 at 2:00 PM

Some importants Notes about App:

1. Name of the Interview App: NYTimes
2. Application Platform/technology: Android JAVA
3. Development Environment: Android Studio 3.1.3
4. Android SDK: Complied and Target SDKs are 27 with Java 1.8
5. Additional Library used: Butterknife 8.8.1, Material Design 27.1.1, Volley(Web service)1.1.0, Gson 2.8.4, Loader animation 1.2.8, Glide    4.7.1, espresso:espresso-core:3.0.2, test:runner:1.0.2

Technical Explantion for this app:
1. Application is designed and developed by following MVC architecture design pattern with Butterknife.
2. Web service integration is customized as per better performance by using Volley 1.1.0 library.
3. handling webservice response data into model classes.
4. Manage Application navigation by Fragment to Fragment so that the screen navigation can perform fast.
5. Screen Navigation completely handling from separate navigation class (NavigationUtils)
6. Common functionality are separated in Utils package like: Utility, Internet connection check, Dialogs, Printing App Logs etc..

Inside App / Functionality of App:
1. Application is contains only two screens.
2. News Listing screen and News Details screen.
3. Loading data from the service and displaying in Recyclerview in News Listing screen.
4. User can search/filter the news data by clicking on Search button on the top title/toolbar.
5. Search/Filter is performed using the days (Todays News, All News of last week, All News of Last month) and the list will be refresh with new searched data.
6. Tapping on any News Item will leads to News Details screen when user can see the News Media, News Publish Date, News Detailed text, News Publish by and If user want to read full news article then just click on blue color text Link "Click here to Read more..."
7. By Clicking on "Click here to Read more...", user can navigate to system external browser where he can view the full article about that news.
8. For loading the server image for news, I have used Glide lib for fast image loading and keep in cache also.


About Test Case:
1. Test cases performed for this app.
2. Created separate Testcase java file in src/androidTest/java/com/android/nytimes/NewsListTest.java
3. How to Run a Test Case: Once you import/open the app in Android Studio then you can find NewsListTest.java file. Inside that class file, there are methods for test case like isInternetAvilale, onNewsItemPressed, isSearchDialogDisplayed etc... Just click on green arrow button on the left side of the test case method name
