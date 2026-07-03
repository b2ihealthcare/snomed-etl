# 📢 We've Moved 📢

B2i Healthcare is now part of IQVIA, and our open-source projects have a new home within the IQVIA GitHub organization.

👉 Please visit: https://github.com/iqvia-hds-oss/snomed-etl

This repository is no longer actively maintained here and is being kept available for historical reference. For the latest source code, releases, issue tracking, and ongoing development, please use the corresponding repository in our new organization.

We'd be delighted to see you there and appreciate your continued interest in our work!

------------------------------------

# snomed-etl

SNOMED CT Expression Template Language Implementation with IDE integration(s), user interface using Xtext.

[![build status](https://img.shields.io/github/actions/workflow/status/b2ihealthcare/snomed-etl/maven.yml?branch=main&style=flat-square)](https://github.com/b2ihealthcare/snomed-etl/actions)
[![latest release](https://img.shields.io/github/tag/b2ihealthcare/snomed-etl.svg?style=flat-square)](https://github.com/b2ihealthcare/snomed-etl/releases/tag/v1.3.8)
[![GitHub](https://img.shields.io/github/license/b2ihealthcare/snomed-etl.svg?style=flat-square)](https://github.com/b2ihealthcare/snomed-etl/blob/main/LICENSE)

# Documentation

See the official documentation [here](http://snomed.org/etl)

# Supported versions

* https://github.com/b2ihealthcare/snomed-etl/releases/tag/v1.4.0 - ETL 1.4.0 (based on ECL 2.2)
* https://github.com/b2ihealthcare/snomed-etl/releases/tag/v1.3.9 - ETL 1.3.9 (based on ECL 2.1)
* https://github.com/b2ihealthcare/snomed-etl/releases/tag/v1.2.0 - ETL 1.2.0 (based on ECL 1.5)
* https://github.com/b2ihealthcare/snomed-etl/releases/tag/v1.0.0 - ETL 1.0.0 (based on ECL 1.4)

# Building from source

SNOMED CT ETL uses Maven for its build system. In order to run the build and create a p2 update site and the maven packages simply run the following command in the cloned directory. 

    ./mvnw clean package

The packages can be found in the `com.b2international.snomed.etl.update/target` folder, when the build is complete.

To run the test cases, use the following command:

    ./mvnw clean verify

# Contributing

Please see [CONTRIBUTING.md](CONTRIBUTING.md) for details.

# Versioning

Our [releases](https://github.com/b2ihealthcare/snomed-etl/releases) use [semantic versioning](http://semver.org). You can find a chronologically ordered list of notable changes in [CHANGELOG.md](CHANGELOG.md).
