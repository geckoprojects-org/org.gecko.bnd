# org.gecko.bnd

This project contains **Bndtools Library** definitions and an Eclipse IDE setup.

You can take a look here about bnd libraries:

[https://bnd.bndtools.org/instructions/library.html](https://bnd.bndtools.org/instructions/library.html)

Beside that, some projects also contain *Bndtools* workspace and/or project templates.

## org.gecko.bnd.dimc.library

Please refer to [DIMC Readme](org.gecko.bnd.dimc.library/readme.md).

This project contains:

* Library **geckoDIMC**
* Workspace Template for Github geckoprojects - setup including sonar build and license check
* Project Templates:
  * **Configurator** - Template for the OSGi Configurator
  * **Library Repackaging** - OSGify external Libraries

## org.gecko.bnd.osgitest.library

Please refer to [OSGi-Test/JUnit5 Readme](org.gecko.bnd.osgitest.library/readme.md).

This project contains:

* Library **geckoOSGi-Test** to enable JUint5 and OSGi-Test dependencies
* Workspace extension to enable JUnit5 Jupiter and OSGi-Test for Gradle builds in bnd-workspace shapes

## org.gecko.bnd.osgitest.project.library

Please also refer to [OSGi-Test Integration Test Readme](org.gecko.bnd.osgitest.project.library/readme.md).

This project contains:

* Library **enableOSGi-Test** for integration test projects and *bndrun*-files
* Project Template for **OSGi-Test** - integration testing

## org.gecko.bnd.jacoco.library

* Library **geckoJacoco** - Enables Jacoco for your OSGi Project. Its adds the agent to the setup

## Eclipse IDE Oomph Setup

Please refer to [Geckoproject Eclipse Oomph Setup Readme](eclipse.oomph/readme.md).

