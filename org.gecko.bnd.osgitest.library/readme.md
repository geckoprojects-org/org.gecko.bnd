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
	<version>1.0.x</version>
</dependency>

org.geckoprojects.bnd:org.gecko.bnd.osgittest.library:1.0.x
```
## Library geckoOSGi-Test

Calling the instruction:

**-library: geckoOSGi-Test**

will enable the setup automatically in Bnd.

A new repository will appear, that includes the OSGi-Test dependencies. In addition to that some pre-configurations are done to ease the use on project level.

### Default behavior

To test a bundle, no matter if simple unit-test or integration test, you have just to create a new project, with the same same name like the bundle you want to test, but with the extension **.tests**.

Example:

You want to test **org.foo.bar**, you have to create a new project called **org.foo.bar.tests**.

In the bnd file of **org.foo.bar.tests** you have just to set **-enable-junit5: true**.

This will make you test bundle a fragment for host **org.foo.bar**. So you see the whole classpath. In addition to that, the build path will be set with all needed dependencies to start testing.

## Project Templates
### OSGi Test Fragment
This project template creates a test fragment for a given bundle. this template works only together with the activates library **-library: geckoOSGi-Test** in you workspace configuration like the *build.bnd*.
Refering to the default behavior section of the chapter above, this template creates a ready to run project. 

You only have to provide the correct project name: `<project.you.want.to.test>.tests`
