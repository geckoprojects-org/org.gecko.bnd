# Bnd DIMC Setup Library

This library brings a default setup for Data In Motion and Gecko Projects in Bndtools.

You simple have to include the Maven Dependency in your setup:

```
<dependency>
	<groupId>org.geckoprojects.bnd</groupId>
	<artifactId>org.gecko.bnd.dimc.library</artifactId>
	<version>1.0.0</version>
</dependency>

org.geckoprojects.bnd:org.gecko.bnd.dimc.library:1.0.0
```

Calling the instruction:

**-library: gecko-dimc**

will enable the setup automatically in Bnd.

A new DIM release repository will appear. It refers to the Data In Motion Nexus. 

In addition to that some pre-configurations are done to ease the use on project level. Defaults for the Manifests are set as well as license including.

## Default behavior

There are some mandatory properties to be set:

**github-project:** - The name of the GitHub Repository e.g. **github-project: org.gecko.emf.osgi**
**base-version:** - The default Bundle Version that is used, e.g. **base-version: 1.2.3.SNAPSHOT**

You should provide these information in your **build.bnd**, when this library is enabled.

## Releasing

If you want to release SNAPSHOTS just call:

**gradlew clean release**

This will release all artifacts into the **cnf/release** folder.

If you want to release final versions just call:

**gradlew clean release -Drelease.dir=cnf/release**

This will release all artifacts into the provided folder.

This setup also contains a configuration for automatically releasing snapshot to Maven Central Snapshots and Releases to the Staging repositories.

This action can only be triggered from our internal Jenkins instance.

