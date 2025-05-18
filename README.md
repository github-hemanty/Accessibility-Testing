# Accessibility-Testing

This project demonstrates how to integrate the Axe accessibility engine with Selenium WebDriver using Java, enabling automated detection of accessibility issues in web applications.

🛠️ Key Features
Automated Accessibility Scans: Utilize Axe to perform comprehensive scans of web pages, identifying issues related to color contrast, ARIA attributes, form labels, headings, and more, in accordance with WCAG 2.0 guidelines.

Seamless Integration: Incorporate Axe into your existing Selenium test suites, allowing for simultaneous functional and accessibility testing.

Detailed Reporting: Generate JSON reports highlighting violations, complete with descriptions and suggestions for remediation.


#Sample output for Amazon

java.lang.AssertionError: Found 6 accessibility violations:
1) Elements must have sufficient color contrast: https://dequeuniversity.com/rules/axe/3.1/color-contrast?application=axeAPI
   a) [".a-color-secondary"]
   Fix any of the following:
   Element has insufficient color contrast of 3.54 (foreground color: #888888, background color: #ffffff, font size: 8.3pt, font weight: normal). Expected contrast ratio of 4.5:1


2) Images must have alternate text: https://dequeuniversity.com/rules/axe/3.1/image-alt?application=axeAPI

   a) [".a-text-center.a-row > img"]
   Fix any of the following:
   Element does not have an alt attribute
   aria-label attribute does not exist or is empty
   aria-labelledby attribute does not exist, references elements that do not exist or references elements that are empty
   Element has no title attribute or the title attribute is empty
   Element's default semantics were not overridden with role="presentation"
   Element's default semantics were not overridden with role="none"

   b) [".a-color-secondary > img"]
   Fix any of the following:
   Element does not have an alt attribute
   aria-label attribute does not exist or is empty
   aria-labelledby attribute does not exist, references elements that do not exist or references elements that are empty
   Element has no title attribute or the title attribute is empty
   Element's default semantics were not overridden with role="presentation"
   Element's default semantics were not overridden with role="none"


3) Form elements must have labels: https://dequeuniversity.com/rules/axe/3.1/label?application=axeAPI
   a) ["#captchacharacters"]
   Fix any of the following:
   aria-label attribute does not exist or is empty
   aria-labelledby attribute does not exist, references elements that do not exist or references elements that are empty
   Form element does not have an implicit (wrapped) <label>
   Form element does not have an explicit <label>
   Element has no title attribute or the title attribute is empty


4) Page must have one main landmark: https://dequeuniversity.com/rules/axe/3.1/landmark-one-main?application=axeAPI
   a) ["html"]
   Fix all of the following:
   Page does not have a main landmark


5) Page must contain a level-one heading: https://dequeuniversity.com/rules/axe/3.1/page-has-heading-one?application=axeAPI
   a) ["html"]
   Fix all of the following:
   Page must have a level-one heading


6) All page content must be contained by landmarks: https://dequeuniversity.com/rules/axe/3.1/region?application=axeAPI
   a) ["html"]
   Fix any of the following:
   Some page content is not contained by landmarks
