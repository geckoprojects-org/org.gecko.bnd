# initial setup

- Create a empty [GitHub repository](https://github.com/organizations/geckoprojects-org/repositories/new)
  - Name: `€€project-symbolic-name€€
  - DO NOT!!! use any DEFAULTS like README or license

- do the [Sonar Configuration](https://sonarcloud.io/organizations/geckoprojects-org/projects)
  - press `+`_(upper right)_ - Analyze new project
  - check `€€project-symbolic-name€€` and `SetUp`
  - Select `with a GitHub Action`
  - Copy the `SONAR_TOKEN` to notepad
  - NOT!!!! follow the description .about `github/workflows/build.yml`. _this still [exists](../blob/main/.github/workflows/sonar.yml) in this template._
  - Project-Settings -> Secrets -> [New Repository Secrets](Link: https://github.com/geckoprojects-org/€€project-symbolic-name€€/settings/secrets/actions/new)
    - add `SONAR_TOKEN`

- execute this in your local folder
git init
git add .
git commit -m "initial commit"
git branch -M main
git remote add origin git@github.com:geckoprojects-org/€€project-symbolic-name€€.git
git push -u origin main

- Branches
  - create a `snapshot` branche `git checkout -b snapshot && git push --set-upstream origin snapshot`
  - Secure using Setting
    - Branches - [add rule](https://github.com/geckoprojects-org/€€project-symbolic-name€€/settings/branch_protection_rules/new)
      - Branch name pattern: `[ms][an][ia][np]*` `(ugly but works, protects 'main*' and 'snap*' by charachter )`
      - Require pull request reviews before merging
        - 1 reviewer
        - Dismiss stale pull request approvals when new commits are pushed
      - Require status checks to pass before merging
        - Require branches to be up to date before merging
      - Require linear history
      - Include administrators
      - NOT!!! Allow force pushes
      - NOT!!! Allow deletion

- Jenkis
   - https://devel.data-in-motion.biz/jenkins/ 
   - wait up to 15 minutes for the auto-import

