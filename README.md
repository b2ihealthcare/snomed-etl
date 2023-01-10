# snomed-etl

SNOMED CT Expression Template Language Implementation with IDE integration(s), user interface using Xtext.

[![build status](https://img.shields.io/github/actions/workflow/status/b2ihealthcare/snomed-etl/maven.yml?branch=main&style=flat-square)](https://github.com/b2ihealthcare/snomed-etl/actions)
[![latest release](https://img.shields.io/github/tag/b2ihealthcare/snomed-etl.svg?style=flat-square)](https://github.com/b2ihealthcare/snomed-etl/releases/tag/v1.3.6)
[![GitHub](https://img.shields.io/github/license/b2ihealthcare/snomed-etl.svg?style=flat-square)](https://github.com/b2ihealthcare/snomed-etl/blob/main/LICENSE)

# Documentation

See the official documentation [here](http://snomed.org/etl)

# Supported versions

* https://github.com/b2ihealthcare/snomed-etl/releases/tag/v1.3.6 - ETL 1.3.5 (based on ECL 2.1)
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
