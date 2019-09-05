# Google Cloud Build Demo

## Build the project without Docker daemon

```bash
$ mvn clean install jib:build -Dimage=eu.gcr.io/learning-cloud-build-251912/cloud-build-demo
```

## Build with Docker daemon

```bash
$ mvn clean install jib:dockerBuild -Dimage=altfatterz/docker-jib-demo
```

## Start a new build

```bash
$ gcloud builds submit
```

## Caching Maven dependencies

## Caching Jib layers

Use the `-Djib.baseImageCache=$HOME/.cache/google-cloud-tools-java/jib`

The `$HOME/.cache/google-cloud-tools-java/jib` will contain the cached layers.

This folder should be shared between multiple images.

## Building and debugging locally

https://cloud.google.com/cloud-build/docs/build-debug-locally

## Triggers

## Deploying

