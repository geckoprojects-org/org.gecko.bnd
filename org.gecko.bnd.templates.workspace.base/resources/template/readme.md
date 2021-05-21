[![CI Build](https://github.com/geckoprojects-org/€€project-symbolic-name€€/actions/workflows/build.yml/badge.svg)](https://github.com/geckoprojects-org/€€project-symbolic-name€€/actions/workflows/build.yml)[![License](https://github.com/geckoprojects-org/€€project-symbolic-name€€/actions/workflows/license.yml/badge.svg)](https://github.com/geckoprojects-org/€€project-symbolic-name€€/actions/workflows/license.yml )[![Sonar](https://github.com/geckoprojects-org/€€project-symbolic-name€€/actions/workflows/sonar.yml/badge.svg)](https://github.com/geckoprojects-org/€€project-symbolic-name€€/actions/workflows/sonar.yml )[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_€€project-symbolic-name€€&metric=bugs)](https://sonarcloud.io/dashboard?id=geckoprojects-org_€€project-symbolic-name€€)[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_€€project-symbolic-name€€&metric=code_smells)](https://sonarcloud.io/dashboard?id=geckoprojects-org_€€project-symbolic-name€€)[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_€€project-symbolic-name€€&metric=coverage)](https://sonarcloud.io/dashboard?id=geckoprojects-org_€€project-symbolic-name€€)[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_€€project-symbolic-name€€&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=geckoprojects-org_€€project-symbolic-name€€)[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_€€project-symbolic-name€€&metric=alert_status)](https://sonarcloud.io/dashboard?id=geckoprojects-org_€€project-symbolic-name€€)[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_€€project-symbolic-name€€&metric=reliability_rating)](https://sonarcloud.io/dashboard?id=geckoprojects-org_€€project-symbolic-name€€)[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_€€project-symbolic-name€€&metric=security_rating)](https://sonarcloud.io/dashboard?id=geckoprojects-org_€€project-symbolic-name€€)[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_€€project-symbolic-name€€&metric=sqale_index)](https://sonarcloud.io/dashboard?id=geckoprojects-org_€€project-symbolic-name€€)[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=geckoprojects-org_€€project-symbolic-name€€&metric=vulnerabilities)](https://sonarcloud.io/dashboard?id=geckoprojects-org_€€project-symbolic-name€€)

# €€project-symbolic-name€€


## initial setup

Copy this to an new Issue in your Project

`initial Setup`

```

- [ ] do the [Sonar Configuration](https://sonarcloud.io/organizations/geckoprojects-org/projects)
  - [ ] press `+`_(upper right)_ - Analyze new project
  - [ ] check `€€project-symbolic-name€€` and `SetUp`
  - [ ] Select `with a GitHub Action`
  - [ ] Copy the `SONAR_TOKEN`
  - [ ] NOT!!!! follow the description .about `github/workflows/build.yml`. _this still [exists](../blob/main/.github/workflows/sonar.yml) in this template._
  - [ ] Project-Settings -  Secrets - New Repository Secrets - add `SONAR_TOKEN`

- [ ] Branches
  - [ ] create a `snapshot` branche `git checkout -b snapshot && git push --set-upstream origin snapshot`
  - [ ] Secure using Setting
    - [ ] Branches - add rule
      - [ ] Branch name pattern: `[ms][an][ia][np]*` `(ugly but works, protects 'main*' and 'snap*' by charachter )`
      - [ ] Require pull request reviews before merging
        - [ ] 1 reviewer
        - [ ] Dismiss stale pull request approvals when new commits are pushed
      - [ ] Require status checks to pass before merging
        - [ ] Require branches to be up to date before merging
      - [ ] Require linear history
      - [ ] Include administrators
      - [ ] NOT!!! Allow force pushes
      - [ ] NOT!!! Allow deletion

- [ ] Jenkis
   - [ ] https://devel.data-in-motion.biz/jenkins/ 
   - [ ] wait up to 15 minutes for the auto-import

```

## Links

* [Documentation](https://github.com/geckoprojects-org/€€project-symbolic-name€€)
* [Source Code](https://github.com/geckoprojects-org/€€project-symbolic-name€€) (clone with `scm:git:git@github.com:geckoprojects-org/€€project-symbolic-name€€.git`)


## Developers

* **Juergen Albert** (jalbert) / [j.albert@data-in-motion.biz](mailto:j.albert@data-in-motion.biz) @ [Data In Motion](https://www.datainmotion.de) - *architect*, *developer*
* **Mark Hoffmann** (mhoffmann) / [m.hoffmann@data-in-motion.biz](mailto:m.hoffmann@data-in-motion.biz) @ [Data In Motion](https://www.datainmotion.de) - *developer*, *architect*

## Licenses

**Apache License 2.0**

## Copyright

Data In Motion Consuling GmbH - All rights reserved

---
Data In Motion Consuling GmbH - [info@data-in-motion.biz](mailto:info@data-in-motion.biz)
