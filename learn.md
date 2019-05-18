- 2019-05-18, meh, Object-Oriented Programmming is Bad, https://www.youtube.com/watch?v=QM1iUe6IofM
  - Code 'patterns' are a bandage for limitations/weaknesses of a framework/language (common knowledge, this is said by others too)
- 2019-05-17, good, Delightful Delegate Design - Márton Braun (Kotlin Budapest meetup 2019-04-11), https://www.youtube.com/watch?v=jTmHNo48zs0
- 2019-05-09, meh, Secure Coding: Preventing Insufficient Logging and Monitoring, https://app.pluralsight.com/library/courses/secure-coding-preventing-insufficient-logging-monitoring/table-of-contents
  - Don't log too much data, but make sure there is enough to catch attackers
  - A user trying different passwords may just be somebody that forgot their password, but when also trying different user names, then that's a bigger hint to an attacker
- 2019-05-09, okay, Play by Play: OWASP Top 10 2017, https://app.pluralsight.com/library/courses/play-by-play-owasp-top-ten-2017/table-of-contents
  - OWASP: Open Web Application Security Project
  - A1 - Injection: SQL Injections, NoSQL Injection. We need better frameworks to help prevent this.
  - A2 - Broken Authentication: There have been many account/password hacks/leaks. We need to get to a place past passwords. Blacklist breached passwords.
  - A3 - Sensitive Data Exposure: Equifax. The combination of data, like: name, address, phone number, password, 
  - A4 - XML External Entities (XXE): New frameworks disable this by default. We need more DAST (dynamic scanning) and SAST (source code analysis). 
  - A5 - Broken Access Control: For example, change a number in the URL to access somebody else's data
  - A6 - Security Misconfiguration: "Passive-finding", aka without hacking. We need more scripts in CI/CD to auto-test
  - A7 - Cross-Site Scripting (XSS): Frameworks are helping us more to prevent this
  - A8 - Insecure Deserialization: Intercepting/changing data going between client and server, aka remote-command execution. Don't blindly run any code that can touched by external.
  - A9 - Using Components with Known Vulnerabilities: Some dependencies may have vulnerabilities. Need to automatically check NIST for vulnerabilities, and break builds.
  - A10 - Insufficient Logging & Monitoring: We need more automatic reporting
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












