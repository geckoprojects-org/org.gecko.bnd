# Bnd OSGi-Test Support

This library brings a default setup to use OSGi Test in Bndtools.

You can find the project here:
https://github.com/osgi/osgi-test

It uses AssertJ, JUnit5 and also brings dependencies to Mockito.

You simple have to include the Maven Dependency in your setup:

```
<dependency>
	<groupId>org.geckoprojects.bnd</groupId>
	<artifactId>org.gecko.bnd.osgittest.library</artifactId>
	<version>1.2.x</version>
</dependency>

org.geckoprojects.bnd:org.gecko.bnd.osgittest.library:1.2.x
```
## Library geckoOSGi-Test

Calling the instruction:

**-library: geckoOSGi-Test**

will enable the dependency setup automatically in Bnd.

A new repository will appear, that includes the OSGi-Test dependencies. In addition to that, some pre-configurations are done regarding setting a general test path for projects.

### Default behavior

For ordinary unit testing in your project. You do not to do anything. JUnit5 testing is already configured.

This library brings also the dependency *org.gecko.bnd.osgittest.project.library*. This is also a library on top and contains project templates for JUnit5 / OSGi-Test enabled integration test projects.


## OSGi-Test Project Template

This project template creates an integration test project for a given bundle. It contains support for the OSGi-Test project and JUnit5 / Jupiter. It contains the configuration to run the integration tests with gradle, based on a bndrun-setup. 

For that it brings a *build.gradle* file that, activates that. Otherwise the task *testOSGi* will look into the *bnd.bnd* and try to run that.

this template works only together with the activated library **-library: enableOSGi-Test** in your project configuration set in the *bnd.bnd*.

Refering to the default behavior section of the chapter above, this template creates a ready to run project. 

## Gradle OSGi-Test Workspace Template

To enable JUnit5 and OSGi-Test testing on projects that are not based on the **geckoDIMC** library workspace, you have to enable JUnit5 testing for sub-projects in gradle. For that you need to modify the *build.gradle* in you workspace:

```



