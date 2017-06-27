
## Purpose

The purpose of this demo project is to show the structure of BDD automation tests using Cucumber.
The scenarios which are found into the project are tested on an emulator, and are based for the following website:
http://www.iliketofu.eu/

## Folder structure

test/java/package/base - This folder contains the class for initialization of the driver, and reading the configuration for
the Appium driver stored into the config_app.properties.

test/java/package/pages/ - This folder contains the logic for manipulating the elements on each screen.

test/java/package/steps/ - This folder contains the step definitions of the scenarios defined in the feature file.

test/java/package/RunTest - Runner for the cucumber scenario/s.

test/resources/feature - This folder contains the feature files in which the scenarios are defined.

/test/resources/config_app_android.properties - This file contains the parameters required for initialization of the android driver.
/test/resources/config_app_ios.properties - This file contains the parameters required for initialization of the iOS driver.

The full list of parameters for the Appium Android driver can be fond on the following link: http://appium.io/slate/en/master/?java#android-only
The full list of parameters for the Appium iOS driver can be found on the following link: http://appium.io/slate/en/master/?java#ios-only-using-xcuitest

## Good luck with your automation testing