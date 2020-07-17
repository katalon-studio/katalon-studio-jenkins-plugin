# Katalon TestOps Plugin for Jenkins

> Katalon TestOps CI is the easier way to execute or schedule remote Katalon Studio executions. [Learn more](https://docs.katalon.com/katalon-analytics/docs/kt-remote-execution.html)

Katalon TestOps Plugin for Jenkins helps execute Katalon Studio in Jenkins easily.
Katalon Studio will be downloaded and deployed automatically.

> For Jenkins Pipeline, please use the official Docker image for Katalon Studio.
> Sample Jenkinsfile can be found [here](https://github.com/katalon-studio-samples/ci-samples/blob/master/Jenkinsfile).

## Companion products

### Katalon TestOps

[Katalon TestOps](https://analytics.katalon.com) is a web-based application that provides dynamic perspectives and an insightful look at your automation testing data. You can leverage your automation testing data by transforming and visualizing your data; analyzing test results; seamlessly integrating with such tools as Katalon Studio and Jira; maximizing the testing capacity with remote execution.

* Read our [documentation](https://docs.katalon.com/katalon-analytics/docs/overview.html).
* Ask a question on [Forum](https://forum.katalon.com/categories/katalon-analytics).
* Request a new feature on [GitHub](CONTRIBUTING.md).
* Vote for [Popular Feature Requests](https://github.com/katalon-analytics/katalon-analytics/issues?q=is%3Aopen+is%3Aissue+label%3Afeature-request+sort%3Areactions-%2B1-desc).
* File a bug in [GitHub Issues](https://github.com/katalon-analytics/katalon-analytics/issues).

### Katalon Studio
[Katalon Studio](https://www.katalon.com) is a free and complete automation testing solution for Web, Mobile, and API testing with modern methodologies (Data-Driven Testing, TDD/BDD, Page Object Model, etc.) as well as advanced integration (JIRA, qTest, Slack, CI, Katalon TestOps, etc.). Learn more about [Katalon Studio features](https://www.katalon.com/features/).

## Tutorials

[How to use Katalon plugin for Jenkins on Windows](https://forum.katalon.com/t/how-to-use-katalon-plugin-for-jenkins-on-windows/20326).

[How to use Katalon plugin for Jenkins on Ubuntu](https://forum.katalon.com/t/run-katalon-studio-tests-with-jenkins-on-a-headless-ubuntu-machine/17790).

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
