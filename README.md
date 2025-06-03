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

## Maven Central Release

We have an account for [Maven Central Repository](https://central.sonatype.com/). As the 

The URL to publish SNAPSHOTS is [https://central.sonatype.com/repository/maven-snapshots/](https://central.sonatype.com/repository/maven-snapshots/). You can find the documentation for SNAPSHOTS here: [https://central.sonatype.org/publish/publish-portal-snapshots/#enabling-snapshot-releases-for-your-namespace](https://central.sonatype.org/publish/publish-portal-snapshots/#enabling-snapshot-releases-for-your-namespace).

The STaging URL to publish releases is: [https://ossrh-staging-api.central.sonatype.com/service/local/staging/deploy/maven2/](https://ossrh-staging-api.central.sonatype.com/service/local/staging/deploy/maven2/) This is an API that is just for migration purposes and documented here [https://central.sonatype.org/publish/publish-portal-ossrh-staging-api/#plugins-tested-for-compatibility](https://central.sonatype.org/publish/publish-portal-ossrh-staging-api/#plugins-tested-for-compatibility)

This URL is configured in the `releng/central.bnd` file.

The upload of all artifacts works as usual with bnd, using this URL’s. The deployment of the artifacts into central is now different.

We have to go to the OpenAPI of [Central Sonatype Staging Portal](https://ossrh-staging-api.central.sonatype.com/swagger-ui/#/default/manual_search_repositories) and use the manual repository search. First we have to authorize ourselfs with a username password base64 hash, you can get from the project management.

For the call itself, provide the following parameters:

* **profile_id = org.geckoprojects**
* **state = open**
* **ip = any**

Or you can call it on the console:

```bash
curl -X 'GET' \
  'https://ossrh-staging-api.central.sonatype.com/manual/search/repositories?profile_id=org.geckoprojects&state=open&ip=any' \
  -H 'accept: application/json' \
  -H 'Authorization: Bearer <OUR-USER-PASSWORD-BASE64-TOKEN>'
```



You get a result like this:

```json
{
  "repositories": [
    {
      "key": "rMTSmvh0/93.239.101.247/org.geckoprojects--default-repository",
      "state": "open",
      "portal_deployment_id": null
    }
  ]
}
```

The **key** VALUE is important: *rMTSmvh0/93.239.101.247/org.geckoprojects--default-repository*. This is the staging repository id. To transfer the artifacts to central, we can use the [Repository Upload](https://ossrh-staging-api.central.sonatype.com/swagger-ui/#/default/manual_upload_repository) callback. You have to provide the parameters:

* **repository_key = rMTSmvh0/93.239.101.247/org.geckoprojects--default-repository**
* **publishing_type = automatic**

After that you should see the artifacts in The [Central Deployment Portal](https://central.sonatype.com/publishing/deployments) and later at Maven Central
