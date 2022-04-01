# Bnd DIMC Setup Library

This library brings a default setup for Data In Motion and Gecko Projects in Bndtools.

You simple have to include the Maven Dependency in your setup:

```
<dependency>
	<groupId>org.geckoprojects.bnd</groupId>
	<artifactId>org.gecko.bnd.dimc.library</artifactId>
	<version>1.0.x</version>
</dependency>

org.geckoprojects.bnd:org.gecko.bnd.dimc.library:1.0.x
```

## Workspace Template
This project contains a workspace extension to Bndworkspace that addes a special *build.gradle*, that can be used with OSGi Tests. It deactivates the original *Gradle* task **testOSGi** and replaces it by the new **itest** task. This is then used for the new OSGi Tests with Junit5.
The setup also contains some files for the github actions and the Jenkinsfile for the Data In Motion Jenkins. Sonarcube checks and License header checks are also activated.

## Project Templates
### Configurator

There is a project template to create a configuration project using the OSGi Configurator. It creates a simple configuration Json and the *bnd.bnd* file with al declarations.

### Library Repackaging

There is an project template to OSGify external libraries and their sources in *bndtools*. The template wizard asks for the GAV Coordinates of the artifact to be OSGified. The templates also includes sources jars

**REMEMBER** You have to add the provided GAV for your artifact `<g>:<a>:<v>` and its source `<g>:<a>:jar.source:<v>` to one of your repositories


## Library - geckoDIMC 

Calling the instruction:

**-library: geckoDIMC**

will enable the setup automatically in Bnd.

A new DIM release repository will appear. It refers to the Data In Motion Nexus. 

In addition to that some pre-configurations are done to ease the use on project level. Defaults for the Manifests are set as well as license including.

### Default behavior

There are some mandatory properties to be set:

**github-project:** - The name of the GitHub Repository e.g. **github-project: org.gecko.emf.osgi**
**base-version:** - The default Bundle Version that is used, e.g. **base-version: 1.2.3.SNAPSHOT**

You should provide these information in your **build.bnd**, when this library is enabled.

### Releasing

If you want to release SNAPSHOTS just call:

**gradlew clean release**

This will release all artifacts into the **cnf/release** folder.

If you want to release final versions just call:

**gradlew clean release -Drelease.dir=cnf/release**

This will release all artifacts into the provided folder.

This setup also contains a configuration for automatically releasing snapshot to Maven Central Snapshots and Releases to the Staging repositories.

This action can only be triggered from our internal Jenkins instance.

