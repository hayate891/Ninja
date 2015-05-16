Ninja
===

![background.png](/Art/screenshot/en/background.png "background.png")

A web browser that open links in background without ever leaving your favorite apps.

[Ninja in Google Play](https://play.google.com/store/apps/details?id=io.github.mthli.Ninja "Ninja in Google Play")

[Download latest Ninja.apk](https://github.com/mthli/Ninja/releases/download/v1.1.2/Ninja.1.1.2.apk "Ninja.1.1.2.apk")

__SUPPORT: Android 4.1+__

__LONG TERM MAINTENANCE.__

## Features:

 - Open links in background without ever leaving your favorite apps.

 - Lightweight and no extra permissions.

 - [html5test](html5test.com "html5test.com") access __509__ with latest [Android System WebView](https://play.google.com/store/apps/details?id=com.google.android.webview "Android System WebView").

 - Adblock.

 - Capture whole page screenshot.

 - Change brightness.

 - Fashion tab switcher.

 - Webpage go to top easy.

 - More features coming soon...

## How to use Ninja?

Basically Ninja is a simple web browser like any others, but there are some different things you need to know:

### Load in background:

 1. Set Ninja as your __default browser__ when click links.

 2. __Single tap__ will open links in background, and show a __clickable__ notification in statusbar.

 3. __Double taps__ will show a dialog that allows you to open links in foreground, etc.

### Switch tabs:

![tab_switcher_header.png](/Art/screenshot/en/tab_switcher_header.png "tab_switcher_header.png")

 - Press the __address bar__ and __drag it down__, then the fashion tab switcher will display.

 - __Swipe up/down__ to dismiss a page.

 - __Remember__ that if the soft keyboard is shown the tab switcher would not display, it's our design :)

## Q&A:

### Why no incognito mode?

Incognito mode is a necessary feature for a web browser, but since `WebView(Context context, AttributeSet attrs, int defStyleAttr, boolean privateBrowsing)` was __deprecated__ in API level 17 and no longer supported, the incognito mode is __conflict__ with our UI design, so we stop it(but maybe restart to develop it someday). If you want to add incognito mode you can fork our sourse code and do it by yourself :)

### What can I do for Ninja?

 - New design launcher icon(must be 512px * 512px).

 - Translate `ninja_introduction_en.md` at [this link](https://github.com/mthli/Ninja/blob/master/Ninja/assets/ninja_introduction_en.md "ninja_introduction_en.md")

 - Translate `strings.xml` at [this link](https://github.com/mthli/Ninja/blob/master/Ninja/res/values/strings.xml "strings.xml").

 - Fork and pull request is welcome all time :)

## How to use the source code?

Just import the `Ninja` folder with your __IntelliJ IDEA__.

## Thanks:

 - [AndroidSlidingUpPanel](https://github.com/umano/AndroidSlidingUpPanel "AndroidSlidingUpPanel")

 - [Android Swipe-to-Dismiss Sample Code](https://github.com/romannurik/Android-SwipeToDismiss "Android Swipe-to-Dismiss Sample Code")

 - [android-ago](https://github.com/curioustechizen/android-ago "android-ago")

 - [Lightning Browser](https://github.com/anthonycr/Lightning-Browser "Lightning-Browser")

## License:

_[Apache License, Version 2.0](https://github.com/mthli/Ninja/blob/master/LICENSE "Apache License, Version 2.0")_
