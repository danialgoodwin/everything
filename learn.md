- 2019-05-09, good, Play by Play: Modern Web Security Patterns, https://app.pluralsight.com/library/courses/play-by-play-modern-web-security-patterns/table-of-contents
  - With host Troy Hunt, creator of haveibeenpwned.com
  - Case study: A common Javascript library was maliciously updated with a crypto-miner (CoinHive)
  - When using a CDN (or external script), include an 'integrity' hash so that content will only be used if it is same as expected (see bottom of source for view-source:https://haveibeenpwned.com/)
    - Use caniuse.com for 'SRI' to see which browsers support this feature
  - CSP: Whitelist sites that can be used. Done via a meta tag in head: `<meta http-equiv="Content-Security-Polity" content="default-src 'none'; connect-src ...; font-src 'self'; frame-src ...; img-src ...; script-src 'self' ..." />`
    - Has ability to report URI to a specified address, aka report issues to site owner. But, can't do with meta tag unfortunately. Example service that will do it: https://report-uri.com/
  - Cross-site scripting (XSS): Protection in browsers is different
  - Certificate Authority (CA): 
  - CAA much better than HPKP
  - Add automatic reporting
  - Do it! Add .well-known/security.txt that has contact informtation related to security issues. See https://securitytxt.org/
- 2019-05-08, meh, Build a Modular Android App Architecture (Google I/O'19), https://www.youtube.com/watch?v=PZBg5DIzNww
- 2019-05-08, ok, What's New in Android (Google I/O'19), https://www.youtube.com/watch?v=td3Kd7fOROw
  - Bubbles: Clickable circle global overlay, aka floating Activity. Full developer preview in API 29
  - System-wide dark theme. Use themes: Theme.AppCompat.DayNight, Theme.DeviceDefault.DayNight
  - Preferences: Deprecated. Use Jetpack Preferences
  - Jetpack Compose: UI via Kotlin, similar to Flutter building UIs, aka no XML
  - Kotlin-first, CameraX (replaces Camera and Camera2), Security, Architecture Components, Jetpack Preferences, 
  - No more 'findViewById(...)'
  - Privacy: External Storage, Location, Background Activity Starts, Camera, Connectivity, 












