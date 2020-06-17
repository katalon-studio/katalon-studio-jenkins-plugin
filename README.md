# Katalon TestOps Plugin for Jenkins

Katalon TestOps Plugin for Jenkins helps execute Katalon Studio in Jenkins easily.
Katalon Studio will be downloaded and deployed automatically.

> For Jenkins Pipeline, please use the official Docker image for Katalon Studio.
> Sample Jenkinsfile can be found [here](https://github.com/katalon-studio-samples/ci-samples/blob/master/Jenkinsfile).

## Usage

* Install the plugin.

* Go to project *Configure* > *Build* > *Add build step* > *Execute Katalon Studio Tests*.

* Provide the desired Katalon Studio version and command arguments.

* Save the configuration.

Optionally, you can tell Jenkins to publish the JUnit reports.

* Go to *Add post-build action* > *Publish JUnit test result report*.

* Set the value *Test report XMLs* to *Reports/**/JUnit_Report.xml*.

* *Latest Test Result* will be shown in the project page after every build.

## Development

Use the command `mvn clean hpi:run -Djetty.port=8090` to debug the plugin.

See the instructions at https://wiki.jenkins.io/display/JENKINS/Plugin+tutorial.